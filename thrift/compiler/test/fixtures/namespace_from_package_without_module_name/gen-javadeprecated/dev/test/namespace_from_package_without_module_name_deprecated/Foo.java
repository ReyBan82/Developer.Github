/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package dev.test.namespace_from_package_without_module_name_deprecated;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class Foo implements TBase, java.io.Serializable, Cloneable, Comparable<Foo> {
  private static final TStruct STRUCT_DESC = new TStruct("Foo");
  private static final TField MY_INT_FIELD_DESC = new TField("MyInt", TType.I64, (short)1);

  public long MyInt;
  public static final int MYINT = 1;

  // isset id assignments
  private static final int __MYINT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(MYINT, new FieldMetaData("MyInt", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(Foo.class, metaDataMap);
  }

  public Foo() {
  }

  public Foo(
      long MyInt) {
    this();
    this.MyInt = MyInt;
    setMyIntIsSet(true);
  }

  public static class Builder {
    private long MyInt;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setMyInt(final long MyInt) {
      this.MyInt = MyInt;
      __optional_isset.set(__MYINT_ISSET_ID, true);
      return this;
    }

    public Foo build() {
      Foo result = new Foo();
      if (__optional_isset.get(__MYINT_ISSET_ID)) {
        result.setMyInt(this.MyInt);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Foo(Foo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.MyInt = TBaseHelper.deepCopy(other.MyInt);
  }

  public Foo deepCopy() {
    return new Foo(this);
  }

  public long getMyInt() {
    return this.MyInt;
  }

  public Foo setMyInt(long MyInt) {
    this.MyInt = MyInt;
    setMyIntIsSet(true);
    return this;
  }

  public void unsetMyInt() {
    __isset_bit_vector.clear(__MYINT_ISSET_ID);
  }

  // Returns true if field MyInt is set (has been assigned a value) and false otherwise
  public boolean isSetMyInt() {
    return __isset_bit_vector.get(__MYINT_ISSET_ID);
  }

  public void setMyIntIsSet(boolean __value) {
    __isset_bit_vector.set(__MYINT_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case MYINT:
      if (__value == null) {
        unsetMyInt();
      } else {
        setMyInt((Long)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MYINT:
      return new Long(getMyInt());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof Foo))
      return false;
    Foo that = (Foo)_that;

    if (!TBaseHelper.equalsNobinary(this.MyInt, that.MyInt)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {MyInt});
  }

  @Override
  public int compareTo(Foo other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMyInt()).compareTo(other.isSetMyInt());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(MyInt, other.MyInt);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case MYINT:
          if (__field.type == TType.I64) {
            this.MyInt = iprot.readI64();
            setMyIntIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(MY_INT_FIELD_DESC);
    oprot.writeI64(this.MyInt);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("Foo");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("MyInt");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.getMyInt(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

