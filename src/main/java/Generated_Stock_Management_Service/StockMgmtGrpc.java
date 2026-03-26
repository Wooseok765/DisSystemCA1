package Generated_Stock_Management_Service;

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
  private static volatile io.grpc.MethodDescriptor<Generated_Stock_Management_Service.ItemName,
      Generated_Stock_Management_Service.ItemStatus> getStockCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StockCheck",
      requestType = Generated_Stock_Management_Service.ItemName.class,
      responseType = Generated_Stock_Management_Service.ItemStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Generated_Stock_Management_Service.ItemName,
      Generated_Stock_Management_Service.ItemStatus> getStockCheckMethod() {
    io.grpc.MethodDescriptor<Generated_Stock_Management_Service.ItemName, Generated_Stock_Management_Service.ItemStatus> getStockCheckMethod;
    if ((getStockCheckMethod = StockMgmtGrpc.getStockCheckMethod) == null) {
      synchronized (StockMgmtGrpc.class) {
        if ((getStockCheckMethod = StockMgmtGrpc.getStockCheckMethod) == null) {
          StockMgmtGrpc.getStockCheckMethod = getStockCheckMethod = 
              io.grpc.MethodDescriptor.<Generated_Stock_Management_Service.ItemName, Generated_Stock_Management_Service.ItemStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service1.StockMgmt", "StockCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Management_Service.ItemName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Management_Service.ItemStatus.getDefaultInstance()))
                  .setSchemaDescriptor(new StockMgmtMethodDescriptorSupplier("StockCheck"))
                  .build();
          }
        }
     }
     return getStockCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Generated_Stock_Management_Service.ItemName,
      Generated_Stock_Management_Service.TotalPrice> getBasketPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BasketPrice",
      requestType = Generated_Stock_Management_Service.ItemName.class,
      responseType = Generated_Stock_Management_Service.TotalPrice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Generated_Stock_Management_Service.ItemName,
      Generated_Stock_Management_Service.TotalPrice> getBasketPriceMethod() {
    io.grpc.MethodDescriptor<Generated_Stock_Management_Service.ItemName, Generated_Stock_Management_Service.TotalPrice> getBasketPriceMethod;
    if ((getBasketPriceMethod = StockMgmtGrpc.getBasketPriceMethod) == null) {
      synchronized (StockMgmtGrpc.class) {
        if ((getBasketPriceMethod = StockMgmtGrpc.getBasketPriceMethod) == null) {
          StockMgmtGrpc.getBasketPriceMethod = getBasketPriceMethod = 
              io.grpc.MethodDescriptor.<Generated_Stock_Management_Service.ItemName, Generated_Stock_Management_Service.TotalPrice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service1.StockMgmt", "BasketPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Management_Service.ItemName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_Stock_Management_Service.TotalPrice.getDefaultInstance()))
                  .setSchemaDescriptor(new StockMgmtMethodDescriptorSupplier("BasketPrice"))
                  .build();
          }
        }
     }
     return getBasketPriceMethod;
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
    public void stockCheck(Generated_Stock_Management_Service.ItemName request,
        io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.ItemStatus> responseObserver) {
      asyncUnimplementedUnaryCall(getStockCheckMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.ItemName> basketPrice(
        io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.TotalPrice> responseObserver) {
      return asyncUnimplementedStreamingCall(getBasketPriceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStockCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Generated_Stock_Management_Service.ItemName,
                Generated_Stock_Management_Service.ItemStatus>(
                  this, METHODID_STOCK_CHECK)))
          .addMethod(
            getBasketPriceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Generated_Stock_Management_Service.ItemName,
                Generated_Stock_Management_Service.TotalPrice>(
                  this, METHODID_BASKET_PRICE)))
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
    public void stockCheck(Generated_Stock_Management_Service.ItemName request,
        io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.ItemStatus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStockCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.ItemName> basketPrice(
        io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.TotalPrice> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getBasketPriceMethod(), getCallOptions()), responseObserver);
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
    public Generated_Stock_Management_Service.ItemStatus stockCheck(Generated_Stock_Management_Service.ItemName request) {
      return blockingUnaryCall(
          getChannel(), getStockCheckMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<Generated_Stock_Management_Service.ItemStatus> stockCheck(
        Generated_Stock_Management_Service.ItemName request) {
      return futureUnaryCall(
          getChannel().newCall(getStockCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STOCK_CHECK = 0;
  private static final int METHODID_BASKET_PRICE = 1;

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
          serviceImpl.stockCheck((Generated_Stock_Management_Service.ItemName) request,
              (io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.ItemStatus>) responseObserver);
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
        case METHODID_BASKET_PRICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.basketPrice(
              (io.grpc.stub.StreamObserver<Generated_Stock_Management_Service.TotalPrice>) responseObserver);
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
      return Generated_Stock_Management_Service.CA1.getDescriptor();
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
              .addMethod(getBasketPriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
