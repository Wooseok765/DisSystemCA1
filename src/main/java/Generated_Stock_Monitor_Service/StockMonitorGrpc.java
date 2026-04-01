package Generated_Stock_Monitor_Service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: StockMonitor.proto")
public final class StockMonitorGrpc {

  private StockMonitorGrpc() {}

  public static final String SERVICE_NAME = "service2.StockMonitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Generated_Stock_Monitor_Service.Empty,
      Generated_Stock_Monitor_Service.ItemStatus> getExpiryDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExpiryDate",
      requestType = Generated_Stock_Monitor_Service.Empty.class,
      responseType = Generated_Stock_Monitor_Service.ItemStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<Generated_Stock_Monitor_Service.Empty,
      Generated_Stock_Monitor_Service.ItemStatus> getExpiryDateMethod() {
    io.grpc.MethodDescriptor<Generated_Stock_Monitor_Service.Empty, Generated_Stock_Monitor_Service.ItemStatus> getExpiryDateMethod;
    if ((getExpiryDateMethod = StockMonitorGrpc.getExpiryDateMethod) == null) {
      synchronized (StockMonitorGrpc.class) {
        if ((getExpiryDateMethod = StockMonitorGrpc.getExpiryDateMethod) == null) {
          StockMonitorGrpc.getExpiryDateMethod = getExpiryDateMethod = 
              io.grpc.MethodDescriptor.<Generated_Stock_Monitor_Service.Empty, Generated_Stock_Monitor_Service.ItemStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.StockMonitor", "ExpiryDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Monitor_Service.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Monitor_Service.ItemStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new StockMonitorMethodDescriptorSupplier("ExpiryDate"))
                  .build();
          }
        }
     }
     return getExpiryDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Generated_Stock_Monitor_Service.SoldItem,
      Generated_Stock_Monitor_Service.ItemStatus> getAutoStockCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AutoStockCheck",
      requestType = Generated_Stock_Monitor_Service.SoldItem.class,
      responseType = Generated_Stock_Monitor_Service.ItemStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Generated_Stock_Monitor_Service.SoldItem,
      Generated_Stock_Monitor_Service.ItemStatus> getAutoStockCheckMethod() {
    io.grpc.MethodDescriptor<Generated_Stock_Monitor_Service.SoldItem, Generated_Stock_Monitor_Service.ItemStatus> getAutoStockCheckMethod;
    if ((getAutoStockCheckMethod = StockMonitorGrpc.getAutoStockCheckMethod) == null) {
      synchronized (StockMonitorGrpc.class) {
        if ((getAutoStockCheckMethod = StockMonitorGrpc.getAutoStockCheckMethod) == null) {
          StockMonitorGrpc.getAutoStockCheckMethod = getAutoStockCheckMethod = 
              io.grpc.MethodDescriptor.<Generated_Stock_Monitor_Service.SoldItem, Generated_Stock_Monitor_Service.ItemStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.StockMonitor", "AutoStockCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Monitor_Service.SoldItem.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Monitor_Service.ItemStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new StockMonitorMethodDescriptorSupplier("AutoStockCheck"))
                  .build();
          }
        }
     }
     return getAutoStockCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockMonitorStub newStub(io.grpc.Channel channel) {
    return new StockMonitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockMonitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StockMonitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockMonitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StockMonitorFutureStub(channel);
  }

  /**
   */
  public static abstract class StockMonitorImplBase implements io.grpc.BindableService {

    /**
     */
    public void expiryDate(Generated_Stock_Monitor_Service.Empty request,
        io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.ItemStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getExpiryDateMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.SoldItem> autoStockCheck(
        io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.ItemStatus> responseObserver) {
      return asyncUnimplementedStreamingCall(getAutoStockCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExpiryDateMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                Generated_Stock_Monitor_Service.Empty,
                Generated_Stock_Monitor_Service.ItemStatus>(
                  this, METHODID_EXPIRY_DATE)))
          .addMethod(
            getAutoStockCheckMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                Generated_Stock_Monitor_Service.SoldItem,
                Generated_Stock_Monitor_Service.ItemStatus>(
                  this, METHODID_AUTO_STOCK_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class StockMonitorStub extends io.grpc.stub.AbstractStub<StockMonitorStub> {
    private StockMonitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockMonitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockMonitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockMonitorStub(channel, callOptions);
    }

    /**
     */
    public void expiryDate(Generated_Stock_Monitor_Service.Empty request,
        io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.ItemStatus> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getExpiryDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.SoldItem> autoStockCheck(
        io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.ItemStatus> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAutoStockCheckMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StockMonitorBlockingStub extends io.grpc.stub.AbstractStub<StockMonitorBlockingStub> {
    private StockMonitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockMonitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockMonitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockMonitorBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<Generated_Stock_Monitor_Service.ItemStatus> expiryDate(
        Generated_Stock_Monitor_Service.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getExpiryDateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StockMonitorFutureStub extends io.grpc.stub.AbstractStub<StockMonitorFutureStub> {
    private StockMonitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockMonitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockMonitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockMonitorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_EXPIRY_DATE = 0;
  private static final int METHODID_AUTO_STOCK_CHECK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StockMonitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StockMonitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXPIRY_DATE:
          serviceImpl.expiryDate((Generated_Stock_Monitor_Service.Empty) request,
              (io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.ItemStatus>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUTO_STOCK_CHECK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.autoStockCheck(
              (io.grpc.stub.StreamObserver<Generated_Stock_Monitor_Service.ItemStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StockMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockMonitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Generated_Stock_Monitor_Service.CA1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockMonitor");
    }
  }

  private static final class StockMonitorFileDescriptorSupplier
      extends StockMonitorBaseDescriptorSupplier {
    StockMonitorFileDescriptorSupplier() {}
  }

  private static final class StockMonitorMethodDescriptorSupplier
      extends StockMonitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockMonitorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StockMonitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockMonitorFileDescriptorSupplier())
              .addMethod(getExpiryDateMethod())
              .addMethod(getAutoStockCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
