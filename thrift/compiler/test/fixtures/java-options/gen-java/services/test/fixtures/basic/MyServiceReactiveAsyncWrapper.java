/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import java.util.*;

public class MyServiceReactiveAsyncWrapper 
  implements MyService.Async {
  private MyService.Reactive _delegate;

  public MyServiceReactiveAsyncWrapper(MyService.Reactive _delegate) {
    
    this._delegate = _delegate;
  }

  public MyServiceReactiveAsyncWrapper(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(new MyServiceReactiveClient(_protocolId, _rpcClient, _headers, _persistentHeaders));
  }

  @java.lang.Override
  public void close() {
    _delegate.dispose();
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Void> ping() {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.ping());
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Void> ping(
    com.facebook.thrift.client.RpcOptions rpcOptions) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.ping( rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<com.facebook.thrift.client.ResponseWrapper<Void>> pingWrapper(
    com.facebook.thrift.client.RpcOptions rpcOptions) {
    return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.pingWrapper( rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<String> getRandomData() {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.getRandomData());
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<String> getRandomData(
    com.facebook.thrift.client.RpcOptions rpcOptions) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.getRandomData( rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<com.facebook.thrift.client.ResponseWrapper<String>> getRandomDataWrapper(
    com.facebook.thrift.client.RpcOptions rpcOptions) {
    return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.getRandomDataWrapper( rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Void> sink(final long sink) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.sink(sink));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Void> sink(
    final long sink,
    com.facebook.thrift.client.RpcOptions rpcOptions) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.sink(sink, rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<com.facebook.thrift.client.ResponseWrapper<Void>> sinkWrapper(
    final long sink,
    com.facebook.thrift.client.RpcOptions rpcOptions) {
    return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.sinkWrapper(sink, rpcOptions));
  }

}
