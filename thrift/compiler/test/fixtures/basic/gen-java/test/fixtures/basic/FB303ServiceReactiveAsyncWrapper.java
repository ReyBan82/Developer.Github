/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import java.util.*;

public class FB303ServiceReactiveAsyncWrapper 
  implements FB303Service.Async {
  private FB303Service.Reactive _delegate;

  public FB303ServiceReactiveAsyncWrapper(FB303Service.Reactive _delegate) {
    
    this._delegate = _delegate;
  }

  public FB303ServiceReactiveAsyncWrapper(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(new FB303ServiceReactiveClient(_protocolId, _rpcClient, _headers, _persistentHeaders));
  }

  @java.lang.Override
  public void close() {
    _delegate.dispose();
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<test.fixtures.basic.ReservedKeyword> simpleRpc(final int intParameter) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.simpleRpc(intParameter));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<test.fixtures.basic.ReservedKeyword> simpleRpc(
    final int intParameter,
    com.facebook.thrift.client.RpcOptions rpcOptions) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.simpleRpc(intParameter, rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<com.facebook.thrift.client.ResponseWrapper<test.fixtures.basic.ReservedKeyword>> simpleRpcWrapper(
    final int intParameter,
    com.facebook.thrift.client.RpcOptions rpcOptions) {
    return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.simpleRpcWrapper(intParameter, rpcOptions));
  }

}
