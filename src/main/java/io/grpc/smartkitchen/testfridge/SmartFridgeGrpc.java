package io.grpc.smartkitchen.testfridge;

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
    comments = "Source: testfridge.proto")
public final class SmartFridgeGrpc {

  private SmartFridgeGrpc() {}

  public static final String SERVICE_NAME = "SmartFridge";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.testfridge.TemperatureRequest,
      io.grpc.smartkitchen.testfridge.TemperatureResponse> getTemperatureDisplayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "temperatureDisplay",
      requestType = io.grpc.smartkitchen.testfridge.TemperatureRequest.class,
      responseType = io.grpc.smartkitchen.testfridge.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.testfridge.TemperatureRequest,
      io.grpc.smartkitchen.testfridge.TemperatureResponse> getTemperatureDisplayMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.testfridge.TemperatureRequest, io.grpc.smartkitchen.testfridge.TemperatureResponse> getTemperatureDisplayMethod;
    if ((getTemperatureDisplayMethod = SmartFridgeGrpc.getTemperatureDisplayMethod) == null) {
      synchronized (SmartFridgeGrpc.class) {
        if ((getTemperatureDisplayMethod = SmartFridgeGrpc.getTemperatureDisplayMethod) == null) {
          SmartFridgeGrpc.getTemperatureDisplayMethod = getTemperatureDisplayMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.testfridge.TemperatureRequest, io.grpc.smartkitchen.testfridge.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFridge", "temperatureDisplay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.testfridge.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.testfridge.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartFridgeMethodDescriptorSupplier("temperatureDisplay"))
                  .build();
          }
        }
     }
     return getTemperatureDisplayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartFridgeStub newStub(io.grpc.Channel channel) {
    return new SmartFridgeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartFridgeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartFridgeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartFridgeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartFridgeFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartFridgeImplBase implements io.grpc.BindableService {

    /**
     */
    public void temperatureDisplay(io.grpc.smartkitchen.testfridge.TemperatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.testfridge.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTemperatureDisplayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTemperatureDisplayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.smartkitchen.testfridge.TemperatureRequest,
                io.grpc.smartkitchen.testfridge.TemperatureResponse>(
                  this, METHODID_TEMPERATURE_DISPLAY)))
          .build();
    }
  }

  /**
   */
  public static final class SmartFridgeStub extends io.grpc.stub.AbstractStub<SmartFridgeStub> {
    private SmartFridgeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFridgeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFridgeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFridgeStub(channel, callOptions);
    }

    /**
     */
    public void temperatureDisplay(io.grpc.smartkitchen.testfridge.TemperatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.testfridge.TemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTemperatureDisplayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartFridgeBlockingStub extends io.grpc.stub.AbstractStub<SmartFridgeBlockingStub> {
    private SmartFridgeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFridgeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFridgeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFridgeBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.smartkitchen.testfridge.TemperatureResponse temperatureDisplay(io.grpc.smartkitchen.testfridge.TemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getTemperatureDisplayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartFridgeFutureStub extends io.grpc.stub.AbstractStub<SmartFridgeFutureStub> {
    private SmartFridgeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartFridgeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartFridgeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartFridgeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.smartkitchen.testfridge.TemperatureResponse> temperatureDisplay(
        io.grpc.smartkitchen.testfridge.TemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTemperatureDisplayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEMPERATURE_DISPLAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartFridgeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartFridgeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEMPERATURE_DISPLAY:
          serviceImpl.temperatureDisplay((io.grpc.smartkitchen.testfridge.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.testfridge.TemperatureResponse>) responseObserver);
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

  private static abstract class SmartFridgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartFridgeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.smartkitchen.testfridge.Testfridge.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartFridge");
    }
  }

  private static final class SmartFridgeFileDescriptorSupplier
      extends SmartFridgeBaseDescriptorSupplier {
    SmartFridgeFileDescriptorSupplier() {}
  }

  private static final class SmartFridgeMethodDescriptorSupplier
      extends SmartFridgeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartFridgeMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartFridgeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartFridgeFileDescriptorSupplier())
              .addMethod(getTemperatureDisplayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
