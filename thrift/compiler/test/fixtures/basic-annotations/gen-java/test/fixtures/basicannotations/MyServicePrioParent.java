/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basicannotations;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.service.*;
import com.facebook.thrift.client.*;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.*;
import java.util.*;
import reactor.core.publisher.Mono;

@SwiftGenerated
@com.facebook.swift.service.ThriftService("MyServicePrioParent")
public interface MyServicePrioParent extends java.io.Closeable, com.facebook.thrift.util.BlockingService {
    static com.facebook.thrift.server.RpcServerHandlerBuilder<MyServicePrioParent> serverHandlerBuilder(MyServicePrioParent _serverImpl) {
        return new com.facebook.thrift.server.RpcServerHandlerBuilder<MyServicePrioParent>(_serverImpl) {
                @java.lang.Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                return new MyServicePrioParentRpcServerHandler(impl, eventHandlers);
            }
        };
    }

    static com.facebook.thrift.client.ClientBuilder<MyServicePrioParent> clientBuilder() {
        return new ClientBuilder<MyServicePrioParent>() {
            @java.lang.Override
            public MyServicePrioParent build(Mono<RpcClient> rpcClientMono) {
                MyServicePrioParent.Reactive _delegate =
                    new MyServicePrioParentReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                return new MyServicePrioParentReactiveBlockingWrapper(_delegate);
            }
        };
    }

    @com.facebook.swift.service.ThriftService("MyServicePrioParent")
    public interface Async extends java.io.Closeable, com.facebook.thrift.util.AsyncService {
        static com.facebook.thrift.server.RpcServerHandlerBuilder<MyServicePrioParent.Async> serverHandlerBuilder(MyServicePrioParent.Async _serverImpl) {
            return new com.facebook.thrift.server.RpcServerHandlerBuilder<MyServicePrioParent.Async>(_serverImpl) {
                @java.lang.Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                    return new MyServicePrioParentRpcServerHandler(impl, eventHandlers);
                }
            };
        }

        static com.facebook.thrift.client.ClientBuilder<MyServicePrioParent.Async> clientBuilder() {
            return new ClientBuilder<MyServicePrioParent.Async>() {
                @java.lang.Override
                public MyServicePrioParent.Async build(Mono<RpcClient> rpcClientMono) {
                    MyServicePrioParent.Reactive _delegate =
                        new MyServicePrioParentReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                    return new MyServicePrioParentReactiveAsyncWrapper(_delegate);
                }
            };
        }

        @java.lang.Override void close();

        @ThriftMethod(value = "ping")
        ListenableFuture<Void> ping();

        default ListenableFuture<Void> ping(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> pingWrapper(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "pong")
        ListenableFuture<Void> pong();

        default ListenableFuture<Void> pong(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default ListenableFuture<ResponseWrapper<Void>> pongWrapper(
            RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }
    }
    @java.lang.Override void close();

    @ThriftMethod(value = "ping")
    void ping() throws org.apache.thrift.TException;

    default void ping(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> pingWrapper(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @ThriftMethod(value = "pong")
    void pong() throws org.apache.thrift.TException;

    default void pong(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    default ResponseWrapper<Void> pongWrapper(
        RpcOptions rpcOptions) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @com.facebook.swift.service.ThriftService("MyServicePrioParent")
    interface Reactive extends reactor.core.Disposable, com.facebook.thrift.util.ReactiveService {
        static com.facebook.thrift.server.RpcServerHandlerBuilder<MyServicePrioParent.Reactive> serverHandlerBuilder(MyServicePrioParent.Reactive _serverImpl) {
            return new com.facebook.thrift.server.RpcServerHandlerBuilder<MyServicePrioParent.Reactive>(_serverImpl) {
                @java.lang.Override
                public com.facebook.thrift.server.RpcServerHandler build() {
                    return new MyServicePrioParentRpcServerHandler(impl, eventHandlers);
                }
            };
        }

        static com.facebook.thrift.client.ClientBuilder<MyServicePrioParent.Reactive> clientBuilder() {
            return new ClientBuilder<MyServicePrioParent.Reactive>() {
                @java.lang.Override
                public MyServicePrioParent.Reactive build(Mono<RpcClient> rpcClientMono) {
                    return new MyServicePrioParentReactiveClient(protocolId, rpcClientMono, headers, persistentHeaders);
                }
            };
        }

        @ThriftMethod(value = "ping")
        reactor.core.publisher.Mono<Void> ping();

        default reactor.core.publisher.Mono<Void> ping(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> pingWrapper(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        @ThriftMethod(value = "pong")
        reactor.core.publisher.Mono<Void> pong();

        default reactor.core.publisher.Mono<Void> pong(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

        default reactor.core.publisher.Mono<ResponseWrapper<Void>> pongWrapper(RpcOptions rpcOptions) {
            throw new UnsupportedOperationException();
        }

    }
}
