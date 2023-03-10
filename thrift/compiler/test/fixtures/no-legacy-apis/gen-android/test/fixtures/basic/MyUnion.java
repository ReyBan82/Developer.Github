/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.basic;

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
public class MyUnion extends TUnion<MyUnion> {
  private static final TStruct STRUCT_DESC = new TStruct("MyUnion");
  private static final TField MY_ENUM_FIELD_DESC = new TField("myEnum", TType.I32, (short)1);
  private static final TField MY_DATA_ITEM_FIELD_DESC = new TField("myDataItem", TType.STRUCT, (short)2);

  public static final int MYENUM = 1;
  public static final int MYDATAITEM = 2;

  public static final Map<Integer, FieldMetaData> metaDataMap = new HashMap<>();

  public MyUnion() {
    super();
  }

  public MyUnion(int setField, Object __value) {
    super(setField, __value);
  }

  public MyUnion(MyUnion other) {
    super(other);
  }

  public MyUnion deepCopy() {
    return new MyUnion(this);
  }

  public static MyUnion myEnum(MyEnum __value) {
    MyUnion x = new MyUnion();
    x.setMyEnum(__value);
    return x;
  }

  public static MyUnion myDataItem(MyStruct __value) {
    MyUnion x = new MyUnion();
    x.setMyDataItem(__value);
    return x;
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
      case MYDATAITEM:
        if (__field.type == MY_DATA_ITEM_FIELD_DESC.type) {
          MyStruct myDataItem;
          myDataItem = MyStruct.deserialize(iprot);
          return myDataItem;
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
      case MYDATAITEM:
        MyStruct myDataItem = (MyStruct)getFieldValue();
        myDataItem.write(oprot);
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
      case MYDATAITEM:
        return MY_DATA_ITEM_FIELD_DESC;
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

  public MyStruct getMyDataItem() {
    return (MyStruct) __getValue(MYDATAITEM);
  }

  public void setMyDataItem(MyStruct __value) {
    __setValue(MYDATAITEM, __value);
  }

  public boolean equals(Object other) {
    if (other instanceof MyUnion) {
      return equals((MyUnion)other);
    } else {
      return false;
    }
  }

  public boolean equals(MyUnion other) {
    return equalsNobinaryImpl(other);
  }


  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {getSetField(), getFieldValue()});
  }

}
