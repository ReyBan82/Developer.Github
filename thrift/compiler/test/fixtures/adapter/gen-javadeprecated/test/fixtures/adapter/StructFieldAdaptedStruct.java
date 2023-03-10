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
public class StructFieldAdaptedStruct implements TBase, java.io.Serializable, Cloneable, Comparable<StructFieldAdaptedStruct> {
  private static final TStruct STRUCT_DESC = new TStruct("StructFieldAdaptedStruct");
  private static final TField ADAPTED_STRUCT_FIELD_DESC = new TField("adaptedStruct", TType.STRUCT, (short)1);
  private static final TField ADAPTED_TYPEDEF_FIELD_DESC = new TField("adaptedTypedef", TType.STRUCT, (short)2);
  private static final TField DIRECTLY_ADAPTED_FIELD_DESC = new TField("directlyAdapted", TType.STRUCT, (short)3);
  private static final TField TYPEDEF_OF_ADAPTED_FIELD_DESC = new TField("typedefOfAdapted", TType.STRUCT, (short)4);

  public AdaptedStruct adaptedStruct;
  public AdaptedStruct adaptedTypedef;
  public DirectlyAdaptedStruct directlyAdapted;
  public DirectlyAdaptedStruct typedefOfAdapted;
  public static final int ADAPTEDSTRUCT = 1;
  public static final int ADAPTEDTYPEDEF = 2;
  public static final int DIRECTLYADAPTED = 3;
  public static final int TYPEDEFOFADAPTED = 4;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ADAPTEDSTRUCT, new FieldMetaData("adaptedStruct", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, AdaptedStruct.class)));
    tmpMetaDataMap.put(ADAPTEDTYPEDEF, new FieldMetaData("adaptedTypedef", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, AdaptedStruct.class)));
    tmpMetaDataMap.put(DIRECTLYADAPTED, new FieldMetaData("directlyAdapted", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DirectlyAdaptedStruct.class)));
    tmpMetaDataMap.put(TYPEDEFOFADAPTED, new FieldMetaData("typedefOfAdapted", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DirectlyAdaptedStruct.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(StructFieldAdaptedStruct.class, metaDataMap);
  }

  public StructFieldAdaptedStruct() {
  }

  public StructFieldAdaptedStruct(
      AdaptedStruct adaptedStruct,
      AdaptedStruct adaptedTypedef,
      DirectlyAdaptedStruct directlyAdapted,
      DirectlyAdaptedStruct typedefOfAdapted) {
    this();
    this.adaptedStruct = adaptedStruct;
    this.adaptedTypedef = adaptedTypedef;
    this.directlyAdapted = directlyAdapted;
    this.typedefOfAdapted = typedefOfAdapted;
  }

  public static class Builder {
    private AdaptedStruct adaptedStruct;
    private AdaptedStruct adaptedTypedef;
    private DirectlyAdaptedStruct directlyAdapted;
    private DirectlyAdaptedStruct typedefOfAdapted;

    public Builder() {
    }

    public Builder setAdaptedStruct(final AdaptedStruct adaptedStruct) {
      this.adaptedStruct = adaptedStruct;
      return this;
    }

    public Builder setAdaptedTypedef(final AdaptedStruct adaptedTypedef) {
      this.adaptedTypedef = adaptedTypedef;
      return this;
    }

    public Builder setDirectlyAdapted(final DirectlyAdaptedStruct directlyAdapted) {
      this.directlyAdapted = directlyAdapted;
      return this;
    }

    public Builder setTypedefOfAdapted(final DirectlyAdaptedStruct typedefOfAdapted) {
      this.typedefOfAdapted = typedefOfAdapted;
      return this;
    }

    public StructFieldAdaptedStruct build() {
      StructFieldAdaptedStruct result = new StructFieldAdaptedStruct();
      result.setAdaptedStruct(this.adaptedStruct);
      result.setAdaptedTypedef(this.adaptedTypedef);
      result.setDirectlyAdapted(this.directlyAdapted);
      result.setTypedefOfAdapted(this.typedefOfAdapted);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StructFieldAdaptedStruct(StructFieldAdaptedStruct other) {
    if (other.isSetAdaptedStruct()) {
      this.adaptedStruct = TBaseHelper.deepCopy(other.adaptedStruct);
    }
    if (other.isSetAdaptedTypedef()) {
      this.adaptedTypedef = TBaseHelper.deepCopy(other.adaptedTypedef);
    }
    if (other.isSetDirectlyAdapted()) {
      this.directlyAdapted = TBaseHelper.deepCopy(other.directlyAdapted);
    }
    if (other.isSetTypedefOfAdapted()) {
      this.typedefOfAdapted = TBaseHelper.deepCopy(other.typedefOfAdapted);
    }
  }

  public StructFieldAdaptedStruct deepCopy() {
    return new StructFieldAdaptedStruct(this);
  }

  public AdaptedStruct getAdaptedStruct() {
    return this.adaptedStruct;
  }

  public StructFieldAdaptedStruct setAdaptedStruct(AdaptedStruct adaptedStruct) {
    this.adaptedStruct = adaptedStruct;
    return this;
  }

  public void unsetAdaptedStruct() {
    this.adaptedStruct = null;
  }

  // Returns true if field adaptedStruct is set (has been assigned a value) and false otherwise
  public boolean isSetAdaptedStruct() {
    return this.adaptedStruct != null;
  }

  public void setAdaptedStructIsSet(boolean __value) {
    if (!__value) {
      this.adaptedStruct = null;
    }
  }

  public AdaptedStruct getAdaptedTypedef() {
    return this.adaptedTypedef;
  }

  public StructFieldAdaptedStruct setAdaptedTypedef(AdaptedStruct adaptedTypedef) {
    this.adaptedTypedef = adaptedTypedef;
    return this;
  }

  public void unsetAdaptedTypedef() {
    this.adaptedTypedef = null;
  }

  // Returns true if field adaptedTypedef is set (has been assigned a value) and false otherwise
  public boolean isSetAdaptedTypedef() {
    return this.adaptedTypedef != null;
  }

  public void setAdaptedTypedefIsSet(boolean __value) {
    if (!__value) {
      this.adaptedTypedef = null;
    }
  }

  public DirectlyAdaptedStruct getDirectlyAdapted() {
    return this.directlyAdapted;
  }

  public StructFieldAdaptedStruct setDirectlyAdapted(DirectlyAdaptedStruct directlyAdapted) {
    this.directlyAdapted = directlyAdapted;
    return this;
  }

  public void unsetDirectlyAdapted() {
    this.directlyAdapted = null;
  }

  // Returns true if field directlyAdapted is set (has been assigned a value) and false otherwise
  public boolean isSetDirectlyAdapted() {
    return this.directlyAdapted != null;
  }

  public void setDirectlyAdaptedIsSet(boolean __value) {
    if (!__value) {
      this.directlyAdapted = null;
    }
  }

  public DirectlyAdaptedStruct getTypedefOfAdapted() {
    return this.typedefOfAdapted;
  }

  public StructFieldAdaptedStruct setTypedefOfAdapted(DirectlyAdaptedStruct typedefOfAdapted) {
    this.typedefOfAdapted = typedefOfAdapted;
    return this;
  }

  public void unsetTypedefOfAdapted() {
    this.typedefOfAdapted = null;
  }

  // Returns true if field typedefOfAdapted is set (has been assigned a value) and false otherwise
  public boolean isSetTypedefOfAdapted() {
    return this.typedefOfAdapted != null;
  }

  public void setTypedefOfAdaptedIsSet(boolean __value) {
    if (!__value) {
      this.typedefOfAdapted = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ADAPTEDSTRUCT:
      if (__value == null) {
        unsetAdaptedStruct();
      } else {
        setAdaptedStruct((AdaptedStruct)__value);
      }
      break;

    case ADAPTEDTYPEDEF:
      if (__value == null) {
        unsetAdaptedTypedef();
      } else {
        setAdaptedTypedef((AdaptedStruct)__value);
      }
      break;

    case DIRECTLYADAPTED:
      if (__value == null) {
        unsetDirectlyAdapted();
      } else {
        setDirectlyAdapted((DirectlyAdaptedStruct)__value);
      }
      break;

    case TYPEDEFOFADAPTED:
      if (__value == null) {
        unsetTypedefOfAdapted();
      } else {
        setTypedefOfAdapted((DirectlyAdaptedStruct)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ADAPTEDSTRUCT:
      return getAdaptedStruct();

    case ADAPTEDTYPEDEF:
      return getAdaptedTypedef();

    case DIRECTLYADAPTED:
      return getDirectlyAdapted();

    case TYPEDEFOFADAPTED:
      return getTypedefOfAdapted();

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
    if (!(_that instanceof StructFieldAdaptedStruct))
      return false;
    StructFieldAdaptedStruct that = (StructFieldAdaptedStruct)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAdaptedStruct(), that.isSetAdaptedStruct(), this.adaptedStruct, that.adaptedStruct)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetAdaptedTypedef(), that.isSetAdaptedTypedef(), this.adaptedTypedef, that.adaptedTypedef)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDirectlyAdapted(), that.isSetDirectlyAdapted(), this.directlyAdapted, that.directlyAdapted)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetTypedefOfAdapted(), that.isSetTypedefOfAdapted(), this.typedefOfAdapted, that.typedefOfAdapted)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {adaptedStruct, adaptedTypedef, directlyAdapted, typedefOfAdapted});
  }

  @Override
  public int compareTo(StructFieldAdaptedStruct other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAdaptedStruct()).compareTo(other.isSetAdaptedStruct());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(adaptedStruct, other.adaptedStruct);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetAdaptedTypedef()).compareTo(other.isSetAdaptedTypedef());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(adaptedTypedef, other.adaptedTypedef);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetDirectlyAdapted()).compareTo(other.isSetDirectlyAdapted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(directlyAdapted, other.directlyAdapted);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetTypedefOfAdapted()).compareTo(other.isSetTypedefOfAdapted());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(typedefOfAdapted, other.typedefOfAdapted);
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
        case ADAPTEDSTRUCT:
          if (__field.type == TType.STRUCT) {
            this.adaptedStruct = new AdaptedStruct();
            this.adaptedStruct.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ADAPTEDTYPEDEF:
          if (__field.type == TType.STRUCT) {
            this.adaptedTypedef = new AdaptedStruct();
            this.adaptedTypedef.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DIRECTLYADAPTED:
          if (__field.type == TType.STRUCT) {
            this.directlyAdapted = new DirectlyAdaptedStruct();
            this.directlyAdapted.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case TYPEDEFOFADAPTED:
          if (__field.type == TType.STRUCT) {
            this.typedefOfAdapted = new DirectlyAdaptedStruct();
            this.typedefOfAdapted.read(iprot);
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
    if (this.adaptedStruct != null) {
      oprot.writeFieldBegin(ADAPTED_STRUCT_FIELD_DESC);
      this.adaptedStruct.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.adaptedTypedef != null) {
      oprot.writeFieldBegin(ADAPTED_TYPEDEF_FIELD_DESC);
      this.adaptedTypedef.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.directlyAdapted != null) {
      oprot.writeFieldBegin(DIRECTLY_ADAPTED_FIELD_DESC);
      this.directlyAdapted.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.typedefOfAdapted != null) {
      oprot.writeFieldBegin(TYPEDEF_OF_ADAPTED_FIELD_DESC);
      this.typedefOfAdapted.write(oprot);
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
    StringBuilder sb = new StringBuilder("StructFieldAdaptedStruct");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("adaptedStruct");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getAdaptedStruct() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getAdaptedStruct(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("adaptedTypedef");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getAdaptedTypedef() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getAdaptedTypedef(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("directlyAdapted");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getDirectlyAdapted() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getDirectlyAdapted(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("typedefOfAdapted");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getTypedefOfAdapted() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getTypedefOfAdapted(), indent + 1, prettyPrint));
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

