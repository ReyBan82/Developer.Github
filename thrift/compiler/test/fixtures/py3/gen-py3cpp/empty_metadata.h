/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/py3/src/empty.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#pragma once

#include <vector>

#include <thrift/lib/cpp2/gen/module_metadata_h.h>
#include "thrift/compiler/test/fixtures/py3/gen-py3cpp/empty_types.h"

namespace cpp2 {
class NullService;
} // namespace cpp2

namespace apache {
namespace thrift {
namespace detail {
namespace md {

template <>
class ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NullService>> {
 public:
  static void gen(ThriftServiceMetadataResponse& response);
 private:
  static const ThriftServiceContextRef* genRecurse(ThriftMetadata& metadata, std::vector<ThriftServiceContextRef>& services);

  template <typename T>
  friend class ServiceMetadata;

};
} // namespace md
} // namespace detail
} // namespace thrift
} // namespace apache
