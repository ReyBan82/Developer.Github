#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import typing as _typing

import folly.iobuf as _fbthrift_iobuf
import thrift.py3.builder


import test.namespace_from_package_without_module_name.module.types as _test_namespace_from_package_without_module_name_module_types


class Foo_Builder(thrift.py3.builder.StructBuilder):
    MyInt: _typing.Optional[int]

    def __iter__(self) -> _typing.Iterator[_typing.Tuple[str, _typing.Any]]: ...


