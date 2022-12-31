#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#


import folly.iobuf as _fbthrift_iobuf

from thrift.py3.reflection cimport (
    NumberType as __NumberType,
    StructType as __StructType,
    Qualifier as __Qualifier,
)

cimport facebook.thrift.annotation.cpp.types as _facebook_thrift_annotation_cpp_types

cimport module.types as _module_types

from thrift.py3.types cimport (
    constant_shared_ptr,
    default_inst,
)


cdef __StructSpec get_reflection__MyUnion():
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="MyUnion",
        kind=__StructType.UNION,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="anInteger",
            type=int,
            kind=__NumberType.I32,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="aString",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__MyField():
    cdef _module_types.MyField defaults = _module_types.MyField._fbthrift_create(
        constant_shared_ptr[_module_types.cMyField](
            default_inst[_module_types.cMyField]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="MyField",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="opt_value",
            type=int,
            kind=__NumberType.I64,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="value",
            type=int,
            kind=__NumberType.I64,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_value",
            type=int,
            kind=__NumberType.I64,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=4,
            name="opt_enum_value",
            type=_module_types.MyEnum,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=5,
            name="enum_value",
            type=_module_types.MyEnum,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=6,
            name="req_enum_value",
            type=_module_types.MyEnum,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=7,
            name="opt_str_value",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=8,
            name="str_value",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=9,
            name="req_str_value",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__MyStruct():
    cdef _module_types.MyStruct defaults = _module_types.MyStruct._fbthrift_create(
        constant_shared_ptr[_module_types.cMyStruct](
            default_inst[_module_types.cMyStruct]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="MyStruct",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="opt_ref",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="ref",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_ref",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithUnion():
    cdef _module_types.StructWithUnion defaults = _module_types.StructWithUnion._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithUnion](
            default_inst[_module_types.cStructWithUnion]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithUnion",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="u",
            type=_module_types.MyUnion,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="aDouble",
            type=float,
            kind=__NumberType.DOUBLE,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="f",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__RecursiveStruct():
    cdef _module_types.RecursiveStruct defaults = _module_types.RecursiveStruct._fbthrift_create(
        constant_shared_ptr[_module_types.cRecursiveStruct](
            default_inst[_module_types.cRecursiveStruct]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="RecursiveStruct",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="mes",
            type=_module_types.List__RecursiveStruct,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """swift.recursive_reference""": """true""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithContainers():
    cdef _module_types.StructWithContainers defaults = _module_types.StructWithContainers._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithContainers](
            default_inst[_module_types.cStructWithContainers]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithContainers",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="list_ref",
            type=_module_types.List__i32,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="set_ref",
            type=_module_types.Set__i32,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="map_ref",
            type=_module_types.Map__i32_i32,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """true""",                """cpp2.ref""": """true""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=4,
            name="list_ref_unique",
            type=_module_types.List__i32,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """unique""",                """cpp2.ref_type""": """unique""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=5,
            name="set_ref_shared",
            type=_module_types.Set__i32,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared""",                """cpp2.ref_type""": """shared""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=6,
            name="list_ref_shared_const",
            type=_module_types.List__i32,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",                """cpp2.ref_type""": """shared_const""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithSharedConst():
    cdef _module_types.StructWithSharedConst defaults = _module_types.StructWithSharedConst._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithSharedConst](
            default_inst[_module_types.cStructWithSharedConst]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithSharedConst",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="opt_shared_const",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",                """cpp2.ref_type""": """shared_const""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="shared_const",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",                """cpp2.ref_type""": """shared_const""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_shared_const",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",                """cpp2.ref_type""": """shared_const""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__Empty():
    cdef _module_types.Empty defaults = _module_types.Empty._fbthrift_create(
        constant_shared_ptr[_module_types.cEmpty](
            default_inst[_module_types.cEmpty]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="Empty",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    return spec
cdef __StructSpec get_reflection__StructWithRef():
    cdef _module_types.StructWithRef defaults = _module_types.StructWithRef._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithRef](
            default_inst[_module_types.cStructWithRef]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithRef",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="def_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """1""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="opt_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref""": """1""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref""": """1""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithBox():
    cdef _module_types.StructWithBox defaults = _module_types.StructWithBox._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithBox](
            default_inst[_module_types.cStructWithBox]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithBox",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="a",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """thrift.box""": """1""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="b",
            type=_module_types.List__i64,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """thrift.box""": """1""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="c",
            type=_module_types.StructWithRef,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """thrift.box""": """1""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithNonOptionalBox():
    cdef _module_types.StructWithNonOptionalBox defaults = _module_types.StructWithNonOptionalBox._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithNonOptionalBox](
            default_inst[_module_types.cStructWithNonOptionalBox]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithNonOptionalBox",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="a",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.box""": """1""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="b",
            type=_module_types.List__i64,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.box""": """1""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="c",
            type=_module_types.StructWithRef,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.box""": """1""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithInternBox():
    cdef _module_types.StructWithInternBox defaults = _module_types.StructWithInternBox._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithInternBox](
            default_inst[_module_types.cStructWithInternBox]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithInternBox",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="field1",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="field2",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="field3",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=4,
            name="field4",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__AdaptedStructWithInternBox():
    cdef _module_types.AdaptedStructWithInternBox defaults = _module_types.AdaptedStructWithInternBox._fbthrift_create(
        constant_shared_ptr[_module_types.cAdaptedStructWithInternBox](
            default_inst[_module_types.cAdaptedStructWithInternBox]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="AdaptedStructWithInternBox",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="field1",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="field2",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="field3",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=4,
            name="field4",
            type=_module_types.MyField,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithRefTypeUnique():
    cdef _module_types.StructWithRefTypeUnique defaults = _module_types.StructWithRefTypeUnique._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithRefTypeUnique](
            default_inst[_module_types.cStructWithRefTypeUnique]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithRefTypeUnique",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="def_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """unique""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="opt_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref_type""": """unique""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref_type""": """unique""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithRefTypeShared():
    cdef _module_types.StructWithRefTypeShared defaults = _module_types.StructWithRefTypeShared._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithRefTypeShared](
            default_inst[_module_types.cStructWithRefTypeShared]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithRefTypeShared",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="def_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="opt_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref_type""": """shared""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithRefTypeSharedConst():
    cdef _module_types.StructWithRefTypeSharedConst defaults = _module_types.StructWithRefTypeSharedConst._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithRefTypeSharedConst](
            default_inst[_module_types.cStructWithRefTypeSharedConst]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithRefTypeSharedConst",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="def_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="opt_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="req_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared_const""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithRefAndAnnotCppNoexceptMoveCtor():
    cdef _module_types.StructWithRefAndAnnotCppNoexceptMoveCtor defaults = _module_types.StructWithRefAndAnnotCppNoexceptMoveCtor._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithRefAndAnnotCppNoexceptMoveCtor](
            default_inst[_module_types.cStructWithRefAndAnnotCppNoexceptMoveCtor]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithRefAndAnnotCppNoexceptMoveCtor",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="def_field",
            type=_module_types.Empty,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref""": """1""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__StructWithString():
    cdef _module_types.StructWithString defaults = _module_types.StructWithString._fbthrift_create(
        constant_shared_ptr[_module_types.cStructWithString](
            default_inst[_module_types.cStructWithString]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="StructWithString",
        kind=__StructType.STRUCT,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="def_unique_string_ref",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=defaults.def_unique_string_ref,
            annotations={
                """cpp.ref_type""": """unique""",                """cpp2.ref_type""": """unique""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="def_shared_string_ref",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=defaults.def_shared_string_ref,
            annotations={
                """cpp.ref_type""": """shared""",                """cpp2.ref_type""": """shared""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=3,
            name="def_shared_string_const_ref",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=defaults.def_shared_string_const_ref,
            annotations={
                """cpp.ref_type""": """shared_const""",                """cpp2.ref_type""": """shared_const""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=4,
            name="unique_string_ref",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """unique""",                """cpp2.ref_type""": """unique""",            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=5,
            name="shared_string_ref",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """cpp.ref_type""": """shared""",                """cpp2.ref_type""": """shared""",            },
        ),
    )
    return spec
cdef __ListSpec get_reflection__List__RecursiveStruct():
    return __ListSpec._fbthrift_create(
        value=_module_types.RecursiveStruct,
        kind=__NumberType.NOT_A_NUMBER,
    )

cdef __ListSpec get_reflection__List__i32():
    return __ListSpec._fbthrift_create(
        value=int,
        kind=__NumberType.I32,
    )

cdef __SetSpec get_reflection__Set__i32():
    return __SetSpec._fbthrift_create(
        value=int,
        kind=__NumberType.I32,
     )

cdef __MapSpec get_reflection__Map__i32_i32():
    return __MapSpec._fbthrift_create(
        key=int,
        key_kind=__NumberType.I32,
        value=int,
        value_kind=__NumberType.I32,
    )

cdef __ListSpec get_reflection__List__i64():
    return __ListSpec._fbthrift_create(
        value=int,
        kind=__NumberType.I64,
    )

