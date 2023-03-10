/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.adapter;

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
public class Foo2 implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Foo2");
  private static final TField FIELD1_FIELD_DESC = new TField("field1", TType.I32, (short)3);
  private static final TField FIELD2_FIELD_DESC = new TField("field2", TType.I32, (short)1);
  private static final TField FIELD3_FIELD_DESC = new TField("field3", TType.I32, (short)2);

  public final Integer field1;
  public final Integer field2;
  public final Integer field3;
  public static final int FIELD1 = 3;
  public static final int FIELD2 = 1;
  public static final int FIELD3 = 2;

  public Foo2(
      Integer field1,
      Integer field2,
      Integer field3) {
    this.field1 = field1;
    this.field2 = field2;
    this.field3 = field3;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Foo2(Foo2 other) {
    if (other.isSetField1()) {
      this.field1 = TBaseHelper.deepCopy(other.field1);
    } else {
      this.field1 = null;
    }
    if (other.isSetField2()) {
      this.field2 = TBaseHelper.deepCopy(other.field2);
    } else {
      this.field2 = null;
    }
    if (other.isSetField3()) {
      this.field3 = TBaseHelper.deepCopy(other.field3);
    } else {
      this.field3 = null;
    }
  }

  public Foo2 deepCopy() {
    return new Foo2(this);
  }

  public Integer getField1() {
    return this.field1;
  }

  // Returns true if field field1 is set (has been assigned a value) and false otherwise
  public boolean isSetField1() {
    return this.field1 != null;
  }

  public Integer getField2() {
    return this.field2;
  }

  // Returns true if field field2 is set (has been assigned a value) and false otherwise
  public boolean isSetField2() {
    return this.field2 != null;
  }

  public Integer getField3() {
    return this.field3;
  }

  // Returns true if field field3 is set (has been assigned a value) and false otherwise
  public boolean isSetField3() {
    return this.field3 != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof Foo2))
      return false;
    Foo2 that = (Foo2)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetField1(), that.isSetField1(), this.field1, that.field1)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetField2(), that.isSetField2(), this.field2, that.field2)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetField3(), that.isSetField3(), this.field3, that.field3)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {field1, field2, field3});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static Foo2 deserialize(TProtocol iprot) throws TException {
    Integer tmp_field1 = null;
    Integer tmp_field2 = null;
    Integer tmp_field3 = null;
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
          if (__field.type == TType.I32) {
            tmp_field1 = iprot.readI32();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FIELD2:
          if (__field.type == TType.I32) {
            tmp_field2 = iprot.readI32();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FIELD3:
          if (__field.type == TType.I32) {
            tmp_field3 = iprot.readI32();
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

    Foo2 _that;
    _that = new Foo2(
      tmp_field1
      ,tmp_field2
      ,tmp_field3
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.field2 != null) {
      oprot.writeFieldBegin(FIELD2_FIELD_DESC);
      oprot.writeI32(this.field2);
      oprot.writeFieldEnd();
    }
    if (this.field3 != null) {
      oprot.writeFieldBegin(FIELD3_FIELD_DESC);
      oprot.writeI32(this.field3);
      oprot.writeFieldEnd();
    }
    if (this.field1 != null) {
      oprot.writeFieldBegin(FIELD1_FIELD_DESC);
      oprot.writeI32(this.field1);
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

