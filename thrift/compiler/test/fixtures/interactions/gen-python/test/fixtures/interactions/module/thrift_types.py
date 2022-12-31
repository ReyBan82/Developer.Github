#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#

from __future__ import annotations

import folly.iobuf as _fbthrift_iobuf
import thrift.python.types as _fbthrift_python_types
import thrift.python.exceptions as _fbthrift_python_exceptions



class CustomException(metaclass=_fbthrift_python_exceptions.GeneratedErrorMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            _fbthrift_python_types.FieldQualifier.Unqualified, # qualifier
            "message",  # name
            _fbthrift_python_types.typeinfo_string,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.CustomException"

    @staticmethod
    def __get_thrift_uri__():
        return None

    @staticmethod
    def __get_metadata__():
        return _fbthrift_metadata__exception_CustomException()

    def _to_python(self):
        return self

    def _to_py3(self):
        import importlib
        py3_types = importlib.import_module("test.fixtures.interactions.module.types")
        import thrift.py3.converter
        return thrift.py3.converter.to_py3_struct(py3_types.CustomException, self)

    def _to_py_deprecated(self):
        import importlib
        py_deprecated_types = importlib.import_module("test.fixtures.interactions.ttypes")
        import thrift.util.converter
        return thrift.util.converter.to_py_struct(py_deprecated_types.CustomException, self)

# This unfortunately has to be down here to prevent circular imports
import test.fixtures.interactions.module.thrift_metadata


def _fbthrift_metadata__exception_CustomException():
    return test.fixtures.interactions.module.thrift_metadata.gen_metadata_exception_CustomException()

_fbthrift_all_structs = [
    CustomException,
]
_fbthrift_python_types.fill_specs(*_fbthrift_all_structs)



class _fbthrift_MyService_foo_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyService_foo_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyService_interact_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            1,  # id
            _fbthrift_python_types.FieldQualifier.Unqualified, # qualifier
            "arg",  # name
            _fbthrift_python_types.typeinfo_i32,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )


class _fbthrift_MyService_interact_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyService_interactFast_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyService_interactFast_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_i32,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )


class _fbthrift_MyService_serialize_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyService_serialize_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_i32,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )


class _fbthrift_MyService_serialize_result_stream(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_i32,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )




class _fbthrift_MyInteraction_frobnicate_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteraction_frobnicate_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_i32,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
        (
            1,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "ex",  # name
            lambda: _fbthrift_python_types.StructTypeInfo(CustomException),  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )


class _fbthrift_MyInteraction_ping_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteraction_truthify_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteraction_truthify_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteraction_truthify_result_stream(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_bool,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )




class _fbthrift_MyInteractionFast_frobnicate_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteractionFast_frobnicate_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_i32,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )


class _fbthrift_MyInteractionFast_ping_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteractionFast_truthify_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteractionFast_truthify_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_MyInteractionFast_truthify_result_stream(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
        (
            0,  # id
            _fbthrift_python_types.FieldQualifier.Optional, # qualifier
            "success",  # name
            _fbthrift_python_types.typeinfo_bool,  # typeinfo
            None,  # default value
            None,  # adapter info
        ),
    )




class _fbthrift_SerialInteraction_frobnicate_args(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )


class _fbthrift_SerialInteraction_frobnicate_result(metaclass=_fbthrift_python_types.StructMeta):
    _fbthrift_SPEC = (
    )



_fbthrift_python_types.fill_specs(
    _fbthrift_MyService_foo_args,
    _fbthrift_MyService_foo_result,
    _fbthrift_MyService_interact_args,
    _fbthrift_MyService_interact_result,
    _fbthrift_MyService_interactFast_args,
    _fbthrift_MyService_interactFast_result,
    _fbthrift_MyService_serialize_args,
    _fbthrift_MyService_serialize_result,
    _fbthrift_MyService_serialize_result_stream,
    
    _fbthrift_MyInteraction_frobnicate_args,
    _fbthrift_MyInteraction_frobnicate_result,
    _fbthrift_MyInteraction_ping_args,
    _fbthrift_MyInteraction_truthify_args,
    _fbthrift_MyInteraction_truthify_result,
    _fbthrift_MyInteraction_truthify_result_stream,
    
    _fbthrift_MyInteractionFast_frobnicate_args,
    _fbthrift_MyInteractionFast_frobnicate_result,
    _fbthrift_MyInteractionFast_ping_args,
    _fbthrift_MyInteractionFast_truthify_args,
    _fbthrift_MyInteractionFast_truthify_result,
    _fbthrift_MyInteractionFast_truthify_result_stream,
    
    _fbthrift_SerialInteraction_frobnicate_args,
    _fbthrift_SerialInteraction_frobnicate_result,
    
)
