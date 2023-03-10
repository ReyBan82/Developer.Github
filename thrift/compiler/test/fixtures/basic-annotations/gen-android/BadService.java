/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class BadService {

  public interface Iface {

    public Integer bar() throws TException;

  }

  public interface AsyncIface {

    public void bar(AsyncMethodCallback resultHandler) throws TException;

  }

  public static class Client extends EventHandlerBase implements Iface, TClientIf {
    public Client(TProtocol prot)
    {
      this(prot, prot);
    }

    public Client(TProtocol iprot, TProtocol oprot)
    {
      iprot_ = iprot;
      oprot_ = oprot;
    }

    protected TProtocol iprot_;
    protected TProtocol oprot_;

    protected int seqid_;

    @Override
    public TProtocol getInputProtocol()
    {
      return this.iprot_;
    }

    @Override
    public TProtocol getOutputProtocol()
    {
      return this.oprot_;
    }

    public Integer bar() throws TException
    {
      ContextStack ctx = getContextStack("BadService.bar", null);
      this.setContextStack(ctx);
      send_bar();
      return recv_bar();
    }

    public void send_bar() throws TException
    {
      ContextStack ctx = this.getContextStack();
      super.preWrite(ctx, "BadService.bar", null);
      oprot_.writeMessageBegin(new TMessage("bar", TMessageType.CALL, seqid_));
      bar_args args = new bar_args();
      args.write(oprot_);
      oprot_.writeMessageEnd();
      oprot_.getTransport().flush();
      super.postWrite(ctx, "BadService.bar", args);
      return;
    }

    public Integer recv_bar() throws TException
    {
      ContextStack ctx = super.getContextStack();
      long bytes;
      TMessageType mtype;
      super.preRead(ctx, "BadService.bar");
      TMessage msg = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        TApplicationException x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      bar_result result = bar_result.deserialize(iprot_);
      iprot_.readMessageEnd();
      super.postRead(ctx, "BadService.bar", result);

      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT, "bar failed: unknown result");
    }

  }
  public static class AsyncClient extends TAsyncClient implements AsyncIface {
    public static class Factory implements TAsyncClientFactory<AsyncClient> {
      private TAsyncClientManager clientManager;
      private TProtocolFactory protocolFactory;
      public Factory(TAsyncClientManager clientManager, TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(TProtocolFactory protocolFactory, TAsyncClientManager clientManager, TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void bar(AsyncMethodCallback resultHandler68) throws TException {
      checkReady();
      bar_call method_call = new bar_call(resultHandler68, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class bar_call extends TAsyncMethodCall {
      public bar_call(AsyncMethodCallback resultHandler69, TAsyncClient client65, TProtocolFactory protocolFactory66, TNonblockingTransport transport67) throws TException {
        super(client65, protocolFactory66, transport67, resultHandler69, false);
      }

      public void write_args(TProtocol prot) throws TException {
        prot.writeMessageBegin(new TMessage("bar", TMessageType.CALL, 0));
        bar_args args = new bar_args();
        args.write(prot);
        prot.writeMessageEnd();
      }

      public Integer getResult() throws TException {
        if (getState() != State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        TMemoryInputTransport memoryTransport = new TMemoryInputTransport(getFrameBuffer().array());
        TProtocol prot = super.client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_bar();
      }
    }

  }

  public static class Processor implements TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(Iface iface)
    {
      iface_ = iface;
      event_handler_ = new TProcessorEventHandler(); // Empty handler
      processMap_.put("bar", new bar());
    }

    protected static interface ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot, TConnectionContext server_ctx) throws TException;
    }

    public void setEventHandler(TProcessorEventHandler handler) {
      this.event_handler_ = handler;
    }

    private Iface iface_;
    protected TProcessorEventHandler event_handler_;
    protected final HashMap<String,ProcessFunction> processMap_ = new HashMap<String,ProcessFunction>();

    public boolean process(TProtocol iprot, TProtocol oprot, TConnectionContext server_ctx) throws TException
    {
      TMessage msg = iprot.readMessageBegin();
      ProcessFunction fn = processMap_.get(msg.name);
      if (fn == null) {
        TProtocolUtil.skip(iprot, TType.STRUCT);
        iprot.readMessageEnd();
        TApplicationException x = new TApplicationException(TApplicationException.UNKNOWN_METHOD, "Invalid method name: '"+msg.name+"'");
        oprot.writeMessageBegin(new TMessage(msg.name, TMessageType.EXCEPTION, msg.seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return true;
      }
      fn.process(msg.seqid, iprot, oprot, server_ctx);
      return true;
    }

    private class bar implements ProcessFunction {
      public void process(int seqid, TProtocol iprot, TProtocol oprot, TConnectionContext server_ctx) throws TException
      {
        Object handler_ctx = event_handler_.getContext("BadService.bar", server_ctx);
        bar_args args = new bar_args();
        event_handler_.preRead(handler_ctx, "BadService.bar");
        args.read(iprot);
        iprot.readMessageEnd();
        event_handler_.postRead(handler_ctx, "BadService.bar", args);
        bar_result result = new bar_result();
        result.success = iface_.bar();
        event_handler_.preWrite(handler_ctx, "BadService.bar", result);
        oprot.writeMessageBegin(new TMessage("bar", TMessageType.REPLY, seqid));
        result.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        event_handler_.postWrite(handler_ctx, "BadService.bar", result);
      }

    }

  }

  public static class bar_args implements TBase, java.io.Serializable, Cloneable   {
    private static final TStruct STRUCT_DESC = new TStruct("bar_args");


    public bar_args() {
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public bar_args(bar_args other) {
    }

    public bar_args deepCopy() {
      return new bar_args(this);
    }

    @Override
    public boolean equals(Object _that) {
      if (_that == null)
        return false;
      if (this == _that)
        return true;
      if (!(_that instanceof bar_args))
        return false;
      bar_args that = (bar_args)_that;

      return true;
    }

    @Override
    public int hashCode() {
      return Arrays.deepHashCode(new Object[] {});
    }

    // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
    public void read(TProtocol iprot) throws TException {
      throw new TException("unimplemented in android immutable structure");
    }

    public static bar_args deserialize(TProtocol iprot) throws TException {
      TField __field;
      iprot.readStructBegin();
      while (true)
      {
        __field = iprot.readFieldBegin();
        if (__field.type == TType.STOP) {
          break;
        }
        switch (__field.id)
        {
          default:
            TProtocolUtil.skip(iprot, __field.type);
            break;
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      bar_args _that;
      _that = new bar_args(
      );
      _that.validate();
      return _that;
    }

    public void write(TProtocol oprot) throws TException {
      validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

    @Override
    public String toString() {
      return toString(1, true);
    }

    @Override
    public String toString(int indent, boolean prettyPrint) {
      return TBaseHelper.toStringHelper(this, indent, prettyPrint);
    }

    public void validate() throws TException {
      // check for required fields
    }

  }

  public static class bar_result implements TBase, java.io.Serializable, Cloneable   {
    private static final TStruct STRUCT_DESC = new TStruct("bar_result");
    private static final TField SUCCESS_FIELD_DESC = new TField("success", TType.I32, (short)0);

    public Integer success;
    public static final int SUCCESS = 0;

    // isset id assignments


    public bar_result() {
    }

    public bar_result(
        Integer success) {
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public bar_result(bar_result other) {
      if (other.isSetSuccess()) {
        this.success = TBaseHelper.deepCopy(other.success);
      }
    }

    public bar_result deepCopy() {
      return new bar_result(this);
    }

    public Integer getSuccess() {
      return this.success;
    }

    public bar_result setSuccess(Integer success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    // Returns true if field success is set (has been assigned a value) and false otherwise
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean __value) {
      if (!__value) {
        this.success = null;
      }
    }

    @Override
    public boolean equals(Object _that) {
      if (_that == null)
        return false;
      if (this == _that)
        return true;
      if (!(_that instanceof bar_result))
        return false;
      bar_result that = (bar_result)_that;

      if (!TBaseHelper.equalsNobinary(this.isSetSuccess(), that.isSetSuccess(), this.success, that.success)) { return false; }

      return true;
    }

    @Override
    public int hashCode() {
      return Arrays.deepHashCode(new Object[] {success});
    }

    // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
    public void read(TProtocol iprot) throws TException {
      throw new TException("unimplemented in android immutable structure");
    }

    public static bar_result deserialize(TProtocol iprot) throws TException {
      Integer tmp_success = null;
      TField __field;
      iprot.readStructBegin();
      while (true)
      {
        __field = iprot.readFieldBegin();
        if (__field.type == TType.STOP) {
          break;
        }
        switch (__field.id)
        {
          case SUCCESS:
            if (__field.type == TType.I32) {
              tmp_success = iprot.readI32();
            } else {
              TProtocolUtil.skip(iprot, __field.type);
            }
            break;
          default:
            TProtocolUtil.skip(iprot, __field.type);
            break;
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      bar_result _that;
      _that = new bar_result(
        tmp_success
      );
      _that.validate();
      return _that;
    }

    public void write(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);

      if (this.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        oprot.writeI32(this.success);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

    @Override
    public String toString() {
      return toString(1, true);
    }

    @Override
    public String toString(int indent, boolean prettyPrint) {
      return TBaseHelper.toStringHelper(this, indent, prettyPrint);
    }

    public void validate() throws TException {
      // check for required fields
    }

  }

}
