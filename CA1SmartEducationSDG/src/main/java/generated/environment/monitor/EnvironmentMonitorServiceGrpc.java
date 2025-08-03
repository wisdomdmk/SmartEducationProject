package generated.environment.monitor;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Environment Monitor Service allows real-time bidirectional communication
 * between classroom sensors and server for adjusting classroom conditions.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: EnvironmentMonitorService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnvironmentMonitorServiceGrpc {

  private EnvironmentMonitorServiceGrpc() {}

  public static final String SERVICE_NAME = "EnvironmentMonitorService.EnvironmentMonitorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.environment.monitor.SensorData,
      generated.environment.monitor.AdjustmentCommand> getMonitorEnvironmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorEnvironment",
      requestType = generated.environment.monitor.SensorData.class,
      responseType = generated.environment.monitor.AdjustmentCommand.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.environment.monitor.SensorData,
      generated.environment.monitor.AdjustmentCommand> getMonitorEnvironmentMethod() {
    io.grpc.MethodDescriptor<generated.environment.monitor.SensorData, generated.environment.monitor.AdjustmentCommand> getMonitorEnvironmentMethod;
    if ((getMonitorEnvironmentMethod = EnvironmentMonitorServiceGrpc.getMonitorEnvironmentMethod) == null) {
      synchronized (EnvironmentMonitorServiceGrpc.class) {
        if ((getMonitorEnvironmentMethod = EnvironmentMonitorServiceGrpc.getMonitorEnvironmentMethod) == null) {
          EnvironmentMonitorServiceGrpc.getMonitorEnvironmentMethod = getMonitorEnvironmentMethod =
              io.grpc.MethodDescriptor.<generated.environment.monitor.SensorData, generated.environment.monitor.AdjustmentCommand>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorEnvironment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.environment.monitor.SensorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.environment.monitor.AdjustmentCommand.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentMonitorServiceMethodDescriptorSupplier("MonitorEnvironment"))
              .build();
        }
      }
    }
    return getMonitorEnvironmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.environment.monitor.SensorData,
      generated.environment.monitor.EnvironmentStatus> getGetEnvironmentStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnvironmentStatus",
      requestType = generated.environment.monitor.SensorData.class,
      responseType = generated.environment.monitor.EnvironmentStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.environment.monitor.SensorData,
      generated.environment.monitor.EnvironmentStatus> getGetEnvironmentStatusMethod() {
    io.grpc.MethodDescriptor<generated.environment.monitor.SensorData, generated.environment.monitor.EnvironmentStatus> getGetEnvironmentStatusMethod;
    if ((getGetEnvironmentStatusMethod = EnvironmentMonitorServiceGrpc.getGetEnvironmentStatusMethod) == null) {
      synchronized (EnvironmentMonitorServiceGrpc.class) {
        if ((getGetEnvironmentStatusMethod = EnvironmentMonitorServiceGrpc.getGetEnvironmentStatusMethod) == null) {
          EnvironmentMonitorServiceGrpc.getGetEnvironmentStatusMethod = getGetEnvironmentStatusMethod =
              io.grpc.MethodDescriptor.<generated.environment.monitor.SensorData, generated.environment.monitor.EnvironmentStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnvironmentStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.environment.monitor.SensorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.environment.monitor.EnvironmentStatus.getDefaultInstance()))
              .setSchemaDescriptor(new EnvironmentMonitorServiceMethodDescriptorSupplier("GetEnvironmentStatus"))
              .build();
        }
      }
    }
    return getGetEnvironmentStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentMonitorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentMonitorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentMonitorServiceStub>() {
        @java.lang.Override
        public EnvironmentMonitorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentMonitorServiceStub(channel, callOptions);
        }
      };
    return EnvironmentMonitorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentMonitorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentMonitorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentMonitorServiceBlockingStub>() {
        @java.lang.Override
        public EnvironmentMonitorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentMonitorServiceBlockingStub(channel, callOptions);
        }
      };
    return EnvironmentMonitorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentMonitorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvironmentMonitorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvironmentMonitorServiceFutureStub>() {
        @java.lang.Override
        public EnvironmentMonitorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvironmentMonitorServiceFutureStub(channel, callOptions);
        }
      };
    return EnvironmentMonitorServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Environment Monitor Service allows real-time bidirectional communication
   * between classroom sensors and server for adjusting classroom conditions.
   * </pre>
   */
  public static abstract class EnvironmentMonitorServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Bidirectional streaming RPC: Sensors stream data and receive environment adjustment commands
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.environment.monitor.SensorData> monitorEnvironment(
        io.grpc.stub.StreamObserver<generated.environment.monitor.AdjustmentCommand> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMonitorEnvironmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC: Check current environment status based on latest sensor values
     * </pre>
     */
    public void getEnvironmentStatus(generated.environment.monitor.SensorData request,
        io.grpc.stub.StreamObserver<generated.environment.monitor.EnvironmentStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnvironmentStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorEnvironmentMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                generated.environment.monitor.SensorData,
                generated.environment.monitor.AdjustmentCommand>(
                  this, METHODID_MONITOR_ENVIRONMENT)))
          .addMethod(
            getGetEnvironmentStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.environment.monitor.SensorData,
                generated.environment.monitor.EnvironmentStatus>(
                  this, METHODID_GET_ENVIRONMENT_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Environment Monitor Service allows real-time bidirectional communication
   * between classroom sensors and server for adjusting classroom conditions.
   * </pre>
   */
  public static final class EnvironmentMonitorServiceStub extends io.grpc.stub.AbstractAsyncStub<EnvironmentMonitorServiceStub> {
    private EnvironmentMonitorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentMonitorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentMonitorServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC: Sensors stream data and receive environment adjustment commands
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.environment.monitor.SensorData> monitorEnvironment(
        io.grpc.stub.StreamObserver<generated.environment.monitor.AdjustmentCommand> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMonitorEnvironmentMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC: Check current environment status based on latest sensor values
     * </pre>
     */
    public void getEnvironmentStatus(generated.environment.monitor.SensorData request,
        io.grpc.stub.StreamObserver<generated.environment.monitor.EnvironmentStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnvironmentStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Environment Monitor Service allows real-time bidirectional communication
   * between classroom sensors and server for adjusting classroom conditions.
   * </pre>
   */
  public static final class EnvironmentMonitorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnvironmentMonitorServiceBlockingStub> {
    private EnvironmentMonitorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentMonitorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentMonitorServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Check current environment status based on latest sensor values
     * </pre>
     */
    public generated.environment.monitor.EnvironmentStatus getEnvironmentStatus(generated.environment.monitor.SensorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnvironmentStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Environment Monitor Service allows real-time bidirectional communication
   * between classroom sensors and server for adjusting classroom conditions.
   * </pre>
   */
  public static final class EnvironmentMonitorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnvironmentMonitorServiceFutureStub> {
    private EnvironmentMonitorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentMonitorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvironmentMonitorServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Check current environment status based on latest sensor values
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.environment.monitor.EnvironmentStatus> getEnvironmentStatus(
        generated.environment.monitor.SensorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnvironmentStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENVIRONMENT_STATUS = 0;
  private static final int METHODID_MONITOR_ENVIRONMENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnvironmentMonitorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvironmentMonitorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ENVIRONMENT_STATUS:
          serviceImpl.getEnvironmentStatus((generated.environment.monitor.SensorData) request,
              (io.grpc.stub.StreamObserver<generated.environment.monitor.EnvironmentStatus>) responseObserver);
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
        case METHODID_MONITOR_ENVIRONMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.monitorEnvironment(
              (io.grpc.stub.StreamObserver<generated.environment.monitor.AdjustmentCommand>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnvironmentMonitorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentMonitorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.environment.monitor.EnvironmentMonitorServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentMonitorService");
    }
  }

  private static final class EnvironmentMonitorServiceFileDescriptorSupplier
      extends EnvironmentMonitorServiceBaseDescriptorSupplier {
    EnvironmentMonitorServiceFileDescriptorSupplier() {}
  }

  private static final class EnvironmentMonitorServiceMethodDescriptorSupplier
      extends EnvironmentMonitorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvironmentMonitorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnvironmentMonitorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentMonitorServiceFileDescriptorSupplier())
              .addMethod(getMonitorEnvironmentMethod())
              .addMethod(getGetEnvironmentStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
