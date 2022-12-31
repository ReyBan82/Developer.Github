#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from thrift.py3.reflection cimport (
  MethodSpec as __MethodSpec,
  ArgumentSpec as __ArgumentSpec,
  NumberType as __NumberType,
)

import folly.iobuf as _fbthrift_iobuf

cimport facebook.thrift.annotation.cpp.types as _facebook_thrift_annotation_cpp_types

cimport module.types as _module_types


cdef __InterfaceSpec get_reflection__MyService(bint for_clients):
    cdef __InterfaceSpec spec = __InterfaceSpec._fbthrift_create(
        name="MyService",
        annotations={
        },
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="ping",
            arguments=(
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
                _module_types.MyException,
            ),
            annotations={
            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="getRandomData",
            arguments=(
            ),
            result=str,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="hasDataById",
            arguments=(
                __ArgumentSpec._fbthrift_create(
                    name="id",
                    type=int,
                    kind=__NumberType.I64,
                    annotations={
                    },
                ),
            ),
            result=bool,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="getDataById",
            arguments=(
                __ArgumentSpec._fbthrift_create(
                    name="id",
                    type=int,
                    kind=__NumberType.I64,
                    annotations={
                    },
                ),
            ),
            result=str,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="putDataById",
            arguments=(
                __ArgumentSpec._fbthrift_create(
                    name="id",
                    type=int,
                    kind=__NumberType.I64,
                    annotations={
                    },
                ),
                __ArgumentSpec._fbthrift_create(
                    name="data",
                    type=str,
                    kind=__NumberType.NOT_A_NUMBER,
                    annotations={
                    },
                ),
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="lobDataById",
            arguments=(
                __ArgumentSpec._fbthrift_create(
                    name="id",
                    type=int,
                    kind=__NumberType.I64,
                    annotations={
                    },
                ),
                __ArgumentSpec._fbthrift_create(
                    name="data",
                    type=str,
                    kind=__NumberType.NOT_A_NUMBER,
                    annotations={
                        """cpp.name""": """dataStr""",                    },
                ),
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="doNothing",
            arguments=(
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
                """cpp.name""": """cppDoNothing""",                """go.name""": """GoDoNothing""",            },
        )
    )
    return spec


cdef __InterfaceSpec get_reflection__MyServicePrioParent(bint for_clients):
    cdef __InterfaceSpec spec = __InterfaceSpec._fbthrift_create(
        name="MyServicePrioParent",
        annotations={
            """priority""": """HIGH""",        },
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="ping",
            arguments=(
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
                """priority""": """IMPORTANT""",            },
        )
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="pong",
            arguments=(
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
                """priority""": """HIGH_IMPORTANT""",            },
        )
    )
    return spec


cdef __InterfaceSpec get_reflection__MyServicePrioChild(bint for_clients):
    cdef __InterfaceSpec spec = __InterfaceSpec._fbthrift_create(
        name="MyServicePrioChild",
        annotations={
        },
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="pang",
            arguments=(
            ),
            result=None,
            result_kind=__NumberType.NOT_A_NUMBER,
            exceptions=(
            ),
            annotations={
                """priority""": """BEST_EFFORT""",            },
        )
    )
    return spec


cdef __InterfaceSpec get_reflection__BadService(bint for_clients):
    cdef __InterfaceSpec spec = __InterfaceSpec._fbthrift_create(
        name="BadService",
        annotations={
            """cpp.name""": """GoodService""",        },
    )
    spec.add_method(
        __MethodSpec._fbthrift_create(
            name="bar",
            arguments=(
            ),
            result=int,
            result_kind=__NumberType.I32,
            exceptions=(
            ),
            annotations={
            },
        )
    )
    return spec
