package io.grpc.smartkitchen.oven;

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
    comments = "Source: oven.proto")
public final class SmartOvenGrpc {

  private SmartOvenGrpc() {}

  public static final String SERVICE_NAME = "SmartOven";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.oven.PreheatRequest,
      io.grpc.smartkitchen.oven.PreheatResponse> getPreheatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "preheat",
      requestType = io.grpc.smartkitchen.oven.PreheatRequest.class,
      responseType = io.grpc.smartkitchen.oven.PreheatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.oven.PreheatRequest,
      io.grpc.smartkitchen.oven.PreheatResponse> getPreheatMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.oven.PreheatRequest, io.grpc.smartkitchen.oven.PreheatResponse> getPreheatMethod;
    if ((getPreheatMethod = SmartOvenGrpc.getPreheatMethod) == null) {
      synchronized (SmartOvenGrpc.class) {
        if ((getPreheatMethod = SmartOvenGrpc.getPreheatMethod) == null) {
          SmartOvenGrpc.getPreheatMethod = getPreheatMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.oven.PreheatRequest, io.grpc.smartkitchen.oven.PreheatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartOven", "preheat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.oven.PreheatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.oven.PreheatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOvenMethodDescriptorSupplier("preheat"))
                  .build();
          }
        }
     }
     return getPreheatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.oven.TurnOffRequest,
      io.grpc.smartkitchen.oven.TurnOffResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOff",
      requestType = io.grpc.smartkitchen.oven.TurnOffRequest.class,
      responseType = io.grpc.smartkitchen.oven.TurnOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.oven.TurnOffRequest,
      io.grpc.smartkitchen.oven.TurnOffResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.oven.TurnOffRequest, io.grpc.smartkitchen.oven.TurnOffResponse> getTurnOffMethod;
    if ((getTurnOffMethod = SmartOvenGrpc.getTurnOffMethod) == null) {
      synchronized (SmartOvenGrpc.class) {
        if ((getTurnOffMethod = SmartOvenGrpc.getTurnOffMethod) == null) {
          SmartOvenGrpc.getTurnOffMethod = getTurnOffMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.oven.TurnOffRequest, io.grpc.smartkitchen.oven.TurnOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartOven", "turnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.oven.TurnOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.oven.TurnOffResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartOvenMethodDescriptorSupplier("turnOff"))
                  .build();
          }
        }
     }
     return getTurnOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartOvenStub newStub(io.grpc.Channel channel) {
    return new SmartOvenStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartOvenBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartOvenBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartOvenFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartOvenFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartOvenImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.PreheatRequest> preheat(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.PreheatResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPreheatMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.TurnOffRequest> turnOff(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.TurnOffResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTurnOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPreheatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.smartkitchen.oven.PreheatRequest,
                io.grpc.smartkitchen.oven.PreheatResponse>(
                  this, METHODID_PREHEAT)))
          .addMethod(
            getTurnOffMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.smartkitchen.oven.TurnOffRequest,
                io.grpc.smartkitchen.oven.TurnOffResponse>(
                  this, METHODID_TURN_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class SmartOvenStub extends io.grpc.stub.AbstractStub<SmartOvenStub> {
    private SmartOvenStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOvenStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOvenStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOvenStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.PreheatRequest> preheat(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.PreheatResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPreheatMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.TurnOffRequest> turnOff(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.TurnOffResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SmartOvenBlockingStub extends io.grpc.stub.AbstractStub<SmartOvenBlockingStub> {
    private SmartOvenBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOvenBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOvenBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOvenBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class SmartOvenFutureStub extends io.grpc.stub.AbstractStub<SmartOvenFutureStub> {
    private SmartOvenFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartOvenFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartOvenFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartOvenFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PREHEAT = 0;
  private static final int METHODID_TURN_OFF = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartOvenImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartOvenImplBase serviceImpl, int methodId) {
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
        case METHODID_PREHEAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.preheat(
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.PreheatResponse>) responseObserver);
        case METHODID_TURN_OFF:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.turnOff(
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.oven.TurnOffResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartOvenBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartOvenBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.smartkitchen.oven.Oven.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartOven");
    }
  }

  private static final class SmartOvenFileDescriptorSupplier
      extends SmartOvenBaseDescriptorSupplier {
    SmartOvenFileDescriptorSupplier() {}
  }

  private static final class SmartOvenMethodDescriptorSupplier
      extends SmartOvenBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartOvenMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartOvenGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartOvenFileDescriptorSupplier())
              .addMethod(getPreheatMethod())
              .addMethod(getTurnOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
