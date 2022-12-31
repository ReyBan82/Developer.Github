/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include <thrift/compiler/test/fixtures/namespace/src/gen-py3/extend/clients_wrapper.h>

namespace cpp2 {


folly::Future<bool>
ExtendTestServiceClientWrapper::check(
    apache::thrift::RpcOptions& rpcOptions,
    ::cpp2::HsFoo arg_struct1) {
  auto* client = static_cast<::cpp2::ExtendTestServiceAsyncClient*>(async_client_.get());
  folly::Promise<bool> _promise;
  auto _future = _promise.getFuture();
  auto callback = std::make_unique<::thrift::py3::FutureCallback<bool>>(
    std::move(_promise), rpcOptions, client->recv_wrapped_check, channel_);
  try {
    client->check(
      rpcOptions,
      std::move(callback),
      arg_struct1
    );
  } catch (...) {
    return folly::makeFuture<bool>(folly::exception_wrapper(
      std::current_exception()
    ));
  }
  return _future;
}

} // namespace cpp2
