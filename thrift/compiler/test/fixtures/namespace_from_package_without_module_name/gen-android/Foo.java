/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
public class Foo implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Foo");
  private static final TField MY_INT_FIELD_DESC = new TField("MyInt", TType.I64, (short)1);

  public final Long MyInt;
  public static final int MYINT = 1;

  public Foo(
      Long MyInt) {
    this.MyInt = MyInt;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Foo(Foo other) {
    if (other.isSetMyInt()) {
      this.MyInt = TBaseHelper.deepCopy(other.MyInt);
    } else {
      this.MyInt = null;
    }
  }

  public Foo deepCopy() {
    return new Foo(this);
  }

  public Long getMyInt() {
    return this.MyInt;
  }

  // Returns true if field MyInt is set (has been assigned a value) and false otherwise
  public boolean isSetMyInt() {
    return this.MyInt != null;
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

    if (!TBaseHelper.equalsNobinary(this.isSetMyInt(), that.isSetMyInt(), this.MyInt, that.MyInt)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {MyInt});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static Foo deserialize(TProtocol iprot) throws TException {
    Long tmp_MyInt = null;
    TField __field;
    iprot.readStructBegin();
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
            tmp_MyInt = iprot.readI64();
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

    Foo _that;
    _that = new Foo(
      tmp_MyInt
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.MyInt != null) {
      oprot.writeFieldBegin(MY_INT_FIELD_DESC);
      oprot.writeI64(this.MyInt);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

