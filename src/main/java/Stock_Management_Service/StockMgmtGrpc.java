package Stock_Management_Service;

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
    comments = "Source: StockMgmt.proto")
public final class StockMgmtGrpc {

  private StockMgmtGrpc() {}

  public static final String SERVICE_NAME = "service1.StockMgmt";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Stock_Management_Service.ItemName,
      Stock_Management_Service.ItemStatus> getStockCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StockCheck",
      requestType = Stock_Management_Service.ItemName.class,
      responseType = Stock_Management_Service.ItemStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stock_Management_Service.ItemName,
      Stock_Management_Service.ItemStatus> getStockCheckMethod() {
    io.grpc.MethodDescriptor<Stock_Management_Service.ItemName, Stock_Management_Service.ItemStatus> getStockCheckMethod;
    if ((getStockCheckMethod = StockMgmtGrpc.getStockCheckMethod) == null) {
      synchronized (StockMgmtGrpc.class) {
        if ((getStockCheckMethod = StockMgmtGrpc.getStockCheckMethod) == null) {
          StockMgmtGrpc.getStockCheckMethod = getStockCheckMethod = 
              io.grpc.MethodDescriptor.<Stock_Management_Service.ItemName, Stock_Management_Service.ItemStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.StockMgmt", "StockCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stock_Management_Service.ItemName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stock_Management_Service.ItemStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new StockMgmtMethodDescriptorSupplier("StockCheck"))
                  .build();
          }
        }
     }
     return getStockCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Stock_Management_Service.NewItemStatus,
      Stock_Management_Service.ItemStatus> getStockAdjustMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StockAdjust",
      requestType = Stock_Management_Service.NewItemStatus.class,
      responseType = Stock_Management_Service.ItemStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Stock_Management_Service.NewItemStatus,
      Stock_Management_Service.ItemStatus> getStockAdjustMethod() {
    io.grpc.MethodDescriptor<Stock_Management_Service.NewItemStatus, Stock_Management_Service.ItemStatus> getStockAdjustMethod;
    if ((getStockAdjustMethod = StockMgmtGrpc.getStockAdjustMethod) == null) {
      synchronized (StockMgmtGrpc.class) {
        if ((getStockAdjustMethod = StockMgmtGrpc.getStockAdjustMethod) == null) {
          StockMgmtGrpc.getStockAdjustMethod = getStockAdjustMethod = 
              io.grpc.MethodDescriptor.<Stock_Management_Service.NewItemStatus, Stock_Management_Service.ItemStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.StockMgmt", "StockAdjust"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stock_Management_Service.NewItemStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Stock_Management_Service.ItemStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new StockMgmtMethodDescriptorSupplier("StockAdjust"))
                  .build();
          }
        }
     }
     return getStockAdjustMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StockMgmtStub newStub(io.grpc.Channel channel) {
    return new StockMgmtStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StockMgmtBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StockMgmtBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StockMgmtFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StockMgmtFutureStub(channel);
  }

  /**
   */
  public static abstract class StockMgmtImplBase implements io.grpc.BindableService {

    /**
     */
    public void stockCheck(Stock_Management_Service.ItemName request,
        io.grpc.stub.StreamObserver<Stock_Management_Service.ItemStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getStockCheckMethod(), responseObserver);
    }

    /**
     */
    public void stockAdjust(Stock_Management_Service.NewItemStatus request,
        io.grpc.stub.StreamObserver<Stock_Management_Service.ItemStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getStockAdjustMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStockCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stock_Management_Service.ItemName,
                Stock_Management_Service.ItemStatus>(
                  this, METHODID_STOCK_CHECK)))
          .addMethod(
            getStockAdjustMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Stock_Management_Service.NewItemStatus,
                Stock_Management_Service.ItemStatus>(
                  this, METHODID_STOCK_ADJUST)))
          .build();
    }
  }

  /**
   */
  public static final class StockMgmtStub extends io.grpc.stub.AbstractStub<StockMgmtStub> {
    private StockMgmtStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockMgmtStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockMgmtStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockMgmtStub(channel, callOptions);
    }

    /**
     */
    public void stockCheck(Stock_Management_Service.ItemName request,
        io.grpc.stub.StreamObserver<Stock_Management_Service.ItemStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStockCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stockAdjust(Stock_Management_Service.NewItemStatus request,
        io.grpc.stub.StreamObserver<Stock_Management_Service.ItemStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStockAdjustMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StockMgmtBlockingStub extends io.grpc.stub.AbstractStub<StockMgmtBlockingStub> {
    private StockMgmtBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockMgmtBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockMgmtBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockMgmtBlockingStub(channel, callOptions);
    }

    /**
     */
    public Stock_Management_Service.ItemStatus stockCheck(Stock_Management_Service.ItemName request) {
      return blockingUnaryCall(
          getChannel(), getStockCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public Stock_Management_Service.ItemStatus stockAdjust(Stock_Management_Service.NewItemStatus request) {
      return blockingUnaryCall(
          getChannel(), getStockAdjustMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StockMgmtFutureStub extends io.grpc.stub.AbstractStub<StockMgmtFutureStub> {
    private StockMgmtFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StockMgmtFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StockMgmtFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StockMgmtFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stock_Management_Service.ItemStatus> stockCheck(
        Stock_Management_Service.ItemName request) {
      return futureUnaryCall(
          getChannel().newCall(getStockCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Stock_Management_Service.ItemStatus> stockAdjust(
        Stock_Management_Service.NewItemStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getStockAdjustMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STOCK_CHECK = 0;
  private static final int METHODID_STOCK_ADJUST = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StockMgmtImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StockMgmtImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STOCK_CHECK:
          serviceImpl.stockCheck((Stock_Management_Service.ItemName) request,
              (io.grpc.stub.StreamObserver<Stock_Management_Service.ItemStatus>) responseObserver);
          break;
        case METHODID_STOCK_ADJUST:
          serviceImpl.stockAdjust((Stock_Management_Service.NewItemStatus) request,
              (io.grpc.stub.StreamObserver<Stock_Management_Service.ItemStatus>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StockMgmtBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StockMgmtBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Stock_Management_Service.CA1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StockMgmt");
    }
  }

  private static final class StockMgmtFileDescriptorSupplier
      extends StockMgmtBaseDescriptorSupplier {
    StockMgmtFileDescriptorSupplier() {}
  }

  private static final class StockMgmtMethodDescriptorSupplier
      extends StockMgmtBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StockMgmtMethodDescriptorSupplier(String methodName) {
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
      synchronized (StockMgmtGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StockMgmtFileDescriptorSupplier())
              .addMethod(getStockCheckMethod())
              .addMethod(getStockAdjustMethod())
              .build();
        }
      }
    }
    return result;
  }
}
