package io.grpc.smartkitchen.phone;

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
    comments = "Source: phone.proto")
public final class SmartPhoneGrpc {

  private SmartPhoneGrpc() {}

  public static final String SERVICE_NAME = "SmartPhone";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.BoilRequest,
      io.grpc.smartkitchen.phone.BoilResponse> getBoilMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boil",
      requestType = io.grpc.smartkitchen.phone.BoilRequest.class,
      responseType = io.grpc.smartkitchen.phone.BoilResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.BoilRequest,
      io.grpc.smartkitchen.phone.BoilResponse> getBoilMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.BoilRequest, io.grpc.smartkitchen.phone.BoilResponse> getBoilMethod;
    if ((getBoilMethod = SmartPhoneGrpc.getBoilMethod) == null) {
      synchronized (SmartPhoneGrpc.class) {
        if ((getBoilMethod = SmartPhoneGrpc.getBoilMethod) == null) {
          SmartPhoneGrpc.getBoilMethod = getBoilMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.phone.BoilRequest, io.grpc.smartkitchen.phone.BoilResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartPhone", "boil"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.BoilRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.BoilResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPhoneMethodDescriptorSupplier("boil"))
                  .build();
          }
        }
     }
     return getBoilMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.TemperatureRequest,
      io.grpc.smartkitchen.phone.TemperatureResponse> getTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "temperature",
      requestType = io.grpc.smartkitchen.phone.TemperatureRequest.class,
      responseType = io.grpc.smartkitchen.phone.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.TemperatureRequest,
      io.grpc.smartkitchen.phone.TemperatureResponse> getTemperatureMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.TemperatureRequest, io.grpc.smartkitchen.phone.TemperatureResponse> getTemperatureMethod;
    if ((getTemperatureMethod = SmartPhoneGrpc.getTemperatureMethod) == null) {
      synchronized (SmartPhoneGrpc.class) {
        if ((getTemperatureMethod = SmartPhoneGrpc.getTemperatureMethod) == null) {
          SmartPhoneGrpc.getTemperatureMethod = getTemperatureMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.phone.TemperatureRequest, io.grpc.smartkitchen.phone.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartPhone", "temperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPhoneMethodDescriptorSupplier("temperature"))
                  .build();
          }
        }
     }
     return getTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.PreheatRequest,
      io.grpc.smartkitchen.phone.PreheatResponse> getPreheatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "preheat",
      requestType = io.grpc.smartkitchen.phone.PreheatRequest.class,
      responseType = io.grpc.smartkitchen.phone.PreheatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.PreheatRequest,
      io.grpc.smartkitchen.phone.PreheatResponse> getPreheatMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.PreheatRequest, io.grpc.smartkitchen.phone.PreheatResponse> getPreheatMethod;
    if ((getPreheatMethod = SmartPhoneGrpc.getPreheatMethod) == null) {
      synchronized (SmartPhoneGrpc.class) {
        if ((getPreheatMethod = SmartPhoneGrpc.getPreheatMethod) == null) {
          SmartPhoneGrpc.getPreheatMethod = getPreheatMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.phone.PreheatRequest, io.grpc.smartkitchen.phone.PreheatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartPhone", "preheat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.PreheatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.PreheatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPhoneMethodDescriptorSupplier("preheat"))
                  .build();
          }
        }
     }
     return getPreheatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.TurnOffRequest,
      io.grpc.smartkitchen.phone.TurnOffResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOff",
      requestType = io.grpc.smartkitchen.phone.TurnOffRequest.class,
      responseType = io.grpc.smartkitchen.phone.TurnOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.TurnOffRequest,
      io.grpc.smartkitchen.phone.TurnOffResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.TurnOffRequest, io.grpc.smartkitchen.phone.TurnOffResponse> getTurnOffMethod;
    if ((getTurnOffMethod = SmartPhoneGrpc.getTurnOffMethod) == null) {
      synchronized (SmartPhoneGrpc.class) {
        if ((getTurnOffMethod = SmartPhoneGrpc.getTurnOffMethod) == null) {
          SmartPhoneGrpc.getTurnOffMethod = getTurnOffMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.phone.TurnOffRequest, io.grpc.smartkitchen.phone.TurnOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartPhone", "turnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.TurnOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.TurnOffResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPhoneMethodDescriptorSupplier("turnOff"))
                  .build();
          }
        }
     }
     return getTurnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.LightsOnRequest,
      io.grpc.smartkitchen.phone.LightsOnResponse> getLightsOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightsOn",
      requestType = io.grpc.smartkitchen.phone.LightsOnRequest.class,
      responseType = io.grpc.smartkitchen.phone.LightsOnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.LightsOnRequest,
      io.grpc.smartkitchen.phone.LightsOnResponse> getLightsOnMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.LightsOnRequest, io.grpc.smartkitchen.phone.LightsOnResponse> getLightsOnMethod;
    if ((getLightsOnMethod = SmartPhoneGrpc.getLightsOnMethod) == null) {
      synchronized (SmartPhoneGrpc.class) {
        if ((getLightsOnMethod = SmartPhoneGrpc.getLightsOnMethod) == null) {
          SmartPhoneGrpc.getLightsOnMethod = getLightsOnMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.phone.LightsOnRequest, io.grpc.smartkitchen.phone.LightsOnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartPhone", "lightsOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.LightsOnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.LightsOnResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPhoneMethodDescriptorSupplier("lightsOn"))
                  .build();
          }
        }
     }
     return getLightsOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.LightsOffRequest,
      io.grpc.smartkitchen.phone.LightsOffResponse> getLightsOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lightsOff",
      requestType = io.grpc.smartkitchen.phone.LightsOffRequest.class,
      responseType = io.grpc.smartkitchen.phone.LightsOffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.LightsOffRequest,
      io.grpc.smartkitchen.phone.LightsOffResponse> getLightsOffMethod() {
    io.grpc.MethodDescriptor<io.grpc.smartkitchen.phone.LightsOffRequest, io.grpc.smartkitchen.phone.LightsOffResponse> getLightsOffMethod;
    if ((getLightsOffMethod = SmartPhoneGrpc.getLightsOffMethod) == null) {
      synchronized (SmartPhoneGrpc.class) {
        if ((getLightsOffMethod = SmartPhoneGrpc.getLightsOffMethod) == null) {
          SmartPhoneGrpc.getLightsOffMethod = getLightsOffMethod = 
              io.grpc.MethodDescriptor.<io.grpc.smartkitchen.phone.LightsOffRequest, io.grpc.smartkitchen.phone.LightsOffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartPhone", "lightsOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.LightsOffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.smartkitchen.phone.LightsOffResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SmartPhoneMethodDescriptorSupplier("lightsOff"))
                  .build();
          }
        }
     }
     return getLightsOffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SmartPhoneStub newStub(io.grpc.Channel channel) {
    return new SmartPhoneStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SmartPhoneBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SmartPhoneBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SmartPhoneFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SmartPhoneFutureStub(channel);
  }

  /**
   */
  public static abstract class SmartPhoneImplBase implements io.grpc.BindableService {

    /**
     */
    public void boil(io.grpc.smartkitchen.phone.BoilRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.BoilResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBoilMethod(), responseObserver);
    }

    /**
     */
    public void temperature(io.grpc.smartkitchen.phone.TemperatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTemperatureMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.PreheatRequest> preheat(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.PreheatResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPreheatMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TurnOffRequest> turnOff(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TurnOffResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTurnOffMethod(), responseObserver);
    }

    /**
     */
    public void lightsOn(io.grpc.smartkitchen.phone.LightsOnRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.LightsOnResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightsOnMethod(), responseObserver);
    }

    /**
     */
    public void lightsOff(io.grpc.smartkitchen.phone.LightsOffRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.LightsOffResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLightsOffMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBoilMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.smartkitchen.phone.BoilRequest,
                io.grpc.smartkitchen.phone.BoilResponse>(
                  this, METHODID_BOIL)))
          .addMethod(
            getTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.smartkitchen.phone.TemperatureRequest,
                io.grpc.smartkitchen.phone.TemperatureResponse>(
                  this, METHODID_TEMPERATURE)))
          .addMethod(
            getPreheatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.smartkitchen.phone.PreheatRequest,
                io.grpc.smartkitchen.phone.PreheatResponse>(
                  this, METHODID_PREHEAT)))
          .addMethod(
            getTurnOffMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.smartkitchen.phone.TurnOffRequest,
                io.grpc.smartkitchen.phone.TurnOffResponse>(
                  this, METHODID_TURN_OFF)))
          .addMethod(
            getLightsOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.smartkitchen.phone.LightsOnRequest,
                io.grpc.smartkitchen.phone.LightsOnResponse>(
                  this, METHODID_LIGHTS_ON)))
          .addMethod(
            getLightsOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.smartkitchen.phone.LightsOffRequest,
                io.grpc.smartkitchen.phone.LightsOffResponse>(
                  this, METHODID_LIGHTS_OFF)))
          .build();
    }
  }

  /**
   */
  public static final class SmartPhoneStub extends io.grpc.stub.AbstractStub<SmartPhoneStub> {
    private SmartPhoneStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPhoneStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPhoneStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPhoneStub(channel, callOptions);
    }

    /**
     */
    public void boil(io.grpc.smartkitchen.phone.BoilRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.BoilResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBoilMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void temperature(io.grpc.smartkitchen.phone.TemperatureRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.PreheatRequest> preheat(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.PreheatResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPreheatMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TurnOffRequest> turnOff(
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TurnOffResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void lightsOn(io.grpc.smartkitchen.phone.LightsOnRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.LightsOnResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightsOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void lightsOff(io.grpc.smartkitchen.phone.LightsOffRequest request,
        io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.LightsOffResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLightsOffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SmartPhoneBlockingStub extends io.grpc.stub.AbstractStub<SmartPhoneBlockingStub> {
    private SmartPhoneBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPhoneBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPhoneBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPhoneBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<io.grpc.smartkitchen.phone.BoilResponse> boil(
        io.grpc.smartkitchen.phone.BoilRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getBoilMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.smartkitchen.phone.TemperatureResponse temperature(io.grpc.smartkitchen.phone.TemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.smartkitchen.phone.LightsOnResponse lightsOn(io.grpc.smartkitchen.phone.LightsOnRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightsOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.smartkitchen.phone.LightsOffResponse lightsOff(io.grpc.smartkitchen.phone.LightsOffRequest request) {
      return blockingUnaryCall(
          getChannel(), getLightsOffMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SmartPhoneFutureStub extends io.grpc.stub.AbstractStub<SmartPhoneFutureStub> {
    private SmartPhoneFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SmartPhoneFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SmartPhoneFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SmartPhoneFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.smartkitchen.phone.TemperatureResponse> temperature(
        io.grpc.smartkitchen.phone.TemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.smartkitchen.phone.LightsOnResponse> lightsOn(
        io.grpc.smartkitchen.phone.LightsOnRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightsOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.smartkitchen.phone.LightsOffResponse> lightsOff(
        io.grpc.smartkitchen.phone.LightsOffRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLightsOffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOIL = 0;
  private static final int METHODID_TEMPERATURE = 1;
  private static final int METHODID_LIGHTS_ON = 2;
  private static final int METHODID_LIGHTS_OFF = 3;
  private static final int METHODID_PREHEAT = 4;
  private static final int METHODID_TURN_OFF = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SmartPhoneImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SmartPhoneImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOIL:
          serviceImpl.boil((io.grpc.smartkitchen.phone.BoilRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.BoilResponse>) responseObserver);
          break;
        case METHODID_TEMPERATURE:
          serviceImpl.temperature((io.grpc.smartkitchen.phone.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TemperatureResponse>) responseObserver);
          break;
        case METHODID_LIGHTS_ON:
          serviceImpl.lightsOn((io.grpc.smartkitchen.phone.LightsOnRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.LightsOnResponse>) responseObserver);
          break;
        case METHODID_LIGHTS_OFF:
          serviceImpl.lightsOff((io.grpc.smartkitchen.phone.LightsOffRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.LightsOffResponse>) responseObserver);
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
        case METHODID_PREHEAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.preheat(
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.PreheatResponse>) responseObserver);
        case METHODID_TURN_OFF:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.turnOff(
              (io.grpc.stub.StreamObserver<io.grpc.smartkitchen.phone.TurnOffResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SmartPhoneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SmartPhoneBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.smartkitchen.phone.Phone.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SmartPhone");
    }
  }

  private static final class SmartPhoneFileDescriptorSupplier
      extends SmartPhoneBaseDescriptorSupplier {
    SmartPhoneFileDescriptorSupplier() {}
  }

  private static final class SmartPhoneMethodDescriptorSupplier
      extends SmartPhoneBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SmartPhoneMethodDescriptorSupplier(String methodName) {
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
      synchronized (SmartPhoneGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SmartPhoneFileDescriptorSupplier())
              .addMethod(getBoilMethod())
              .addMethod(getTemperatureMethod())
              .addMethod(getPreheatMethod())
              .addMethod(getTurnOffMethod())
              .addMethod(getLightsOnMethod())
              .addMethod(getLightsOffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
