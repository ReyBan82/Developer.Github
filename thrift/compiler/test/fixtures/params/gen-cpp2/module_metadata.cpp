/**
 * Autogenerated by Thrift for thrift/compiler/test/fixtures/params/src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#include <thrift/lib/cpp2/gen/module_metadata_cpp.h>
#include "thrift/compiler/test/fixtures/params/gen-cpp2/module_metadata.h"

// some of these functions can be so large that the compiler gives up optimizing
// them - and issues a warning which may be treated as an error!
//
// these functions are so rarely called that it is probably okay for them not to
// be optimized in practice
FOLLY_CLANG_DISABLE_WARNING("-Wignored-optimization-argument")

namespace apache {
namespace thrift {
namespace detail {
namespace md {
using ThriftMetadata = ::apache::thrift::metadata::ThriftMetadata;
using ThriftPrimitiveType = ::apache::thrift::metadata::ThriftPrimitiveType;
using ThriftType = ::apache::thrift::metadata::ThriftType;
using ThriftService = ::apache::thrift::metadata::ThriftService;
using ThriftServiceContext = ::apache::thrift::metadata::ThriftServiceContext;
using ThriftFunctionGenerator = void (*)(ThriftMetadata&, ThriftService&);



void ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_mapList(FOLLY_MAYBE_UNUSED ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  func.name() = "mapList";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type(), metadata);
  ::apache::thrift::metadata::ThriftField module_NestedContainers_mapList_foo_1;
  module_NestedContainers_mapList_foo_1.id() = 1;
  module_NestedContainers_mapList_foo_1.name() = "foo";
  module_NestedContainers_mapList_foo_1.is_optional() = false;
  auto module_NestedContainers_mapList_foo_1_type = std::make_unique<Map>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::make_unique<List>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE)));
  module_NestedContainers_mapList_foo_1_type->writeAndGenType(*module_NestedContainers_mapList_foo_1.type(), metadata);
  func.arguments()->push_back(std::move(module_NestedContainers_mapList_foo_1));
  func.is_oneway() = false;
  service.functions()->push_back(std::move(func));
}
void ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_mapSet(FOLLY_MAYBE_UNUSED ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  func.name() = "mapSet";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type(), metadata);
  ::apache::thrift::metadata::ThriftField module_NestedContainers_mapSet_foo_1;
  module_NestedContainers_mapSet_foo_1.id() = 1;
  module_NestedContainers_mapSet_foo_1.name() = "foo";
  module_NestedContainers_mapSet_foo_1.is_optional() = false;
  auto module_NestedContainers_mapSet_foo_1_type = std::make_unique<Map>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::make_unique<Set>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE)));
  module_NestedContainers_mapSet_foo_1_type->writeAndGenType(*module_NestedContainers_mapSet_foo_1.type(), metadata);
  func.arguments()->push_back(std::move(module_NestedContainers_mapSet_foo_1));
  func.is_oneway() = false;
  service.functions()->push_back(std::move(func));
}
void ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_listMap(FOLLY_MAYBE_UNUSED ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  func.name() = "listMap";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type(), metadata);
  ::apache::thrift::metadata::ThriftField module_NestedContainers_listMap_foo_1;
  module_NestedContainers_listMap_foo_1.id() = 1;
  module_NestedContainers_listMap_foo_1.name() = "foo";
  module_NestedContainers_listMap_foo_1.is_optional() = false;
  auto module_NestedContainers_listMap_foo_1_type = std::make_unique<List>(std::make_unique<Map>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE)));
  module_NestedContainers_listMap_foo_1_type->writeAndGenType(*module_NestedContainers_listMap_foo_1.type(), metadata);
  func.arguments()->push_back(std::move(module_NestedContainers_listMap_foo_1));
  func.is_oneway() = false;
  service.functions()->push_back(std::move(func));
}
void ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_listSet(FOLLY_MAYBE_UNUSED ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  func.name() = "listSet";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type(), metadata);
  ::apache::thrift::metadata::ThriftField module_NestedContainers_listSet_foo_1;
  module_NestedContainers_listSet_foo_1.id() = 1;
  module_NestedContainers_listSet_foo_1.name() = "foo";
  module_NestedContainers_listSet_foo_1.is_optional() = false;
  auto module_NestedContainers_listSet_foo_1_type = std::make_unique<List>(std::make_unique<Set>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE)));
  module_NestedContainers_listSet_foo_1_type->writeAndGenType(*module_NestedContainers_listSet_foo_1.type(), metadata);
  func.arguments()->push_back(std::move(module_NestedContainers_listSet_foo_1));
  func.is_oneway() = false;
  service.functions()->push_back(std::move(func));
}
void ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_turtles(FOLLY_MAYBE_UNUSED ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  func.name() = "turtles";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type(), metadata);
  ::apache::thrift::metadata::ThriftField module_NestedContainers_turtles_foo_1;
  module_NestedContainers_turtles_foo_1.id() = 1;
  module_NestedContainers_turtles_foo_1.name() = "foo";
  module_NestedContainers_turtles_foo_1.is_optional() = false;
  auto module_NestedContainers_turtles_foo_1_type = std::make_unique<List>(std::make_unique<List>(std::make_unique<Map>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::make_unique<Map>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::make_unique<Set>(std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE))))));
  module_NestedContainers_turtles_foo_1_type->writeAndGenType(*module_NestedContainers_turtles_foo_1.type(), metadata);
  func.arguments()->push_back(std::move(module_NestedContainers_turtles_foo_1));
  func.is_oneway() = false;
  service.functions()->push_back(std::move(func));
}

void ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen(::apache::thrift::metadata::ThriftServiceMetadataResponse& response) {
  const ::apache::thrift::metadata::ThriftServiceContextRef* self = genRecurse(*response.metadata(), *response.services());
  DCHECK(self != nullptr);
  // TODO(praihan): Remove ThriftServiceContext from response. But in the meantime, we need to fill the field with the result of looking up in ThriftMetadata.
  ::apache::thrift::metadata::ThriftServiceContext context;
  context.module() = *self->module();
  context.service_info() = response.metadata()->services()->at(*self->service_name());
  response.context() = std::move(context);
}

const ThriftServiceContextRef* ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::genRecurse(FOLLY_MAYBE_UNUSED ThriftMetadata& metadata, std::vector<ThriftServiceContextRef>& services) {
  ::apache::thrift::metadata::ThriftService module_NestedContainers;
  module_NestedContainers.name() = "module.NestedContainers";
  static const ThriftFunctionGenerator functions[] = {
    ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_mapList,
    ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_mapSet,
    ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_listMap,
    ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_listSet,
    ServiceMetadata<::apache::thrift::ServiceHandler<::cpp2::NestedContainers>>::gen_turtles,
  };
  for (auto& function_gen : functions) {
    function_gen(metadata, module_NestedContainers);
  }
  // We need to keep the index around because a reference or iterator could be invalidated.
  auto selfIndex = services.size();
  services.emplace_back();
  ThriftServiceContextRef& context = services[selfIndex];
  metadata.services()->emplace("module.NestedContainers", std::move(module_NestedContainers));
  context.service_name() = "module.NestedContainers";
  ::apache::thrift::metadata::ThriftModuleContext module;
  module.name() = "module";
  context.module() = std::move(module);
  return &context;
}
} // namespace md
} // namespace detail
} // namespace thrift
} // namespace apache
