#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libc.stdint cimport (
    int8_t as cint8_t,
    int16_t as cint16_t,
    int32_t as cint32_t,
    int64_t as cint64_t,
    uint32_t as cuint32_t,
)
from libcpp.string cimport string
from libcpp cimport bool as cbool, nullptr, nullptr_t
from cpython cimport bool as pbool
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.utility cimport move as cmove
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap, pair as cpair
from thrift.py3.exceptions cimport cTException
cimport folly.iobuf as _fbthrift_iobuf
cimport thrift.py3.exceptions
cimport thrift.py3.types
from thrift.py3.types cimport (
    bstring,
    bytes_to_string,
    field_ref as __field_ref,
    optional_field_ref as __optional_field_ref,
    required_field_ref as __required_field_ref,
    terse_field_ref as __terse_field_ref,
    union_field_ref as __union_field_ref,
    get_union_field_value as __get_union_field_value,
)
from thrift.py3.common cimport (
    RpcOptions as __RpcOptions,
    Protocol as __Protocol,
    cThriftMetadata as __fbthrift_cThriftMetadata,
    MetadataBox as __MetadataBox,
)
from folly.optional cimport cOptional as __cOptional
cimport facebook.thrift.annotation.thrift.types as _facebook_thrift_annotation_thrift_types

cimport test.fixtures.basic.module.types_fields as _fbthrift_types_fields

cdef extern from "thrift/compiler/test/fixtures/no-legacy-apis/src/gen-py3/module/types.h":
  pass


cdef extern from "thrift/compiler/test/fixtures/no-legacy-apis/src/gen-cpp2/module_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass EnumMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "thrift/compiler/test/fixtures/no-legacy-apis/src/gen-cpp2/module_types.h" namespace "::test::fixtures::basic":
    cdef cppclass cMyEnum "::test::fixtures::basic::MyEnum":
        pass





cdef class MyEnum(thrift.py3.types.CompiledEnum):
    pass

cdef extern from "thrift/compiler/test/fixtures/no-legacy-apis/src/gen-cpp2/module_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass ExceptionMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "thrift/compiler/test/fixtures/no-legacy-apis/src/gen-cpp2/module_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass StructMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "thrift/compiler/test/fixtures/no-legacy-apis/src/gen-cpp2/module_types_custom_protocol.h" namespace "::test::fixtures::basic":

    cdef cppclass cMyStruct "::test::fixtures::basic::MyStruct":
        cMyStruct() except +
        cMyStruct(const cMyStruct&) except +
        bint operator==(cMyStruct&)
        bint operator!=(cMyStruct&)
        bint operator<(cMyStruct&)
        bint operator>(cMyStruct&)
        bint operator<=(cMyStruct&)
        bint operator>=(cMyStruct&)
        __field_ref[cint64_t] myIntField_ref "myIntField" ()
        __field_ref[string] myStringField_ref "myStringField" ()

    cdef enum cMyUnion__type "::test::fixtures::basic::MyUnion::Type":
        cMyUnion__type___EMPTY__ "::test::fixtures::basic::MyUnion::Type::__EMPTY__",
        cMyUnion__type_myEnum "::test::fixtures::basic::MyUnion::Type::myEnum",
        cMyUnion__type_myDataItem "::test::fixtures::basic::MyUnion::Type::myDataItem",

    cdef cppclass cMyUnion "::test::fixtures::basic::MyUnion":
        cMyUnion() except +
        cMyUnion(const cMyUnion&) except +
        bint operator==(cMyUnion&)
        bint operator!=(cMyUnion&)
        bint operator<(cMyUnion&)
        bint operator>(cMyUnion&)
        bint operator<=(cMyUnion&)
        bint operator>=(cMyUnion&)
        cMyUnion__type getType() const
        __union_field_ref[cMyEnum] myEnum_ref"myEnum_ref" ()
        __union_field_ref[cMyStruct] myDataItem_ref"myDataItem_ref" ()




cdef class MyStruct(thrift.py3.types.Struct):
    cdef shared_ptr[cMyStruct] _cpp_obj
    cdef _fbthrift_types_fields.__MyStruct_FieldsSetter _fields_setter
    cdef inline object myIntField_impl(self)
    cdef inline object myStringField_impl(self)

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyStruct])

cdef class __MyUnionType(thrift.py3.types.CompiledEnum):
    pass




cdef class MyUnion(thrift.py3.types.Union):
    cdef shared_ptr[cMyUnion] _cpp_obj
    cdef readonly __MyUnionType type
    cdef readonly object value
    cdef _load_cache(MyUnion self)

    @staticmethod
    cdef unique_ptr[cMyUnion] _make_instance(
        cMyUnion* base_instance,
        MyEnum myEnum,
        MyStruct myDataItem
    ) except *

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyUnion])



