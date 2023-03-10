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
public class MyStructWithCustomDefault implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructWithCustomDefault");
  private static final TField FIELD1_FIELD_DESC = new TField("field1", TType.I64, (short)1);

  public final Long field1;
  public static final int FIELD1 = 1;

  public MyStructWithCustomDefault(
      Long field1) {
    this.field1 = field1;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructWithCustomDefault(MyStructWithCustomDefault other) {
    if (other.isSetField1()) {
      this.field1 = TBaseHelper.deepCopy(other.field1);
    } else {
      this.field1 = null;
    }
  }

  public MyStructWithCustomDefault deepCopy() {
    return new MyStructWithCustomDefault(this);
  }

  public Long getField1() {
    return this.field1;
  }

  // Returns true if field field1 is set (has been assigned a value) and false otherwise
  public boolean isSetField1() {
    return this.field1 != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructWithCustomDefault))
      return false;
    MyStructWithCustomDefault that = (MyStructWithCustomDefault)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetField1(), that.isSetField1(), this.field1, that.field1)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {field1});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStructWithCustomDefault deserialize(TProtocol iprot) throws TException {
    Long tmp_field1 = null;
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
        case FIELD1:
          if (__field.type == TType.I64) {
            tmp_field1 = iprot.readI64();
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

    MyStructWithCustomDefault _that;
    _that = new MyStructWithCustomDefault(
      tmp_field1
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.field1 != null) {
      oprot.writeFieldBegin(FIELD1_FIELD_DESC);
      oprot.writeI64(this.field1);
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

