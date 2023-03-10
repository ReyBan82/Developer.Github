/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.facebook.thrift.protocol;

import com.facebook.thrift.TByteArrayOutputStream;
import com.facebook.thrift.TException;
import com.facebook.thrift.transport.TTransport;
import com.facebook.thrift.utils.StandardCharsets;
import java.util.Stack;

/**
 * Base class for full and brief JSON protocols. Simple JSON protocol has subtle differences and
 * doesn't use it.
 */
public abstract class TJSONProtocolBase extends TProtocol {
  protected static final byte[] COMMA = new byte[] {','};
  protected static final byte[] COLON = new byte[] {':'};
  protected static final byte[] LBRACE = new byte[] {'{'};
  protected static final byte[] RBRACE = new byte[] {'}'};
  protected static final byte[] LBRACKET = new byte[] {'['};
  protected static final byte[] RBRACKET = new byte[] {']'};
  protected static final byte[] QUOTE = new byte[] {'"'};
  protected static final byte[] BACKSLASH = new byte[] {'\\'};
  protected static final byte[] ZERO = new byte[] {'0'};

  protected static final byte[] ESCSEQ = new byte[] {'\\', 'u', '0', '0'};

  protected static final long VERSION = 1;

  protected static final byte[] JSON_CHAR_TABLE = {
    /*  0   1   2   3   4   5   6   7   8   9   A   B   C   D   E   F */
    0, 0, 0, 0, 0, 0, 0, 0, 'b', 't', 'n', 0, 'f', 'r', 0, 0, // 0
    0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, // 1
    1, 1, '"', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, // 2
  };

  protected static final String ESCAPE_CHARS = "\"\\bfnrt";

  protected static final byte[] ESCAPE_CHAR_VALS = {
    '"', '\\', '\b', '\f', '\n', '\r', '\t',
  };

  protected static final int DEF_STRING_SIZE = 16;

  protected static final byte[] NAME_BOOL = new byte[] {'t', 'f'};
  protected static final byte[] NAME_BYTE = new byte[] {'i', '8'};
  protected static final byte[] NAME_I16 = new byte[] {'i', '1', '6'};
  protected static final byte[] NAME_I32 = new byte[] {'i', '3', '2'};
  protected static final byte[] NAME_I64 = new byte[] {'i', '6', '4'};
  protected static final byte[] NAME_DOUBLE = new byte[] {'d', 'b', 'l'};
  protected static final byte[] NAME_FLOAT = new byte[] {'f', 'l', 't'};
  protected static final byte[] NAME_STRUCT = new byte[] {'r', 'e', 'c'};
  protected static final byte[] NAME_STRING = new byte[] {'s', 't', 'r'};
  protected static final byte[] NAME_MAP = new byte[] {'m', 'a', 'p'};
  protected static final byte[] NAME_LIST = new byte[] {'l', 's', 't'};
  protected static final byte[] NAME_SET = new byte[] {'s', 'e', 't'};

  protected static final byte[] VALUE_TRUE = new byte[] {'t', 'r', 'u', 'e'};
  protected static final byte[] VALUE_FALSE = new byte[] {'f', 'a', 'l', 's', 'e'};

  protected static final TStruct ANONYMOUS_STRUCT = new TStruct();

  protected static final byte[] getTypeNameForTypeID(byte typeID) throws TException {
    switch (typeID) {
      case TType.BOOL:
        return NAME_BOOL;
      case TType.BYTE:
        return NAME_BYTE;
      case TType.I16:
        return NAME_I16;
      case TType.I32:
        return NAME_I32;
      case TType.I64:
        return NAME_I64;
      case TType.DOUBLE:
        return NAME_DOUBLE;
      case TType.FLOAT:
        return NAME_FLOAT;
      case TType.STRING:
        return NAME_STRING;
      case TType.STRUCT:
        return NAME_STRUCT;
      case TType.MAP:
        return NAME_MAP;
      case TType.SET:
        return NAME_SET;
      case TType.LIST:
        return NAME_LIST;
      default:
        throw new TProtocolException(TProtocolException.NOT_IMPLEMENTED, "Unrecognized type");
    }
  }

  protected static final byte getTypeIDForTypeName(byte[] name) throws TException {
    byte result = TType.STOP;
    if (name.length > 1) {
      switch (name[0]) {
        case 'd':
          result = TType.DOUBLE;
          break;
        case 'f':
          result = TType.FLOAT;
          break;
        case 'i':
          switch (name[1]) {
            case '8':
              result = TType.BYTE;
              break;
            case '1':
              result = TType.I16;
              break;
            case '3':
              result = TType.I32;
              break;
            case '6':
              result = TType.I64;
              break;
          }
          break;
        case 'l':
          result = TType.LIST;
          break;
        case 'm':
          result = TType.MAP;
          break;
        case 'r':
          result = TType.STRUCT;
          break;
        case 's':
          if (name[1] == 't') {
            result = TType.STRING;
          } else if (name[1] == 'e') {
            result = TType.SET;
          }
          break;
        case 't':
          result = TType.BOOL;
          break;
      }
    }
    if (result == TType.STOP) {
      throw new TProtocolException(TProtocolException.NOT_IMPLEMENTED, "Unrecognized type");
    }
    return result;
  }

  /**
   * Given a byte, peeked from the beginning of some JSON value, determine a type of that value.
   * Result type is used to decide how to skip that value, so differences between compatible types
   * don't matter and the more general type is assumed. STOP is returned for } and ] to indicate end
   * of collection.
   */
  protected static final byte getTypeIDForPeekedByte(byte peekedByte) throws TException {
    switch (peekedByte) {
      case '}':
      case ']':
        return TType.STOP;

      case '{':
        return TType.STRUCT;

      case '[':
        return TType.LIST;

      case 't':
      case 'f':
        return TType.BOOL;

      case '+':
      case '-':
      case '.':
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        return TType.DOUBLE;

      case '"':
        return TType.STRING;

      default:
        throw new TProtocolException(
            TProtocolException.NOT_IMPLEMENTED, "Unrecognized peeked byte: " + (char) peekedByte);
    }
  }

  // Base class for tracking JSON contexts that may require inserting/reading
  // additional JSON syntax characters
  // This base context does nothing.
  protected class JSONBaseContext {
    protected void write() throws TException {}

    protected void read() throws TException {}

    /** Peek the first byte of the following value in the stream. */
    protected byte peekNextValue() throws TException {
      return reader_.peek();
    }

    protected boolean escapeNum() {
      return false;
    }
  }

  // Context for JSON lists. Will insert/read commas before each item except
  // for the first one
  protected class JSONListContext extends JSONBaseContext {
    private boolean first_ = true;

    @Override
    protected void write() throws TException {
      if (first_) {
        first_ = false;
      } else {
        trans_.write(COMMA);
      }
    }

    @Override
    protected void read() throws TException {
      if (first_) {
        first_ = false;
      } else {
        readJSONSyntaxChar(COMMA);
      }
    }

    @Override
    protected byte peekNextValue() throws TException {
      if (first_) {
        return reader_.peek();
      } else {
        return reader_.peekNext();
      }
    }
  }

  // Context for JSON records. Will insert/read colons before the value portion
  // of each record pair, and commas before each key except the first. In
  // addition, will indicate that numbers in the key position need to be
  // escaped in quotes (since JSON keys must be strings).
  protected class JSONPairContext extends JSONBaseContext {
    private boolean first_ = true;
    private boolean colon_ = true;

    @Override
    protected void write() throws TException {
      if (first_) {
        first_ = false;
        colon_ = true;
      } else {
        trans_.write(colon_ ? COLON : COMMA);
        colon_ = !colon_;
      }
    }

    @Override
    protected void read() throws TException {
      if (first_) {
        first_ = false;
        colon_ = true;
      } else {
        readJSONSyntaxChar(colon_ ? COLON : COMMA);
        colon_ = !colon_;
      }
    }

    @Override
    protected byte peekNextValue() throws TException {
      if (first_) {
        return reader_.peek();
      } else {
        return reader_.peekNext();
      }
    }

    @Override
    protected boolean escapeNum() {
      return colon_;
    }
  }

  // Holds up to one byte from the transport
  protected class LookaheadReader {

    private boolean hasData_ = false;
    private byte[] data_ = new byte[1];

    private boolean hasNextData_ = false;
    private byte[] nextData_ = new byte[1];

    // Return and consume the next byte to be read, either taking it from the
    // data buffer if present or getting it from the transport otherwise.
    protected byte read() throws TException {
      if (hasNextData_) {
        byte result = data_[0];
        data_[0] = nextData_[0];
        hasNextData_ = false;
        return result;
      }

      if (hasData_) {
        hasData_ = false;
      } else {
        trans_.readAll(data_, 0, 1);
      }
      return data_[0];
    }

    // Return the next byte to be read without consuming, filling the data
    // buffer if it has not been filled already.
    protected byte peek() throws TException {
      if (!hasData_) {
        trans_.readAll(data_, 0, 1);
      }
      hasData_ = true;
      return data_[0];
    }

    protected byte peekNext() throws TException {
      if (!hasNextData_) {
        peek();
        trans_.readAll(nextData_, 0, 1);
        hasNextData_ = true;
      }
      return nextData_[0];
    }
  }

  // Stack of nested contexts that we may be in
  protected Stack<JSONBaseContext> contextStack_ = new Stack<JSONBaseContext>();

  // Current context that we are in
  protected JSONBaseContext context_ = new JSONBaseContext();

  // Reader that manages a 1-byte buffer
  protected LookaheadReader reader_ = new LookaheadReader();

  // Push a new JSON context onto the stack.
  protected void pushContext(JSONBaseContext c) {
    contextStack_.push(context_);
    context_ = c;
  }

  // Pop the last JSON context off the stack
  protected void popContext() {
    context_ = contextStack_.pop();
  }

  protected TJSONProtocolBase(TTransport trans) {
    super(trans);
  }

  @Override
  public void reset() {
    contextStack_.clear();
    context_ = new JSONBaseContext();
    reader_ = new LookaheadReader();
  }

  // Temporary buffer used by several methods
  protected byte[] tmpbuf_ = new byte[4];

  // Read a byte that must match b[0]; otherwise an excpetion is thrown.
  // Marked protected to avoid synthetic accessor in JSONListContext.read
  // and JSONPairContext.read
  protected void readJSONSyntaxChar(byte[] b) throws TException {
    byte ch = reader_.read();
    if (ch != b[0]) {
      throw new TProtocolException(
          TProtocolException.INVALID_DATA, "Unexpected character:" + (char) ch);
    }
  }

  // Convert a byte containing a hex char ('0'-'9' or 'a'-'f') into its
  // corresponding hex value
  protected static final byte hexVal(byte ch) throws TException {
    if ((ch >= '0') && (ch <= '9')) {
      return (byte) ((char) ch - '0');
    } else if ((ch >= 'a') && (ch <= 'f')) {
      return (byte) ((char) ch - 'a' + 10);
    } else {
      throw new TProtocolException(TProtocolException.INVALID_DATA, "Expected hex character");
    }
  }

  // Convert a byte containing a hex value to its corresponding hex character
  protected static final byte hexChar(byte val) {
    val &= 0x0F;
    if (val < 10) {
      return (byte) ((char) val + '0');
    } else {
      return (byte) ((char) (val - 10) + 'a');
    }
  }

  // Write the bytes in array buf as a JSON characters, escaping as needed
  protected void writeJSONString(byte[] b) throws TException {
    context_.write();
    trans_.write(QUOTE);
    int len = b.length;
    for (int i = 0; i < len; i++) {
      if ((b[i] & 0x00FF) >= 0x30) {
        if (b[i] == BACKSLASH[0]) {
          trans_.write(BACKSLASH);
          trans_.write(BACKSLASH);
        } else {
          trans_.write(b, i, 1);
        }
      } else {
        tmpbuf_[0] = JSON_CHAR_TABLE[b[i]];
        if (tmpbuf_[0] == 1) {
          trans_.write(b, i, 1);
        } else if (tmpbuf_[0] > 1) {
          trans_.write(BACKSLASH);
          trans_.write(tmpbuf_, 0, 1);
        } else {
          trans_.write(ESCSEQ);
          tmpbuf_[0] = hexChar((byte) (b[i] >> 4));
          tmpbuf_[1] = hexChar(b[i]);
          trans_.write(tmpbuf_, 0, 2);
        }
      }
    }
    trans_.write(QUOTE);
  }

  // Write out number as a JSON value. If the context dictates so, it will be
  // wrapped in quotes to output as a JSON string.
  protected void writeJSONInteger(long num) throws TException {
    context_.write();
    String str = Long.toString(num);
    boolean escapeNum = context_.escapeNum();
    if (escapeNum) {
      trans_.write(QUOTE);
    }
    byte[] buf = str.getBytes(StandardCharsets.UTF_8);
    trans_.write(buf);
    if (escapeNum) {
      trans_.write(QUOTE);
    }
  }

  // Write out a double as a JSON value. If it is NaN or infinity or if the
  // context dictates escaping, write out as JSON string.
  protected void writeJSONDouble(String str) throws TException {
    context_.write();
    boolean special = false;
    switch (str.charAt(0)) {
      case 'N': // NaN
      case 'I': // Infinity
        special = true;
        break;
      case '-':
        if (str.charAt(1) == 'I') { // -Infinity
          special = true;
        }
        break;
    }

    boolean escapeNum = special || context_.escapeNum();
    if (escapeNum) {
      trans_.write(QUOTE);
    }
    byte[] b = str.getBytes(StandardCharsets.UTF_8);
    trans_.write(b, 0, b.length);
    if (escapeNum) {
      trans_.write(QUOTE);
    }
  }

  // Write out contents of byte array b as a JSON string with base-64 encoded
  // data
  protected void writeJSONBase64(byte[] b) throws TException {
    context_.write();
    trans_.write(QUOTE);
    int len = b.length;
    int off = 0;
    while (len >= 3) {
      // Encode 3 bytes at a time
      TBase64Utils.encode(b, off, 3, tmpbuf_, 0);
      trans_.write(tmpbuf_, 0, 4);
      off += 3;
      len -= 3;
    }
    if (len > 0) {
      // Encode remainder
      TBase64Utils.encode(b, off, len, tmpbuf_, 0);
      trans_.write(tmpbuf_, 0, len + 1);
    }
    trans_.write(QUOTE);
  }

  protected void writeJSONObjectStart() throws TException {
    context_.write();
    trans_.write(LBRACE);
    pushContext(new JSONPairContext());
  }

  protected void writeJSONObjectEnd() throws TException {
    popContext();
    trans_.write(RBRACE);
  }

  protected void writeJSONArrayStart() throws TException {
    context_.write();
    trans_.write(LBRACKET);
    pushContext(new JSONListContext());
  }

  protected void writeJSONArrayEnd() throws TException {
    popContext();
    trans_.write(RBRACKET);
  }

  @Override
  public void writeMessageBegin(TMessage message) throws TException {
    writeJSONArrayStart();
    writeJSONInteger(VERSION);
    byte[] b = message.name.getBytes(StandardCharsets.UTF_8);
    writeJSONString(b);
    writeJSONInteger(message.type);
    writeJSONInteger(message.seqid);
  }

  @Override
  public void writeMessageEnd() throws TException {
    writeJSONArrayEnd();
  }

  @Override
  public void writeBool(boolean b) throws TException {
    context_.write();
    trans_.write((b ? "true" : "false").getBytes(StandardCharsets.UTF_8));
  }

  @Override
  public void writeByte(byte b) throws TException {
    writeJSONInteger((long) b);
  }

  @Override
  public void writeI16(short i16) throws TException {
    writeJSONInteger((long) i16);
  }

  @Override
  public void writeI32(int i32) throws TException {
    writeJSONInteger((long) i32);
  }

  @Override
  public void writeI64(long i64) throws TException {
    writeJSONInteger(i64);
  }

  @Override
  public void writeDouble(double dub) throws TException {
    writeJSONDouble(Double.toString(dub));
  }

  @Override
  public void writeFloat(float flt) throws TException {
    writeJSONDouble(Float.toString(flt));
  }

  @Override
  public void writeString(String str) throws TException {
    byte[] b = str.getBytes(StandardCharsets.UTF_8);
    writeJSONString(b);
  }

  @Override
  public void writeBinary(byte[] bin) throws TException {
    writeJSONBase64(bin);
  }

  /** Reading methods. */

  // Read in a JSON string, unescaping as appropriate.. Skip reading from the
  // context if skipContext is true.
  @SuppressWarnings("resource")
  protected TByteArrayOutputStream readJSONString(boolean skipContext) throws TException {
    TByteArrayOutputStream arr = new TByteArrayOutputStream(DEF_STRING_SIZE);
    if (!skipContext) {
      context_.read();
    }
    readJSONSyntaxChar(QUOTE);
    while (true) {
      byte ch = reader_.read();
      if (ch == QUOTE[0]) {
        break;
      }
      if (ch == ESCSEQ[0]) {
        ch = reader_.read();
        if (ch == ESCSEQ[1]) {
          readJSONSyntaxChar(ZERO);
          readJSONSyntaxChar(ZERO);
          trans_.readAll(tmpbuf_, 0, 2);
          ch = (byte) ((hexVal((byte) tmpbuf_[0]) << 4) + hexVal(tmpbuf_[1]));
        } else {
          int off = ESCAPE_CHARS.indexOf(ch);
          if (off == -1) {
            throw new TProtocolException(TProtocolException.INVALID_DATA, "Expected control char");
          }
          ch = ESCAPE_CHAR_VALS[off];
        }
      }
      arr.write(ch);
    }
    return arr;
  }

  // Return true if the given byte could be a valid part of a JSON number.
  protected boolean isJSONNumeric(byte b) {
    switch (b) {
      case '+':
      case '-':
      case '.':
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
      case 'E':
      case 'e':
        return true;
    }
    return false;
  }

  // Read in a sequence of characters that are all valid in JSON numbers. Does
  // not do a complete regex check to validate that this is actually a number.
  protected String readJSONNumericChars() throws TException {
    StringBuilder strbld = new StringBuilder();
    while (true) {
      byte ch = reader_.peek();
      if (!isJSONNumeric(ch)) {
        break;
      }
      strbld.append((char) reader_.read());
    }
    return strbld.toString();
  }

  // Read in a JSON number. If the context dictates, read in enclosing quotes.
  protected long readJSONInteger() throws TException {
    context_.read();
    if (context_.escapeNum()) {
      readJSONSyntaxChar(QUOTE);
    }
    String str = readJSONNumericChars();
    if (context_.escapeNum()) {
      readJSONSyntaxChar(QUOTE);
    }
    try {
      return Long.valueOf(str);
    } catch (NumberFormatException ex) {
      throw new TProtocolException(
          TProtocolException.INVALID_DATA, "Bad data encounted in numeric data");
    }
  }

  // Read in a JSON double value. Throw if the value is not wrapped in quotes
  // when expected or if wrapped in quotes when not expected.
  protected double readJSONDouble() throws TException {
    context_.read();
    if (reader_.peek() == QUOTE[0]) {
      TByteArrayOutputStream arr = readJSONString(true);
      double dub = Double.valueOf(arr.toString(StandardCharsets.UTF_8));
      if (!context_.escapeNum() && !Double.isNaN(dub) && !Double.isInfinite(dub)) {
        // Throw exception -- we should not be in a string in this case
        throw new TProtocolException(
            TProtocolException.INVALID_DATA, "Numeric data unexpectedly quoted");
      }
      return dub;
    } else {
      if (context_.escapeNum()) {
        // This will throw - we should have had a quote if escapeNum == true
        readJSONSyntaxChar(QUOTE);
      }
      try {
        return Double.valueOf(readJSONNumericChars());
      } catch (NumberFormatException ex) {
        throw new TProtocolException(
            TProtocolException.INVALID_DATA, "Bad data encounted in numeric data");
      }
    }
  }

  // Read in a JSON float value. Throw if the value is not wrapped in quotes
  // when expected or if wrapped in quotes when not expected.
  protected float readJSONFloat() throws TException {
    context_.read();
    if (reader_.peek() == QUOTE[0]) {
      TByteArrayOutputStream arr = readJSONString(true);
      float flt = Float.valueOf(arr.toString(StandardCharsets.UTF_8));
      if (!context_.escapeNum() && !Float.isNaN(flt) && !Float.isInfinite(flt)) {
        // Throw exception -- we should not be in a string in this case
        throw new TProtocolException(
            TProtocolException.INVALID_DATA, "Numeric data unexpectedly quoted");
      }
      return flt;
    } else {
      if (context_.escapeNum()) {
        // This will throw - we should have had a quote if escapeNum == true
        readJSONSyntaxChar(QUOTE);
      }
      try {
        return Float.valueOf(readJSONNumericChars());
      } catch (NumberFormatException ex) {
        throw new TProtocolException(
            TProtocolException.INVALID_DATA, "Bad data encounted in numeric data");
      }
    }
  }

  // Read in a JSON string containing base-64 encoded data and decode it.
  protected byte[] readJSONBase64() throws TException {
    TByteArrayOutputStream arr = readJSONString(false);
    byte[] b = arr.get();
    int len = arr.len();
    int off = 0;
    int size = 0;
    while (len >= 4) {
      // Decode 4 bytes at a time
      TBase64Utils.decode(b, off, 4, b, size); // NB: decoded in place
      off += 4;
      len -= 4;
      size += 3;
    }
    // Don't decode if we hit the end or got a single leftover byte (invalid
    // base64 but legal for skip of regular string type)
    if (len > 1) {
      // Decode remainder
      TBase64Utils.decode(b, off, len, b, size); // NB: decoded in place
      size += len - 1;
    }
    // Sadly we must copy the byte[] (any way around this?)
    byte[] result = new byte[size];
    System.arraycopy(b, 0, result, 0, size);
    return result;
  }

  protected void readJSONObjectStart() throws TException {
    context_.read();
    readJSONSyntaxChar(LBRACE);
    pushContext(new JSONPairContext());
  }

  protected void readJSONObjectEnd() throws TException {
    readJSONSyntaxChar(RBRACE);
    popContext();
  }

  protected void readJSONArrayStart() throws TException {
    context_.read();
    readJSONSyntaxChar(LBRACKET);
    pushContext(new JSONListContext());
  }

  protected void readJSONArrayEnd() throws TException {
    readJSONSyntaxChar(RBRACKET);
    popContext();
  }

  @Override
  public TMessage readMessageBegin() throws TException {
    readJSONArrayStart();
    if (readJSONInteger() != VERSION) {
      throw new TProtocolException(
          TProtocolException.BAD_VERSION, "Message contained bad version.");
    }
    String name;
    name = readJSONString(false).toString(StandardCharsets.UTF_8);
    byte type = (byte) readJSONInteger();
    int seqid = (int) readJSONInteger();
    return new TMessage(name, type, seqid);
  }

  @Override
  public void readMessageEnd() throws TException {
    readJSONArrayEnd();
  }

  /**
   * JSON and CompactJSON protocol serialize bool type as int with values 0 and 1, but for
   * deserialization it's worth supporting false and true JSON literals as well for cases when
   * CompactJSON is used to deserialize messages not authored by Thrift.
   */
  @Override
  public boolean readBool() throws TException {
    // readBool is equivalent to readJSONInteger followed by check for its result being non-zero,
    // with a condition added to detect "false" and "true" JSON literals inside optional quotes.
    context_.read();

    boolean literalResult = false;
    byte[] literalValue = null;
    byte ch = reader_.peek();
    if (ch == VALUE_FALSE[0]) {
      literalResult = false;
      literalValue = VALUE_FALSE;
    } else if (ch == VALUE_TRUE[0]) {
      literalResult = true;
      literalValue = VALUE_TRUE;
    }

    boolean isQuoted = context_.escapeNum() && literalValue == null;
    if (isQuoted) {
      readJSONSyntaxChar(QUOTE);
    }

    // See if its "false" or "true"
    if (literalValue != null) {
      // "false" or "true" detected, read character by character
      for (byte expected : literalValue) {
        if (reader_.read() != expected) {
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Invalid boolean literal");
        }
      }

      if (isQuoted) {
        readJSONSyntaxChar(QUOTE);
      }

      return literalResult;
    }

    // Not "false" or "true", proceed as readJSONInteger would

    String str = readJSONNumericChars();

    if (isQuoted) {
      readJSONSyntaxChar(QUOTE);
    }

    long numericResult;

    try {
      numericResult = Long.valueOf(str);
    } catch (NumberFormatException ex) {
      throw new TProtocolException(
          TProtocolException.INVALID_DATA, "Bad data encounted in numeric data");
    }

    return numericResult != 0;
  }

  @Override
  public byte readByte() throws TException {
    return (byte) readJSONInteger();
  }

  @Override
  public short readI16() throws TException {
    return (short) readJSONInteger();
  }

  @Override
  public int readI32() throws TException {
    return (int) readJSONInteger();
  }

  @Override
  public long readI64() throws TException {
    return (long) readJSONInteger();
  }

  @Override
  public double readDouble() throws TException {
    return readJSONDouble();
  }

  @Override
  public float readFloat() throws TException {
    return readJSONFloat();
  }

  @Override
  public String readString() throws TException {
    return readJSONString(false).toString(StandardCharsets.UTF_8);
  }

  @Override
  public byte[] readBinary() throws TException {
    return readJSONBase64();
  }
}
