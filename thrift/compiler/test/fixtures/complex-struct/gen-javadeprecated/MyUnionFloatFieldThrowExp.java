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

@SuppressWarnings({ "unused", "serial", "unchecked" })
public class MyUnionFloatFieldThrowExp extends TUnion<MyUnionFloatFieldThrowExp> {
  private static final TStruct STRUCT_DESC = new TStruct("MyUnionFloatFieldThrowExp");
  private static final TField MY_ENUM_FIELD_DESC = new TField("myEnum", TType.I32, (short)1);
  private static final TField SET_FLOAT_FIELD_DESC = new TField("setFloat", TType.LIST, (short)2);
  private static final TField MY_DATA_ITEM_FIELD_DESC = new TField("myDataItem", TType.STRUCT, (short)3);
  private static final TField COMPLEX_NESTED_STRUCT_FIELD_DESC = new TField("complexNestedStruct", TType.STRUCT, (short)4);

  public static final int MYENUM = 1;
  public static final int SETFLOAT = 2;
  public static final int MYDATAITEM = 3;
  public static final int COMPLEXNESTEDSTRUCT = 4;

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(MYENUM, new FieldMetaData("myEnum", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(SETFLOAT, new FieldMetaData("setFloat", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new ListMetaData(TType.LIST, 
                new FieldValueMetaData(TType.FLOAT)))));
    tmpMetaDataMap.put(MYDATAITEM, new FieldMetaData("myDataItem", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, MyDataItem.class)));
    tmpMetaDataMap.put(COMPLEXNESTEDSTRUCT, new FieldMetaData("complexNestedStruct", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, ComplexNestedStruct.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public MyUnionFloatFieldThrowExp() {
    super();
  }

  public MyUnionFloatFieldThrowExp(int setField, Object __value) {
    super(setField, __value);
  }

  public MyUnionFloatFieldThrowExp(MyUnionFloatFieldThrowExp other) {
    super(other);
  }

  public MyUnionFloatFieldThrowExp deepCopy() {
    return new MyUnionFloatFieldThrowExp(this);
  }

  public static MyUnionFloatFieldThrowExp myEnum(MyEnum __value) {
    MyUnionFloatFieldThrowExp x = new MyUnionFloatFieldThrowExp();
    x.setMyEnum(__value);
    return x;
  }

  public static MyUnionFloatFieldThrowExp setFloat(List<List<Float>> __value) {
    MyUnionFloatFieldThrowExp x = new MyUnionFloatFieldThrowExp();
    x.setSetFloat(__value);
    return x;
  }

  public static MyUnionFloatFieldThrowExp myDataItem(MyDataItem __value) {
    MyUnionFloatFieldThrowExp x = new MyUnionFloatFieldThrowExp();
    x.setMyDataItem(__value);
    return x;
  }

  public static MyUnionFloatFieldThrowExp complexNestedStruct(ComplexNestedStruct __value) {
    MyUnionFloatFieldThrowExp x = new MyUnionFloatFieldThrowExp();
    x.setComplexNestedStruct(__value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object __value) throws ClassCastException {
    switch (setField) {
      case MYENUM:
        if (__value instanceof MyEnum) {
          break;
        }
        throw new ClassCastException("Was expecting value of type MyEnum for field 'myEnum', but got " + __value.getClass().getSimpleName());
      case SETFLOAT:
        if (__value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List<List<Float>> for field 'setFloat', but got " + __value.getClass().getSimpleName());
      case MYDATAITEM:
        if (__value instanceof MyDataItem) {
          break;
        }
        throw new ClassCastException("Was expecting value of type MyDataItem for field 'myDataItem', but got " + __value.getClass().getSimpleName());
      case COMPLEXNESTEDSTRUCT:
        if (__value instanceof ComplexNestedStruct) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ComplexNestedStruct for field 'complexNestedStruct', but got " + __value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  public void read(TProtocol iprot) throws TException {
    setField_ = 0;
    value_ = null;
    iprot.readStructBegin(metaDataMap);
    TField __field = iprot.readFieldBegin();
    if (__field.type != TType.STOP)
    {
      value_ = readValue(iprot, __field);
      if (value_ != null)
      {
        switch (__field.id) {
          case MYENUM:
            if (__field.type == MY_ENUM_FIELD_DESC.type) {
              setField_ = __field.id;
            }
            break;
          case SETFLOAT:
            if (__field.type == SET_FLOAT_FIELD_DESC.type) {
              setField_ = __field.id;
            }
            break;
          case MYDATAITEM:
            if (__field.type == MY_DATA_ITEM_FIELD_DESC.type) {
              setField_ = __field.id;
            }
            break;
          case COMPLEXNESTEDSTRUCT:
            if (__field.type == COMPLEX_NESTED_STRUCT_FIELD_DESC.type) {
              setField_ = __field.id;
            }
            break;
        }
      }
      iprot.readFieldEnd();
      TField __stopField = iprot.readFieldBegin();
      if (__stopField.type != TType.STOP) {
        throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'MyUnionFloatFieldThrowExp' is missing a STOP byte");
      }
    }
    iprot.readStructEnd();
  }

  @Override
  protected Object readValue(TProtocol iprot, TField __field) throws TException {
    switch (__field.id) {
      case MYENUM:
        if (__field.type == MY_ENUM_FIELD_DESC.type) {
          MyEnum myEnum;
          myEnum = MyEnum.findByValue(iprot.readI32());
          return myEnum;
        }
        break;
      case SETFLOAT:
        if (__field.type == SET_FLOAT_FIELD_DESC.type) {
          List<List<Float>> setFloat;
          {
            TList _list201 = iprot.readListBegin();
            setFloat = new ArrayList<List<Float>>(Math.max(0, _list201.size));
            for (int _i202 = 0; 
                 (_list201.size < 0) ? iprot.peekList() : (_i202 < _list201.size); 
                 ++_i202)
            {
              List<Float> _elem203;
              {
                TList _list204 = iprot.readListBegin();
                _elem203 = new ArrayList<Float>(Math.max(0, _list204.size));
                for (int _i205 = 0; 
                     (_list204.size < 0) ? iprot.peekList() : (_i205 < _list204.size); 
                     ++_i205)
                {
                  float _elem206;
                  _elem206 = iprot.readFloat();
                  _elem203.add(_elem206);
                }
                iprot.readListEnd();
              }
              setFloat.add(_elem203);
            }
            iprot.readListEnd();
          }
          return setFloat;
        }
        break;
      case MYDATAITEM:
        if (__field.type == MY_DATA_ITEM_FIELD_DESC.type) {
          MyDataItem myDataItem;
          myDataItem = new MyDataItem();
          myDataItem.read(iprot);
          return myDataItem;
        }
        break;
      case COMPLEXNESTEDSTRUCT:
        if (__field.type == COMPLEX_NESTED_STRUCT_FIELD_DESC.type) {
          ComplexNestedStruct complexNestedStruct;
          complexNestedStruct = new ComplexNestedStruct();
          complexNestedStruct.read(iprot);
          return complexNestedStruct;
        }
        break;
    }
    TProtocolUtil.skip(iprot, __field.type);
    return null;
  }

  @Override
  protected void writeValue(TProtocol oprot, short setField, Object __value) throws TException {
    switch (setField) {
      case MYENUM:
        MyEnum myEnum = (MyEnum)getFieldValue();
        oprot.writeI32(myEnum == null ? 0 : myEnum.getValue());
        return;
      case SETFLOAT:
        List<List<Float>> setFloat = (List<List<Float>>)getFieldValue();
        {
          oprot.writeListBegin(new TList(TType.LIST, setFloat.size()));
          for (List<Float> _iter207 : setFloat)          {
            {
              oprot.writeListBegin(new TList(TType.FLOAT, _iter207.size()));
              for (float _iter208 : _iter207)              {
                oprot.writeFloat(_iter208);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeListEnd();
        }
        return;
      case MYDATAITEM:
        MyDataItem myDataItem = (MyDataItem)getFieldValue();
        myDataItem.write(oprot);
        return;
      case COMPLEXNESTEDSTRUCT:
        ComplexNestedStruct complexNestedStruct = (ComplexNestedStruct)getFieldValue();
        complexNestedStruct.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case MYENUM:
        return MY_ENUM_FIELD_DESC;
      case SETFLOAT:
        return SET_FLOAT_FIELD_DESC;
      case MYDATAITEM:
        return MY_DATA_ITEM_FIELD_DESC;
      case COMPLEXNESTEDSTRUCT:
        return COMPLEX_NESTED_STRUCT_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected Map<Integer, FieldMetaData> getMetaDataMap() { return metaDataMap; }

  private Object __getValue(int expectedFieldId) {
    if (getSetField() == expectedFieldId) {
      return getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field '" + getFieldDesc(expectedFieldId).name + "' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  private void __setValue(int fieldId, Object __value) {
    if (__value == null) throw new NullPointerException();
    setField_ = fieldId;
    value_ = __value;
  }

  /**
   * 
   * @see MyEnum
   */
  public MyEnum getMyEnum() {
    return (MyEnum) __getValue(MYENUM);
  }

  /**
   * 
   * @see MyEnum
   */
  public void setMyEnum(MyEnum __value) {
    __setValue(MYENUM, __value);
  }

  public List<List<Float>> getSetFloat() {
    return (List<List<Float>>) __getValue(SETFLOAT);
  }

  public void setSetFloat(List<List<Float>> __value) {
    __setValue(SETFLOAT, __value);
  }

  public MyDataItem getMyDataItem() {
    return (MyDataItem) __getValue(MYDATAITEM);
  }

  public void setMyDataItem(MyDataItem __value) {
    __setValue(MYDATAITEM, __value);
  }

  public ComplexNestedStruct getComplexNestedStruct() {
    return (ComplexNestedStruct) __getValue(COMPLEXNESTEDSTRUCT);
  }

  public void setComplexNestedStruct(ComplexNestedStruct __value) {
    __setValue(COMPLEXNESTEDSTRUCT, __value);
  }

  public boolean equals(Object other) {
    if (other instanceof MyUnionFloatFieldThrowExp) {
      return equals((MyUnionFloatFieldThrowExp)other);
    } else {
      return false;
    }
  }

  public boolean equals(MyUnionFloatFieldThrowExp other) {
    return equalsNobinaryImpl(other);
  }


  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {getSetField(), getFieldValue()});
  }

}
