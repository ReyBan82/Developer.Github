/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic_swift_bean;

import java.util.*;

public class LegacyServiceReactiveBlockingWrapper 
  implements LegacyService {
  private final LegacyService.Reactive _delegate;

  public LegacyServiceReactiveBlockingWrapper(LegacyService.Reactive _delegate) {
    
    this._delegate = _delegate;
  }

  public LegacyServiceReactiveBlockingWrapper(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(new LegacyServiceReactiveClient(_protocolId, _rpcClient, _headers, _persistentHeaders));
  }

  @java.lang.Override
  public void close() {
    _delegate.dispose();
  }

  @java.lang.Override
  public Map<String, List<Integer>> getPoints( final Set<String> key, final long legacyStuff) throws org.apache.thrift.TException {
      return getPointsWrapper(key, legacyStuff, com.facebook.thrift.client.RpcOptions.EMPTY).getData();
  }

  @java.lang.Override
  public Map<String, List<Integer>> getPoints(
        final Set<String> key,
        final long legacyStuff,
        com.facebook.thrift.client.RpcOptions rpcOptions) throws org.apache.thrift.TException {
      return getPointsWrapper(key,legacyStuff,rpcOptions).getData();
  }

  @java.lang.Override
  public com.facebook.thrift.client.ResponseWrapper<Map<String, List<Integer>>> getPointsWrapper(
    final Set<String> key,
    final long legacyStuff,
    com.facebook.thrift.client.RpcOptions rpcOptions) throws org.apache.thrift.TException {
      try {
        return _delegate.getPointsWrapper(key, legacyStuff, rpcOptions).block();
      } catch (Throwable t) {
        throw com.facebook.thrift.util.ExceptionUtil.wrap(t);
      }
  }

}
