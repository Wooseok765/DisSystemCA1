package Generated_NumberOfCustomer_Service;

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
    comments = "Source: NumOfCustomer.proto")
public final class NumberOfCustomerGrpc {

  private NumberOfCustomerGrpc() {}

  public static final String SERVICE_NAME = "service3.NumberOfCustomer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Generated_NumberOfCustomer_Service.Location,
      Generated_NumberOfCustomer_Service.CurrentCustomer> getCheckNumOfCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckNumOfCustomer",
      requestType = Generated_NumberOfCustomer_Service.Location.class,
      responseType = Generated_NumberOfCustomer_Service.CurrentCustomer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<Generated_NumberOfCustomer_Service.Location,
      Generated_NumberOfCustomer_Service.CurrentCustomer> getCheckNumOfCustomerMethod() {
    io.grpc.MethodDescriptor<Generated_NumberOfCustomer_Service.Location, Generated_NumberOfCustomer_Service.CurrentCustomer> getCheckNumOfCustomerMethod;
    if ((getCheckNumOfCustomerMethod = NumberOfCustomerGrpc.getCheckNumOfCustomerMethod) == null) {
      synchronized (NumberOfCustomerGrpc.class) {
        if ((getCheckNumOfCustomerMethod = NumberOfCustomerGrpc.getCheckNumOfCustomerMethod) == null) {
          NumberOfCustomerGrpc.getCheckNumOfCustomerMethod = getCheckNumOfCustomerMethod = 
              io.grpc.MethodDescriptor.<Generated_NumberOfCustomer_Service.Location, Generated_NumberOfCustomer_Service.CurrentCustomer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service3.NumberOfCustomer", "CheckNumOfCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_NumberOfCustomer_Service.Location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Generated_NumberOfCustomer_Service.CurrentCustomer.getDefaultInstance()))
                  .setSchemaDescriptor(new NumberOfCustomerMethodDescriptorSupplier("CheckNumOfCustomer"))
                  .build();
          }
        }
     }
     return getCheckNumOfCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumberOfCustomerStub newStub(io.grpc.Channel channel) {
    return new NumberOfCustomerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumberOfCustomerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NumberOfCustomerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumberOfCustomerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NumberOfCustomerFutureStub(channel);
  }

  /**
   */
  public static abstract class NumberOfCustomerImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<Generated_NumberOfCustomer_Service.Location> checkNumOfCustomer(
        io.grpc.stub.StreamObserver<Generated_NumberOfCustomer_Service.CurrentCustomer> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckNumOfCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckNumOfCustomerMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                Generated_NumberOfCustomer_Service.Location,
                Generated_NumberOfCustomer_Service.CurrentCustomer>(
                  this, METHODID_CHECK_NUM_OF_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class NumberOfCustomerStub extends io.grpc.stub.AbstractStub<NumberOfCustomerStub> {
    private NumberOfCustomerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberOfCustomerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberOfCustomerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberOfCustomerStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Generated_NumberOfCustomer_Service.Location> checkNumOfCustomer(
        io.grpc.stub.StreamObserver<Generated_NumberOfCustomer_Service.CurrentCustomer> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getCheckNumOfCustomerMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class NumberOfCustomerBlockingStub extends io.grpc.stub.AbstractStub<NumberOfCustomerBlockingStub> {
    private NumberOfCustomerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberOfCustomerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberOfCustomerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberOfCustomerBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class NumberOfCustomerFutureStub extends io.grpc.stub.AbstractStub<NumberOfCustomerFutureStub> {
    private NumberOfCustomerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberOfCustomerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberOfCustomerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberOfCustomerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHECK_NUM_OF_CUSTOMER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumberOfCustomerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumberOfCustomerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_NUM_OF_CUSTOMER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkNumOfCustomer(
              (io.grpc.stub.StreamObserver<Generated_NumberOfCustomer_Service.CurrentCustomer>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NumberOfCustomerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumberOfCustomerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Generated_NumberOfCustomer_Service.CA1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumberOfCustomer");
    }
  }

  private static final class NumberOfCustomerFileDescriptorSupplier
      extends NumberOfCustomerBaseDescriptorSupplier {
    NumberOfCustomerFileDescriptorSupplier() {}
  }

  private static final class NumberOfCustomerMethodDescriptorSupplier
      extends NumberOfCustomerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumberOfCustomerMethodDescriptorSupplier(String methodName) {
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
      synchronized (NumberOfCustomerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumberOfCustomerFileDescriptorSupplier())
              .addMethod(getCheckNumOfCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
