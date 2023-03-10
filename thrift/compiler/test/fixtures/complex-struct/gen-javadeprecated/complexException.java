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
public class complexException extends Exception implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("complexException");
  private static final TField MESSAGE_FIELD_DESC = new TField("message", TType.STRING, (short)1);
  private static final TField LIST_STRINGS_FIELD_DESC = new TField("listStrings", TType.LIST, (short)2);
  private static final TField ERROR_ENUM_FIELD_DESC = new TField("errorEnum", TType.I32, (short)3);
  private static final TField UNION_ERROR_FIELD_DESC = new TField("unionError", TType.STRUCT, (short)4);
  private static final TField STRUCT_ERROR_FIELD_DESC = new TField("structError", TType.STRUCT, (short)5);
  private static final TField LS_MAP_FIELD_DESC = new TField("lsMap", TType.MAP, (short)6);

  public String message;
  public List<String> listStrings;
  /**
   * 
   * @see MyEnum
   */
  public MyEnum errorEnum;
  public MyUnion unionError;
  public MyStruct structError;
  public Map<Long,String> lsMap;
  public static final int MESSAGE = 1;
  public static final int LISTSTRINGS = 2;
  public static final int ERRORENUM = 3;
  public static final int UNIONERROR = 4;
  public static final int STRUCTERROR = 5;
  public static final int LSMAP = 6;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(MESSAGE, new FieldMetaData("message", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(LISTSTRINGS, new FieldMetaData("listStrings", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    tmpMetaDataMap.put(ERRORENUM, new FieldMetaData("errorEnum", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(UNIONERROR, new FieldMetaData("unionError", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, MyUnion.class)));
    tmpMetaDataMap.put(STRUCTERROR, new FieldMetaData("structError", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, MyStruct.class)));
    tmpMetaDataMap.put(LSMAP, new FieldMetaData("lsMap", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.I64), 
            new FieldValueMetaData(TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(complexException.class, metaDataMap);
  }

  public complexException() {
  }

  public complexException(
      String message,
      List<String> listStrings,
      MyEnum errorEnum,
      MyStruct structError,
      Map<Long,String> lsMap) {
    this();
    this.message = message;
    this.listStrings = listStrings;
    this.errorEnum = errorEnum;
    this.structError = structError;
    this.lsMap = lsMap;
  }

  public complexException(
      String message,
      List<String> listStrings,
      MyEnum errorEnum,
      MyUnion unionError,
      MyStruct structError,
      Map<Long,String> lsMap) {
    this();
    this.message = message;
    this.listStrings = listStrings;
    this.errorEnum = errorEnum;
    this.unionError = unionError;
    this.structError = structError;
    this.lsMap = lsMap;
  }

  public static class Builder {
    private String message;
    private List<String> listStrings;
    private MyEnum errorEnum;
    private MyUnion unionError;
    private MyStruct structError;
    private Map<Long,String> lsMap;

    public Builder() {
    }

    public Builder setMessage(final String message) {
      this.message = message;
      return this;
    }

    public Builder setListStrings(final List<String> listStrings) {
      this.listStrings = listStrings;
      return this;
    }

    public Builder setErrorEnum(final MyEnum errorEnum) {
      this.errorEnum = errorEnum;
      return this;
    }

    public Builder setUnionError(final MyUnion unionError) {
      this.unionError = unionError;
      return this;
    }

    public Builder setStructError(final MyStruct structError) {
      this.structError = structError;
      return this;
    }

    public Builder setLsMap(final Map<Long,String> lsMap) {
      this.lsMap = lsMap;
      return this;
    }

    public complexException build() {
      complexException result = new complexException();
      result.setMessage(this.message);
      result.setListStrings(this.listStrings);
      result.setErrorEnum(this.errorEnum);
      result.setUnionError(this.unionError);
      result.setStructError(this.structError);
      result.setLsMap(this.lsMap);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public complexException(complexException other) {
    if (other.isSetMessage()) {
      this.message = TBaseHelper.deepCopy(other.message);
    }
    if (other.isSetListStrings()) {
      this.listStrings = TBaseHelper.deepCopy(other.listStrings);
    }
    if (other.isSetErrorEnum()) {
      this.errorEnum = TBaseHelper.deepCopy(other.errorEnum);
    }
    if (other.isSetUnionError()) {
      this.unionError = TBaseHelper.deepCopy(other.unionError);
    }
    if (other.isSetStructError()) {
      this.structError = TBaseHelper.deepCopy(other.structError);
    }
    if (other.isSetLsMap()) {
      this.lsMap = TBaseHelper.deepCopy(other.lsMap);
    }
  }

  public complexException deepCopy() {
    return new complexException(this);
  }

  public String getMessage() {
    return this.message;
  }

  public complexException setMessage(String message) {
    this.message = message;
    return this;
  }

  public void unsetMessage() {
    this.message = null;
  }

  // Returns true if field message is set (has been assigned a value) and false otherwise
  public boolean isSetMessage() {
    return this.message != null;
  }

  public void setMessageIsSet(boolean __value) {
    if (!__value) {
      this.message = null;
    }
  }

  public List<String> getListStrings() {
    return this.listStrings;
  }

  public complexException setListStrings(List<String> listStrings) {
    this.listStrings = listStrings;
    return this;
  }

  public void unsetListStrings() {
    this.listStrings = null;
  }

  // Returns true if field listStrings is set (has been assigned a value) and false otherwise
  public boolean isSetListStrings() {
    return this.listStrings != null;
  }

  public void setListStringsIsSet(boolean __value) {
    if (!__value) {
      this.listStrings = null;
    }
  }

  /**
   * 
   * @see MyEnum
   */
  public MyEnum getErrorEnum() {
    return this.errorEnum;
  }

  /**
   * 
   * @see MyEnum
   */
  public complexException setErrorEnum(MyEnum errorEnum) {
    this.errorEnum = errorEnum;
    return this;
  }

  public void unsetErrorEnum() {
    this.errorEnum = null;
  }

  // Returns true if field errorEnum is set (has been assigned a value) and false otherwise
  public boolean isSetErrorEnum() {
    return this.errorEnum != null;
  }

  public void setErrorEnumIsSet(boolean __value) {
    if (!__value) {
      this.errorEnum = null;
    }
  }

  public MyUnion getUnionError() {
    return this.unionError;
  }

  public complexException setUnionError(MyUnion unionError) {
    this.unionError = unionError;
    return this;
  }

  public void unsetUnionError() {
    this.unionError = null;
  }

  // Returns true if field unionError is set (has been assigned a value) and false otherwise
  public boolean isSetUnionError() {
    return this.unionError != null;
  }

  public void setUnionErrorIsSet(boolean __value) {
    if (!__value) {
      this.unionError = null;
    }
  }

  public MyStruct getStructError() {
    return this.structError;
  }

  public complexException setStructError(MyStruct structError) {
    this.structError = structError;
    return this;
  }

  public void unsetStructError() {
    this.structError = null;
  }

  // Returns true if field structError is set (has been assigned a value) and false otherwise
  public boolean isSetStructError() {
    return this.structError != null;
  }

  public void setStructErrorIsSet(boolean __value) {
    if (!__value) {
      this.structError = null;
    }
  }

  public Map<Long,String> getLsMap() {
    return this.lsMap;
  }

  public complexException setLsMap(Map<Long,String> lsMap) {
    this.lsMap = lsMap;
    return this;
  }

  public void unsetLsMap() {
    this.lsMap = null;
  }

  // Returns true if field lsMap is set (has been assigned a value) and false otherwise
  public boolean isSetLsMap() {
    return this.lsMap != null;
  }

  public void setLsMapIsSet(boolean __value) {
    if (!__value) {
      this.lsMap = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case MESSAGE:
      if (__value == null) {
        unsetMessage();
      } else {
        setMessage((String)__value);
      }
      break;

    case LISTSTRINGS:
      if (__value == null) {
        unsetListStrings();
      } else {
        setListStrings((List<String>)__value);
      }
      break;

    case ERRORENUM:
      if (__value == null) {
        unsetErrorEnum();
      } else {
        setErrorEnum((MyEnum)__value);
      }
      break;

    case UNIONERROR:
      if (__value == null) {
        unsetUnionError();
      } else {
        setUnionError((MyUnion)__value);
      }
      break;

    case STRUCTERROR:
      if (__value == null) {
        unsetStructError();
      } else {
        setStructError((MyStruct)__value);
      }
      break;

    case LSMAP:
      if (__value == null) {
        unsetLsMap();
      } else {
        setLsMap((Map<Long,String>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MESSAGE:
      return getMessage();

    case LISTSTRINGS:
      return getListStrings();

    case ERRORENUM:
      return getErrorEnum();

    case UNIONERROR:
      return getUnionError();

    case STRUCTERROR:
      return getStructError();

    case LSMAP:
      return getLsMap();

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
    if (!(_that instanceof complexException))
      return false;
    complexException that = (complexException)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetMessage(), that.isSetMessage(), this.message, that.message)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetListStrings(), that.isSetListStrings(), this.listStrings, that.listStrings)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetErrorEnum(), that.isSetErrorEnum(), this.errorEnum, that.errorEnum)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetUnionError(), that.isSetUnionError(), this.unionError, that.unionError)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStructError(), that.isSetStructError(), this.structError, that.structError)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetLsMap(), that.isSetLsMap(), this.lsMap, that.lsMap)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {message, listStrings, errorEnum, unionError, structError, lsMap});
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
        case MESSAGE:
          if (__field.type == TType.STRING) {
            this.message = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LISTSTRINGS:
          if (__field.type == TType.LIST) {
            {
              TList _list444 = iprot.readListBegin();
              this.listStrings = new ArrayList<String>(Math.max(0, _list444.size));
              for (int _i445 = 0; 
                   (_list444.size < 0) ? iprot.peekList() : (_i445 < _list444.size); 
                   ++_i445)
              {
                String _elem446;
                _elem446 = iprot.readString();
                this.listStrings.add(_elem446);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case ERRORENUM:
          if (__field.type == TType.I32) {
            this.errorEnum = MyEnum.findByValue(iprot.readI32());
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case UNIONERROR:
          if (__field.type == TType.STRUCT) {
            this.unionError = new MyUnion();
            this.unionError.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRUCTERROR:
          if (__field.type == TType.STRUCT) {
            this.structError = new MyStruct();
            this.structError.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case LSMAP:
          if (__field.type == TType.MAP) {
            {
              TMap _map447 = iprot.readMapBegin();
              this.lsMap = new HashMap<Long,String>(Math.max(0, 2*_map447.size));
              for (int _i448 = 0; 
                   (_map447.size < 0) ? iprot.peekMap() : (_i448 < _map447.size); 
                   ++_i448)
              {
                long _key449;
                String _val450;
                _key449 = iprot.readI64();
                _val450 = iprot.readString();
                this.lsMap.put(_key449, _val450);
              }
              iprot.readMapEnd();
            }
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
    if (this.message != null) {
      oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
      oprot.writeString(this.message);
      oprot.writeFieldEnd();
    }
    if (this.listStrings != null) {
      oprot.writeFieldBegin(LIST_STRINGS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.listStrings.size()));
        for (String _iter451 : this.listStrings)        {
          oprot.writeString(_iter451);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.errorEnum != null) {
      oprot.writeFieldBegin(ERROR_ENUM_FIELD_DESC);
      oprot.writeI32(this.errorEnum == null ? 0 : this.errorEnum.getValue());
      oprot.writeFieldEnd();
    }
    if (this.unionError != null) {
      if (isSetUnionError()) {
        oprot.writeFieldBegin(UNION_ERROR_FIELD_DESC);
        this.unionError.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.structError != null) {
      oprot.writeFieldBegin(STRUCT_ERROR_FIELD_DESC);
      this.structError.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.lsMap != null) {
      oprot.writeFieldBegin(LS_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.STRING, this.lsMap.size()));
        for (Map.Entry<Long, String> _iter452 : this.lsMap.entrySet())        {
          oprot.writeI64(_iter452.getKey());
          oprot.writeString(_iter452.getValue());
        }
        oprot.writeMapEnd();
      }
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
    StringBuilder sb = new StringBuilder("complexException");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("message");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getMessage() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getMessage(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("listStrings");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getListStrings() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getListStrings(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("errorEnum");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getErrorEnum() == null) {
      sb.append("null");
    } else {
      String errorEnum_name = this.getErrorEnum() == null ? "null" : this.getErrorEnum().name();
      if (errorEnum_name != null) {
        sb.append(errorEnum_name);
        sb.append(" (");
      }
      sb.append(this.getErrorEnum());
      if (errorEnum_name != null) {
        sb.append(")");
      }
    }
    first = false;
    if (isSetUnionError())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("unionError");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getUnionError() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getUnionError(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("structError");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getStructError() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getStructError(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("lsMap");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getLsMap() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getLsMap(), indent + 1, prettyPrint));
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

