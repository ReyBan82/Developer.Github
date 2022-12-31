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
public class CircularAdaptee implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("CircularAdaptee");
  private static final TField FIELD_FIELD_DESC = new TField("field", TType.STRUCT, (short)1);

  public CircularStruct field;
  public static final int FIELD = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(FIELD, new FieldMetaData("field", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, CircularStruct.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(CircularAdaptee.class, metaDataMap);
  }

  public CircularAdaptee() {
  }

  public CircularAdaptee(
      CircularStruct field) {
    this();
    this.field = field;
  }

  public static class Builder {
    private CircularStruct field;

    public Builder() {
    }

    public Builder setField(final CircularStruct field) {
      this.field = field;
      return this;
    }

    public CircularAdaptee build() {
      CircularAdaptee result = new CircularAdaptee();
      result.setField(this.field);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CircularAdaptee(CircularAdaptee other) {
    if (other.isSetField()) {
      this.field = TBaseHelper.deepCopy(other.field);
    }
  }

  public CircularAdaptee deepCopy() {
    return new CircularAdaptee(this);
  }

  public CircularStruct getField() {
    return this.field;
  }

  public CircularAdaptee setField(CircularStruct field) {
    this.field = field;
    return this;
  }

  public void unsetField() {
    this.field = null;
  }

  // Returns true if field field is set (has been assigned a value) and false otherwise
  public boolean isSetField() {
    return this.field != null;
  }

  public void setFieldIsSet(boolean __value) {
    if (!__value) {
      this.field = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case FIELD:
      if (__value == null) {
        unsetField();
      } else {
        setField((CircularStruct)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case FIELD:
      return getField();

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
    if (!(_that instanceof CircularAdaptee))
      return false;
    CircularAdaptee that = (CircularAdaptee)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetField(), that.isSetField(), this.field, that.field)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {field});
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
        case FIELD:
          if (__field.type == TType.STRUCT) {
            this.field = new CircularStruct();
            this.field.read(iprot);
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
    if (this.field != null) {
      oprot.writeFieldBegin(FIELD_FIELD_DESC);
      this.field.write(oprot);
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
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("CircularAdaptee");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("field");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getField() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getField(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

