/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/lazy_deserialization/src/simple.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include <thrift/lib/cpp2/visitation/visit_by_thrift_field_metadata.h>
#include "thrift/compiler/test/fixtures/lazy_deserialization/gen-cpp2/simple_metadata.h"

namespace apache {
namespace thrift {
namespace detail {

template <>
struct VisitByFieldId<::apache::thrift::test::Foo> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(1, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(2, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(3, static_cast<T&&>(t).field4_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::Foo");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::LazyFoo> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(1, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(2, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(3, static_cast<T&&>(t).field4_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::LazyFoo");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::OptionalFoo> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(1, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(2, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(3, static_cast<T&&>(t).field4_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::OptionalFoo");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::OptionalLazyFoo> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(1, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(2, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(3, static_cast<T&&>(t).field4_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::OptionalLazyFoo");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::LazyCppRef> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 1:
      return f(0, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(1, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(2, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(3, static_cast<T&&>(t).field4_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::LazyCppRef");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::IndexedFoo> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 100:
      return f(0, static_cast<T&&>(t).serialized_data_size_ref());
    case 1:
      return f(1, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(2, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(3, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(4, static_cast<T&&>(t).field4_ref());
    case 101:
      return f(5, static_cast<T&&>(t).field_id_to_size_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::IndexedFoo");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::OptionalIndexedFoo> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    case 100:
      return f(0, static_cast<T&&>(t).serialized_data_size_ref());
    case 1:
      return f(1, static_cast<T&&>(t).field1_ref());
    case 2:
      return f(2, static_cast<T&&>(t).field2_ref());
    case 3:
      return f(3, static_cast<T&&>(t).field3_ref());
    case 4:
      return f(4, static_cast<T&&>(t).field4_ref());
    case 101:
      return f(5, static_cast<T&&>(t).field_id_to_size_ref());
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::OptionalIndexedFoo");
    }
  }
};

template <>
struct VisitByFieldId<::apache::thrift::test::Empty> {
  template <typename F, typename T>
  void operator()(FOLLY_MAYBE_UNUSED F&& f, int32_t fieldId, FOLLY_MAYBE_UNUSED T&& t) const {
    switch (fieldId) {
    default:
      throwInvalidThriftId(fieldId, "::apache::thrift::test::Empty");
    }
  }
};
} // namespace detail
} // namespace thrift
} // namespace apache
