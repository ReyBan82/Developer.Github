/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic;

import java.util.*;

public class MyServiceReactiveBlockingWrapper 
  implements MyService {
  private final MyService.Reactive _delegate;

  public MyServiceReactiveBlockingWrapper(MyService.Reactive _delegate) {
    
    this._delegate = _delegate;
  }

  public MyServiceReactiveBlockingWrapper(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(new MyServiceReactiveClient(_protocolId, _rpcClient, _headers, _persistentHeaders));
  }

  @java.lang.Override
  public void close() {
    _delegate.dispose();
  }

  @java.lang.Override
  public test.fixtures.basic.MyStruct query( final test.fixtures.basic.MyUnion u) throws org.apache.thrift.TException {
      return queryWrapper(u, com.facebook.thrift.client.RpcOptions.EMPTY).getData();
  }

  @java.lang.Override
  public test.fixtures.basic.MyStruct query(
        final test.fixtures.basic.MyUnion u,
        com.facebook.thrift.client.RpcOptions rpcOptions) throws org.apache.thrift.TException {
      return queryWrapper(u,rpcOptions).getData();
  }

  @java.lang.Override
  public com.facebook.thrift.client.ResponseWrapper<test.fixtures.basic.MyStruct> queryWrapper(
    final test.fixtures.basic.MyUnion u,
    com.facebook.thrift.client.RpcOptions rpcOptions) throws org.apache.thrift.TException {
      try {
        return _delegate.queryWrapper(u, rpcOptions).block();
      } catch (Throwable t) {
        throw com.facebook.thrift.util.ExceptionUtil.wrap(t);
      }
  }

}
