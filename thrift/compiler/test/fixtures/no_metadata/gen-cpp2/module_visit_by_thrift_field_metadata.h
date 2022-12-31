/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/no_metadata/src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include <thrift/lib/cpp2/visitation/visit_by_thrift_field_metadata.h>
#include "thrift/compiler/test/fixtures/no_metadata/gen-cpp2/module_metadata.h"

namespace apache {
namespace thrift {
namespace detail {

template <>
struct VisitByFieldId<::cpp2::MyStruct> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).MyIntField_ref());
    case 2:
      return f(1, static_cast<T&&>(t).MyStringField_ref());
    case 3:
      return f(2, static_cast<T&&>(t).MyDataField_ref());
    case 4:
      return f(3, static_cast<T&&>(t).myEnum_ref());
    default:
      throwInvalidThriftId(fieldId, "::cpp2::MyStruct");
    }
  }
};

template <>
struct VisitByFieldId<::cpp2::MyDataItem> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    default:
      throwInvalidThriftId(fieldId, "::cpp2::MyDataItem");
    }
  }
};

template <>
struct VisitByFieldId<::cpp2::MyUnion> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).myEnum_ref());
    case 2:
      return f(1, static_cast<T&&>(t).myStruct_ref());
    case 3:
      return f(2, static_cast<T&&>(t).myDataItem_ref());
    default:
      throwInvalidThriftId(fieldId, "::cpp2::MyUnion");
    }
  }
};
} // namespace detail
} // namespace thrift
} // namespace apache
