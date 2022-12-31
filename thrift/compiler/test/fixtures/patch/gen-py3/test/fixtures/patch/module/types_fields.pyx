#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
cimport cython as __cython
from cython.operator cimport dereference as deref
from libcpp.memory cimport make_unique, unique_ptr, shared_ptr
from thrift.py3.types cimport assign_unique_ptr, assign_shared_ptr, assign_shared_const_ptr

cimport thrift.py3.types
from thrift.py3.types cimport (
    reset_field as __reset_field,
    StructFieldsSetter as __StructFieldsSetter
)

from thrift.py3.types cimport const_pointer_cast


@__cython.auto_pickle(False)
cdef class __MyData_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __MyData_FieldsSetter _fbthrift_create(_test_fixtures_patch_module_types.cMyData* struct_cpp_obj):
        cdef __MyData_FieldsSetter __fbthrift_inst = __MyData_FieldsSetter.__new__(__MyData_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"data1")] = __MyData_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"data2")] = __MyData_FieldsSetter._set_field_1
        return __fbthrift_inst

    cdef void set_field(__MyData_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __MyData_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field data1
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyData](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(_fbthrift_value, str):
            raise TypeError(f'data1 is not a { str !r}.')
        deref(self._struct_cpp_obj).data1_ref().assign(cmove(bytes_to_string(_fbthrift_value.encode('utf-8'))))

    cdef void _set_field_1(self, _fbthrift_value) except *:
        # for field data2
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyData](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'data2 is not a { int !r}.')
        _fbthrift_value = <cint32_t> _fbthrift_value
        deref(self._struct_cpp_obj).data2_ref().assign(_fbthrift_value)


@__cython.auto_pickle(False)
cdef class __MyStruct_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __MyStruct_FieldsSetter _fbthrift_create(_test_fixtures_patch_module_types.cMyStruct* struct_cpp_obj):
        cdef __MyStruct_FieldsSetter __fbthrift_inst = __MyStruct_FieldsSetter.__new__(__MyStruct_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"boolVal")] = __MyStruct_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"byteVal")] = __MyStruct_FieldsSetter._set_field_1
        __fbthrift_inst._setters[__cstring_view(<const char*>"i16Val")] = __MyStruct_FieldsSetter._set_field_2
        __fbthrift_inst._setters[__cstring_view(<const char*>"i32Val")] = __MyStruct_FieldsSetter._set_field_3
        __fbthrift_inst._setters[__cstring_view(<const char*>"i64Val")] = __MyStruct_FieldsSetter._set_field_4
        __fbthrift_inst._setters[__cstring_view(<const char*>"floatVal")] = __MyStruct_FieldsSetter._set_field_5
        __fbthrift_inst._setters[__cstring_view(<const char*>"doubleVal")] = __MyStruct_FieldsSetter._set_field_6
        __fbthrift_inst._setters[__cstring_view(<const char*>"stringVal")] = __MyStruct_FieldsSetter._set_field_7
        __fbthrift_inst._setters[__cstring_view(<const char*>"binaryVal")] = __MyStruct_FieldsSetter._set_field_8
        __fbthrift_inst._setters[__cstring_view(<const char*>"enumVal")] = __MyStruct_FieldsSetter._set_field_9
        __fbthrift_inst._setters[__cstring_view(<const char*>"structVal")] = __MyStruct_FieldsSetter._set_field_10
        __fbthrift_inst._setters[__cstring_view(<const char*>"unionVal")] = __MyStruct_FieldsSetter._set_field_11
        __fbthrift_inst._setters[__cstring_view(<const char*>"lateStructVal")] = __MyStruct_FieldsSetter._set_field_12
        __fbthrift_inst._setters[__cstring_view(<const char*>"durationVal")] = __MyStruct_FieldsSetter._set_field_13
        __fbthrift_inst._setters[__cstring_view(<const char*>"optBoolVal")] = __MyStruct_FieldsSetter._set_field_14
        __fbthrift_inst._setters[__cstring_view(<const char*>"optByteVal")] = __MyStruct_FieldsSetter._set_field_15
        __fbthrift_inst._setters[__cstring_view(<const char*>"optI16Val")] = __MyStruct_FieldsSetter._set_field_16
        __fbthrift_inst._setters[__cstring_view(<const char*>"optI32Val")] = __MyStruct_FieldsSetter._set_field_17
        __fbthrift_inst._setters[__cstring_view(<const char*>"optI64Val")] = __MyStruct_FieldsSetter._set_field_18
        __fbthrift_inst._setters[__cstring_view(<const char*>"optFloatVal")] = __MyStruct_FieldsSetter._set_field_19
        __fbthrift_inst._setters[__cstring_view(<const char*>"optDoubleVal")] = __MyStruct_FieldsSetter._set_field_20
        __fbthrift_inst._setters[__cstring_view(<const char*>"optStringVal")] = __MyStruct_FieldsSetter._set_field_21
        __fbthrift_inst._setters[__cstring_view(<const char*>"optBinaryVal")] = __MyStruct_FieldsSetter._set_field_22
        __fbthrift_inst._setters[__cstring_view(<const char*>"optEnumVal")] = __MyStruct_FieldsSetter._set_field_23
        __fbthrift_inst._setters[__cstring_view(<const char*>"optStructVal")] = __MyStruct_FieldsSetter._set_field_24
        __fbthrift_inst._setters[__cstring_view(<const char*>"optLateStructVal")] = __MyStruct_FieldsSetter._set_field_25
        __fbthrift_inst._setters[__cstring_view(<const char*>"optListVal")] = __MyStruct_FieldsSetter._set_field_26
        __fbthrift_inst._setters[__cstring_view(<const char*>"optSetVal")] = __MyStruct_FieldsSetter._set_field_27
        __fbthrift_inst._setters[__cstring_view(<const char*>"optMapVal")] = __MyStruct_FieldsSetter._set_field_28
        __fbthrift_inst._setters[__cstring_view(<const char*>"listMap")] = __MyStruct_FieldsSetter._set_field_29
        __fbthrift_inst._setters[__cstring_view(<const char*>"mapMap")] = __MyStruct_FieldsSetter._set_field_30
        return __fbthrift_inst

    cdef void set_field(__MyStruct_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __MyStruct_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field boolVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(_fbthrift_value, bool):
            raise TypeError(f'boolVal is not a { bool !r}.')
        deref(self._struct_cpp_obj).boolVal_ref().assign(_fbthrift_value)

    cdef void _set_field_1(self, _fbthrift_value) except *:
        # for field byteVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'byteVal is not a { int !r}.')
        _fbthrift_value = <cint8_t> _fbthrift_value
        deref(self._struct_cpp_obj).byteVal_ref().assign(_fbthrift_value)

    cdef void _set_field_2(self, _fbthrift_value) except *:
        # for field i16Val
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 2)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'i16Val is not a { int !r}.')
        _fbthrift_value = <cint16_t> _fbthrift_value
        deref(self._struct_cpp_obj).i16Val_ref().assign(_fbthrift_value)

    cdef void _set_field_3(self, _fbthrift_value) except *:
        # for field i32Val
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 3)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'i32Val is not a { int !r}.')
        _fbthrift_value = <cint32_t> _fbthrift_value
        deref(self._struct_cpp_obj).i32Val_ref().assign(_fbthrift_value)

    cdef void _set_field_4(self, _fbthrift_value) except *:
        # for field i64Val
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 4)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'i64Val is not a { int !r}.')
        _fbthrift_value = <cint64_t> _fbthrift_value
        deref(self._struct_cpp_obj).i64Val_ref().assign(_fbthrift_value)

    cdef void _set_field_5(self, _fbthrift_value) except *:
        # for field floatVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 5)
            return
        if not isinstance(_fbthrift_value, (float, int)):
            raise TypeError(f'floatVal is not a { float !r}.')
        deref(self._struct_cpp_obj).floatVal_ref().assign(_fbthrift_value)

    cdef void _set_field_6(self, _fbthrift_value) except *:
        # for field doubleVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 6)
            return
        if not isinstance(_fbthrift_value, (float, int)):
            raise TypeError(f'doubleVal is not a { float !r}.')
        deref(self._struct_cpp_obj).doubleVal_ref().assign(_fbthrift_value)

    cdef void _set_field_7(self, _fbthrift_value) except *:
        # for field stringVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 7)
            return
        if not isinstance(_fbthrift_value, str):
            raise TypeError(f'stringVal is not a { str !r}.')
        deref(self._struct_cpp_obj).stringVal_ref().assign(cmove(bytes_to_string(_fbthrift_value.encode('utf-8'))))

    cdef void _set_field_8(self, _fbthrift_value) except *:
        # for field binaryVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 8)
            return
        if not isinstance(_fbthrift_value, _fbthrift_iobuf.IOBuf):
            raise TypeError(f'binaryVal is not a { _fbthrift_iobuf.IOBuf !r}.')
        deref(self._struct_cpp_obj).binaryVal_ref().assign(deref((<_fbthrift_iobuf.IOBuf?>_fbthrift_value).c_clone()))

    cdef void _set_field_9(self, _fbthrift_value) except *:
        # for field enumVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 9)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.MyEnum):
            raise TypeError(f'field enumVal value: {repr(_fbthrift_value)} is not of the enum type { _test_fixtures_patch_module_types.MyEnum }.')
        deref(self._struct_cpp_obj).enumVal_ref().assign(<_test_fixtures_patch_module_types.cMyEnum><int>_fbthrift_value)

    cdef void _set_field_10(self, _fbthrift_value) except *:
        # for field structVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 10)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.MyData):
            raise TypeError(f'structVal is not a { _test_fixtures_patch_module_types.MyData !r}.')
        deref(self._struct_cpp_obj).structVal_ref().assign(deref((<_test_fixtures_patch_module_types.MyData?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_11(self, _fbthrift_value) except *:
        # for field unionVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 11)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.MyUnion):
            raise TypeError(f'unionVal is not a { _test_fixtures_patch_module_types.MyUnion !r}.')
        deref(self._struct_cpp_obj).unionVal_ref().assign(deref((<_test_fixtures_patch_module_types.MyUnion?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_12(self, _fbthrift_value) except *:
        # for field lateStructVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 12)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.LateDefStruct):
            raise TypeError(f'lateStructVal is not a { _test_fixtures_patch_module_types.LateDefStruct !r}.')
        deref(self._struct_cpp_obj).lateStructVal_ref().assign(deref((<_test_fixtures_patch_module_types.LateDefStruct?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_13(self, _fbthrift_value) except *:
        # for field durationVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 13)
            return
        if not isinstance(_fbthrift_value, _apache_thrift_type_standard_types.DurationStruct):
            raise TypeError(f'durationVal is not a { _apache_thrift_type_standard_types.DurationStruct !r}.')
        deref(self._struct_cpp_obj).durationVal_ref().assign(deref((<_apache_thrift_type_standard_types.DurationStruct?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_14(self, _fbthrift_value) except *:
        # for field optBoolVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 14)
            return
        if not isinstance(_fbthrift_value, bool):
            raise TypeError(f'optBoolVal is not a { bool !r}.')
        deref(self._struct_cpp_obj).optBoolVal_ref().assign(_fbthrift_value)

    cdef void _set_field_15(self, _fbthrift_value) except *:
        # for field optByteVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 15)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'optByteVal is not a { int !r}.')
        _fbthrift_value = <cint8_t> _fbthrift_value
        deref(self._struct_cpp_obj).optByteVal_ref().assign(_fbthrift_value)

    cdef void _set_field_16(self, _fbthrift_value) except *:
        # for field optI16Val
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 16)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'optI16Val is not a { int !r}.')
        _fbthrift_value = <cint16_t> _fbthrift_value
        deref(self._struct_cpp_obj).optI16Val_ref().assign(_fbthrift_value)

    cdef void _set_field_17(self, _fbthrift_value) except *:
        # for field optI32Val
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 17)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'optI32Val is not a { int !r}.')
        _fbthrift_value = <cint32_t> _fbthrift_value
        deref(self._struct_cpp_obj).optI32Val_ref().assign(_fbthrift_value)

    cdef void _set_field_18(self, _fbthrift_value) except *:
        # for field optI64Val
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 18)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'optI64Val is not a { int !r}.')
        _fbthrift_value = <cint64_t> _fbthrift_value
        deref(self._struct_cpp_obj).optI64Val_ref().assign(_fbthrift_value)

    cdef void _set_field_19(self, _fbthrift_value) except *:
        # for field optFloatVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 19)
            return
        if not isinstance(_fbthrift_value, (float, int)):
            raise TypeError(f'optFloatVal is not a { float !r}.')
        deref(self._struct_cpp_obj).optFloatVal_ref().assign(_fbthrift_value)

    cdef void _set_field_20(self, _fbthrift_value) except *:
        # for field optDoubleVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 20)
            return
        if not isinstance(_fbthrift_value, (float, int)):
            raise TypeError(f'optDoubleVal is not a { float !r}.')
        deref(self._struct_cpp_obj).optDoubleVal_ref().assign(_fbthrift_value)

    cdef void _set_field_21(self, _fbthrift_value) except *:
        # for field optStringVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 21)
            return
        if not isinstance(_fbthrift_value, str):
            raise TypeError(f'optStringVal is not a { str !r}.')
        deref(self._struct_cpp_obj).optStringVal_ref().assign(cmove(bytes_to_string(_fbthrift_value.encode('utf-8'))))

    cdef void _set_field_22(self, _fbthrift_value) except *:
        # for field optBinaryVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 22)
            return
        if not isinstance(_fbthrift_value, _fbthrift_iobuf.IOBuf):
            raise TypeError(f'optBinaryVal is not a { _fbthrift_iobuf.IOBuf !r}.')
        deref(self._struct_cpp_obj).optBinaryVal_ref().assign(deref((<_fbthrift_iobuf.IOBuf?>_fbthrift_value).c_clone()))

    cdef void _set_field_23(self, _fbthrift_value) except *:
        # for field optEnumVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 23)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.MyEnum):
            raise TypeError(f'field optEnumVal value: {repr(_fbthrift_value)} is not of the enum type { _test_fixtures_patch_module_types.MyEnum }.')
        deref(self._struct_cpp_obj).optEnumVal_ref().assign(<_test_fixtures_patch_module_types.cMyEnum><int>_fbthrift_value)

    cdef void _set_field_24(self, _fbthrift_value) except *:
        # for field optStructVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 24)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.MyData):
            raise TypeError(f'optStructVal is not a { _test_fixtures_patch_module_types.MyData !r}.')
        deref(self._struct_cpp_obj).optStructVal_ref().assign(deref((<_test_fixtures_patch_module_types.MyData?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_25(self, _fbthrift_value) except *:
        # for field optLateStructVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 25)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.LateDefStruct):
            raise TypeError(f'optLateStructVal is not a { _test_fixtures_patch_module_types.LateDefStruct !r}.')
        deref(self._struct_cpp_obj).optLateStructVal_ref().assign(deref((<_test_fixtures_patch_module_types.LateDefStruct?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_26(self, _fbthrift_value) except *:
        # for field optListVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 26)
            return
        deref(self._struct_cpp_obj).optListVal_ref().assign(deref(_test_fixtures_patch_module_types.List__i16(_fbthrift_value)._cpp_obj))

    cdef void _set_field_27(self, _fbthrift_value) except *:
        # for field optSetVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 27)
            return
        deref(self._struct_cpp_obj).optSetVal_ref().assign(deref(_test_fixtures_patch_module_types.Set__string(_fbthrift_value)._cpp_obj))

    cdef void _set_field_28(self, _fbthrift_value) except *:
        # for field optMapVal
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 28)
            return
        deref(self._struct_cpp_obj).optMapVal_ref().assign(deref(_test_fixtures_patch_module_types.Map__string_string(_fbthrift_value)._cpp_obj))

    cdef void _set_field_29(self, _fbthrift_value) except *:
        # for field listMap
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 29)
            return
        deref(self._struct_cpp_obj).listMap_ref().assign(deref(_test_fixtures_patch_module_types.List__Map__string_i32(_fbthrift_value)._cpp_obj))

    cdef void _set_field_30(self, _fbthrift_value) except *:
        # for field mapMap
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cMyStruct](deref(self._struct_cpp_obj), 30)
            return
        deref(self._struct_cpp_obj).mapMap_ref().assign(deref(_test_fixtures_patch_module_types.Map__string_Map__string_i32(_fbthrift_value)._cpp_obj))


@__cython.auto_pickle(False)
cdef class __LateDefStruct_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __LateDefStruct_FieldsSetter _fbthrift_create(_test_fixtures_patch_module_types.cLateDefStruct* struct_cpp_obj):
        cdef __LateDefStruct_FieldsSetter __fbthrift_inst = __LateDefStruct_FieldsSetter.__new__(__LateDefStruct_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        return __fbthrift_inst

    cdef void set_field(__LateDefStruct_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __LateDefStruct_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)


@__cython.auto_pickle(False)
cdef class __Recursive_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Recursive_FieldsSetter _fbthrift_create(_test_fixtures_patch_module_types.cRecursive* struct_cpp_obj):
        cdef __Recursive_FieldsSetter __fbthrift_inst = __Recursive_FieldsSetter.__new__(__Recursive_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"nodes")] = __Recursive_FieldsSetter._set_field_0
        return __fbthrift_inst

    cdef void set_field(__Recursive_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Recursive_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field nodes
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cRecursive](deref(self._struct_cpp_obj), 0)
            return
        deref(self._struct_cpp_obj).nodes_ref().assign(deref(_test_fixtures_patch_module_types.Map__string_Recursive(_fbthrift_value)._cpp_obj))


@__cython.auto_pickle(False)
cdef class __Bar_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Bar_FieldsSetter _fbthrift_create(_test_fixtures_patch_module_types.cBar* struct_cpp_obj):
        cdef __Bar_FieldsSetter __fbthrift_inst = __Bar_FieldsSetter.__new__(__Bar_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"loop")] = __Bar_FieldsSetter._set_field_0
        return __fbthrift_inst

    cdef void set_field(__Bar_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Bar_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field loop
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cBar](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.Loop):
            raise TypeError(f'loop is not a { _test_fixtures_patch_module_types.Loop !r}.')
        assign_unique_ptr[_test_fixtures_patch_module_types.cLoop](deref(self._struct_cpp_obj).loop_ref(), make_unique[_test_fixtures_patch_module_types.cLoop](deref((<_test_fixtures_patch_module_types.Loop?>_fbthrift_value)._cpp_obj)))


@__cython.auto_pickle(False)
cdef class __Loop_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Loop_FieldsSetter _fbthrift_create(_test_fixtures_patch_module_types.cLoop* struct_cpp_obj):
        cdef __Loop_FieldsSetter __fbthrift_inst = __Loop_FieldsSetter.__new__(__Loop_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"bar")] = __Loop_FieldsSetter._set_field_0
        return __fbthrift_inst

    cdef void set_field(__Loop_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Loop_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field bar
        if _fbthrift_value is None:
            __reset_field[_test_fixtures_patch_module_types.cLoop](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(_fbthrift_value, _test_fixtures_patch_module_types.Bar):
            raise TypeError(f'bar is not a { _test_fixtures_patch_module_types.Bar !r}.')
        deref(self._struct_cpp_obj).bar_ref().assign(deref((<_test_fixtures_patch_module_types.Bar?> _fbthrift_value)._cpp_obj))

