#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
from cpython cimport bool as pbool, int as pint, float as pfloat

cimport folly.iobuf as _fbthrift_iobuf

cimport thrift.py3.builder


cimport module.types as _module_types

cdef class InitialResponse_Builder(thrift.py3.builder.StructBuilder):
    cdef public str content


cdef class FinalResponse_Builder(thrift.py3.builder.StructBuilder):
    cdef public str content


cdef class SinkPayload_Builder(thrift.py3.builder.StructBuilder):
    cdef public str content


cdef class CompatibleWithKeywordSink_Builder(thrift.py3.builder.StructBuilder):
    cdef public str sink


cdef class InitialException_Builder(thrift.py3.builder.StructBuilder):
    cdef public str reason


cdef class SinkException1_Builder(thrift.py3.builder.StructBuilder):
    cdef public str reason


cdef class SinkException2_Builder(thrift.py3.builder.StructBuilder):
    cdef public pint reason


