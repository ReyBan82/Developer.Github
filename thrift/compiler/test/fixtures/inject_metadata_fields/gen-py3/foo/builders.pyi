#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import typing as _typing

import folly.iobuf as _fbthrift_iobuf
import thrift.py3.builder

import facebook.thrift.annotation.thrift.types as _facebook_thrift_annotation_thrift_types
import facebook.thrift.annotation.thrift.builders as _facebook_thrift_annotation_thrift_builders

import foo.types as _foo_types


class Fields_Builder(thrift.py3.builder.StructBuilder):
    injected_field: _typing.Optional[str]
    injected_structured_annotation_field: _typing.Optional[str]
    injected_unstructured_annotation_field: _typing.Optional[str]

    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...


