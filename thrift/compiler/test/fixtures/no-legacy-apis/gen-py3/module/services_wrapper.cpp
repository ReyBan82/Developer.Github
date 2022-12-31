/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include <thrift/compiler/test/fixtures/no-legacy-apis/src/gen-py3/module/services_wrapper.h>
#include <thrift/compiler/test/fixtures/no-legacy-apis/src/gen-py3/module/services_api.h>
#include <thrift/lib/cpp2/async/AsyncProcessor.h>

namespace test {
namespace fixtures {
namespace basic {

MyServiceWrapper::MyServiceWrapper(PyObject *obj, folly::Executor* exc)
  : if_object(obj), executor(exc)
  {
    import_test__fixtures__basic__module__services();
  }


void MyServiceWrapper::async_tm_query(
  std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<::test::fixtures::basic::MyStruct>>> callback
    , std::unique_ptr<::test::fixtures::basic::MyUnion> u
) {
  auto ctx = callback->getRequestContext();
  folly::via(
    this->executor,
    [this, ctx,
     callback = std::move(callback),
u = std::move(u)    ]() mutable {
        auto [promise, future] = folly::makePromiseContract<std::unique_ptr<::test::fixtures::basic::MyStruct>>();
        call_cy_MyService_query(
            this->if_object,
            ctx,
            std::move(promise),
            std::move(u)        );
        std::move(future).via(this->executor).thenTry([callback = std::move(callback)](folly::Try<std::unique_ptr<::test::fixtures::basic::MyStruct>>&& t) {
          (void)t;
          callback->complete(std::move(t));
        });
    });
}
std::shared_ptr<apache::thrift::ServerInterface> MyServiceInterface(PyObject *if_object, folly::Executor *exc) {
  return std::make_shared<MyServiceWrapper>(if_object, exc);
}
folly::SemiFuture<folly::Unit> MyServiceWrapper::semifuture_onStartServing() {
  auto [promise, future] = folly::makePromiseContract<folly::Unit>();
  call_cy_MyService_onStartServing(
      this->if_object,
      std::move(promise)
  );
  return std::move(future);
}
folly::SemiFuture<folly::Unit> MyServiceWrapper::semifuture_onStopRequested() {
  auto [promise, future] = folly::makePromiseContract<folly::Unit>();
  call_cy_MyService_onStopRequested(
      this->if_object,
      std::move(promise)
  );
  return std::move(future);
}
} // namespace test
} // namespace fixtures
} // namespace basic
