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
public class RecursiveStruct implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("RecursiveStruct");
  private static final TField MES_FIELD_DESC = new TField("mes", TType.LIST, (short)1);

  public List<RecursiveStruct> mes;
  public static final int MES = 1;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(MES, new FieldMetaData("mes", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, RecursiveStruct.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(RecursiveStruct.class, metaDataMap);
  }

  public RecursiveStruct() {
  }

  public RecursiveStruct(
      List<RecursiveStruct> mes) {
    this();
    this.mes = mes;
  }

  public static class Builder {
    private List<RecursiveStruct> mes;

    public Builder() {
    }

    public Builder setMes(final List<RecursiveStruct> mes) {
      this.mes = mes;
      return this;
    }

    public RecursiveStruct build() {
      RecursiveStruct result = new RecursiveStruct();
      result.setMes(this.mes);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RecursiveStruct(RecursiveStruct other) {
    if (other.isSetMes()) {
      this.mes = TBaseHelper.deepCopy(other.mes);
    }
  }

  public RecursiveStruct deepCopy() {
    return new RecursiveStruct(this);
  }

  public List<RecursiveStruct> getMes() {
    return this.mes;
  }

  public RecursiveStruct setMes(List<RecursiveStruct> mes) {
    this.mes = mes;
    return this;
  }

  public void unsetMes() {
    this.mes = null;
  }

  // Returns true if field mes is set (has been assigned a value) and false otherwise
  public boolean isSetMes() {
    return this.mes != null;
  }

  public void setMesIsSet(boolean __value) {
    if (!__value) {
      this.mes = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case MES:
      if (__value == null) {
        unsetMes();
      } else {
        setMes((List<RecursiveStruct>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case MES:
      return getMes();

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
    if (!(_that instanceof RecursiveStruct))
      return false;
    RecursiveStruct that = (RecursiveStruct)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetMes(), that.isSetMes(), this.mes, that.mes)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {mes});
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
        case MES:
          if (__field.type == TType.LIST) {
            {
              TList _list12 = iprot.readListBegin();
              this.mes = new ArrayList<RecursiveStruct>(Math.max(0, _list12.size));
              for (int _i13 = 0; 
                   (_list12.size < 0) ? iprot.peekList() : (_i13 < _list12.size); 
                   ++_i13)
              {
                RecursiveStruct _elem14;
                _elem14 = new RecursiveStruct();
                _elem14.read(iprot);
                this.mes.add(_elem14);
              }
              iprot.readListEnd();
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
    if (this.mes != null) {
      if (isSetMes()) {
        oprot.writeFieldBegin(MES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.mes.size()));
          for (RecursiveStruct _iter15 : this.mes)          {
            _iter15.write(oprot);
          }
          oprot.writeListEnd();
        }
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
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("RecursiveStruct");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetMes())
    {
      sb.append(indentStr);
      sb.append("mes");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getMes() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getMes(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

