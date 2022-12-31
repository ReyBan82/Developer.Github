/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/encode/src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include "thrift/compiler/test/fixtures/encode/gen-cpp2/module_metadata.h"
#include <thrift/lib/cpp2/visitation/for_each.h>

namespace apache {
namespace thrift {
namespace detail {

template <>
struct ForEachField<::facebook::thrift::test::Foo> {
  template <typename F, typename... T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, FOLLY_MAYBE_UNUSED T&&... t) const {
    f(0, static_cast<T&&>(t).field_ref()...);
  }
};

template <>
struct ForEachField<::facebook::thrift::test::Bar> {
  template <typename F, typename... T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, FOLLY_MAYBE_UNUSED T&&... t) const {
    f(0, static_cast<T&&>(t).list_field_ref()...);
  }
};

template <>
struct ForEachField<::facebook::thrift::test::OpEncodeStruct> {
  template <typename F, typename... T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, FOLLY_MAYBE_UNUSED T&&... t) const {
    f(0, static_cast<T&&>(t).int_field_ref()...);
    f(1, static_cast<T&&>(t).enum_field_ref()...);
    f(2, static_cast<T&&>(t).foo_field_ref()...);
    f(3, static_cast<T&&>(t).adapted_field_ref()...);
    f(4, static_cast<T&&>(t).list_field_ref()...);
    f(5, static_cast<T&&>(t).list_shared_ptr_field_ref()...);
    f(6, static_cast<T&&>(t).list_cpp_type_field_ref()...);
    f(7, static_cast<T&&>(t).set_field_ref()...);
    f(8, static_cast<T&&>(t).map_field_ref()...);
    f(9, static_cast<T&&>(t).nested_field_ref()...);
    f(10, static_cast<T&&>(t).bar_field_ref()...);
    f(11, static_cast<T&&>(t).adapted_list_field_ref()...);
  }
};
} // namespace detail
} // namespace thrift
} // namespace apache
