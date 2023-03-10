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
public class CircularStruct implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CircularStruct");
  private static final TField FIELD_FIELD_DESC = new TField("field", TType.STRUCT, (short)1);

  public final CircularAdaptee field;
  public static final int FIELD = 1;

  public CircularStruct(
      CircularAdaptee field) {
    this.field = field;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CircularStruct(CircularStruct other) {
    if (other.isSetField()) {
      this.field = TBaseHelper.deepCopy(other.field);
    } else {
      this.field = null;
    }
  }

  public CircularStruct deepCopy() {
    return new CircularStruct(this);
  }

  public CircularAdaptee getField() {
    return this.field;
  }

  // Returns true if field field is set (has been assigned a value) and false otherwise
  public boolean isSetField() {
    return this.field != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof CircularStruct))
      return false;
    CircularStruct that = (CircularStruct)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetField(), that.isSetField(), this.field, that.field)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {field});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static CircularStruct deserialize(TProtocol iprot) throws TException {
    CircularAdaptee tmp_field = null;
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
        case FIELD:
          if (__field.type == TType.STRUCT) {
            tmp_field = CircularAdaptee.deserialize(iprot);
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

    CircularStruct _that;
    _that = new CircularStruct(
      tmp_field
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.field != null) {
      if (isSetField()) {
        oprot.writeFieldBegin(FIELD_FIELD_DESC);
        this.field.write(oprot);
        oprot.writeFieldEnd();
      }
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

