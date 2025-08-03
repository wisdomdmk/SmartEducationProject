package generated.lecture.stream;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The service definition for Lecture Streaming
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: LectureStreamService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LectureStreamServiceGrpc {

  private LectureStreamServiceGrpc() {}

  public static final String SERVICE_NAME = "LectureStreamService.LectureStreamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.lecture.stream.StreamStartRequest,
      generated.lecture.stream.StreamReply> getStartStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartStreaming",
      requestType = generated.lecture.stream.StreamStartRequest.class,
      responseType = generated.lecture.stream.StreamReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.lecture.stream.StreamStartRequest,
      generated.lecture.stream.StreamReply> getStartStreamingMethod() {
    io.grpc.MethodDescriptor<generated.lecture.stream.StreamStartRequest, generated.lecture.stream.StreamReply> getStartStreamingMethod;
    if ((getStartStreamingMethod = LectureStreamServiceGrpc.getStartStreamingMethod) == null) {
      synchronized (LectureStreamServiceGrpc.class) {
        if ((getStartStreamingMethod = LectureStreamServiceGrpc.getStartStreamingMethod) == null) {
          LectureStreamServiceGrpc.getStartStreamingMethod = getStartStreamingMethod =
              io.grpc.MethodDescriptor.<generated.lecture.stream.StreamStartRequest, generated.lecture.stream.StreamReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.lecture.stream.StreamStartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.lecture.stream.StreamReply.getDefaultInstance()))
              .setSchemaDescriptor(new LectureStreamServiceMethodDescriptorSupplier("StartStreaming"))
              .build();
        }
      }
    }
    return getStartStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.lecture.stream.RecordingRequest,
      generated.lecture.stream.LectureFrame> getViewLectureRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewLectureRecording",
      requestType = generated.lecture.stream.RecordingRequest.class,
      responseType = generated.lecture.stream.LectureFrame.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.lecture.stream.RecordingRequest,
      generated.lecture.stream.LectureFrame> getViewLectureRecordingMethod() {
    io.grpc.MethodDescriptor<generated.lecture.stream.RecordingRequest, generated.lecture.stream.LectureFrame> getViewLectureRecordingMethod;
    if ((getViewLectureRecordingMethod = LectureStreamServiceGrpc.getViewLectureRecordingMethod) == null) {
      synchronized (LectureStreamServiceGrpc.class) {
        if ((getViewLectureRecordingMethod = LectureStreamServiceGrpc.getViewLectureRecordingMethod) == null) {
          LectureStreamServiceGrpc.getViewLectureRecordingMethod = getViewLectureRecordingMethod =
              io.grpc.MethodDescriptor.<generated.lecture.stream.RecordingRequest, generated.lecture.stream.LectureFrame>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ViewLectureRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.lecture.stream.RecordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.lecture.stream.LectureFrame.getDefaultInstance()))
              .setSchemaDescriptor(new LectureStreamServiceMethodDescriptorSupplier("ViewLectureRecording"))
              .build();
        }
      }
    }
    return getViewLectureRecordingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LectureStreamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureStreamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureStreamServiceStub>() {
        @java.lang.Override
        public LectureStreamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureStreamServiceStub(channel, callOptions);
        }
      };
    return LectureStreamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LectureStreamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureStreamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureStreamServiceBlockingStub>() {
        @java.lang.Override
        public LectureStreamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureStreamServiceBlockingStub(channel, callOptions);
        }
      };
    return LectureStreamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LectureStreamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureStreamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureStreamServiceFutureStub>() {
        @java.lang.Override
        public LectureStreamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureStreamServiceFutureStub(channel, callOptions);
        }
      };
    return LectureStreamServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The service definition for Lecture Streaming
   * </pre>
   */
  public static abstract class LectureStreamServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC to start lecture streaming for a given course and instructor
     * </pre>
     */
    public void startStreaming(generated.lecture.stream.StreamStartRequest request,
        io.grpc.stub.StreamObserver<generated.lecture.stream.StreamReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC to view a previously recorded lecture
     * </pre>
     */
    public void viewLectureRecording(generated.lecture.stream.RecordingRequest request,
        io.grpc.stub.StreamObserver<generated.lecture.stream.LectureFrame> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getViewLectureRecordingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.lecture.stream.StreamStartRequest,
                generated.lecture.stream.StreamReply>(
                  this, METHODID_START_STREAMING)))
          .addMethod(
            getViewLectureRecordingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                generated.lecture.stream.RecordingRequest,
                generated.lecture.stream.LectureFrame>(
                  this, METHODID_VIEW_LECTURE_RECORDING)))
          .build();
    }
  }

  /**
   * <pre>
   * The service definition for Lecture Streaming
   * </pre>
   */
  public static final class LectureStreamServiceStub extends io.grpc.stub.AbstractAsyncStub<LectureStreamServiceStub> {
    private LectureStreamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureStreamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureStreamServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC to start lecture streaming for a given course and instructor
     * </pre>
     */
    public void startStreaming(generated.lecture.stream.StreamStartRequest request,
        io.grpc.stub.StreamObserver<generated.lecture.stream.StreamReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC to view a previously recorded lecture
     * </pre>
     */
    public void viewLectureRecording(generated.lecture.stream.RecordingRequest request,
        io.grpc.stub.StreamObserver<generated.lecture.stream.LectureFrame> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getViewLectureRecordingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The service definition for Lecture Streaming
   * </pre>
   */
  public static final class LectureStreamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LectureStreamServiceBlockingStub> {
    private LectureStreamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureStreamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureStreamServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC to start lecture streaming for a given course and instructor
     * </pre>
     */
    public generated.lecture.stream.StreamReply startStreaming(generated.lecture.stream.StreamStartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartStreamingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming RPC to view a previously recorded lecture
     * </pre>
     */
    public java.util.Iterator<generated.lecture.stream.LectureFrame> viewLectureRecording(
        generated.lecture.stream.RecordingRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getViewLectureRecordingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The service definition for Lecture Streaming
   * </pre>
   */
  public static final class LectureStreamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LectureStreamServiceFutureStub> {
    private LectureStreamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureStreamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureStreamServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC to start lecture streaming for a given course and instructor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.lecture.stream.StreamReply> startStreaming(
        generated.lecture.stream.StreamStartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartStreamingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_STREAMING = 0;
  private static final int METHODID_VIEW_LECTURE_RECORDING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LectureStreamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LectureStreamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_STREAMING:
          serviceImpl.startStreaming((generated.lecture.stream.StreamStartRequest) request,
              (io.grpc.stub.StreamObserver<generated.lecture.stream.StreamReply>) responseObserver);
          break;
        case METHODID_VIEW_LECTURE_RECORDING:
          serviceImpl.viewLectureRecording((generated.lecture.stream.RecordingRequest) request,
              (io.grpc.stub.StreamObserver<generated.lecture.stream.LectureFrame>) responseObserver);
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

  private static abstract class LectureStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LectureStreamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.lecture.stream.LectureStreamServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LectureStreamService");
    }
  }

  private static final class LectureStreamServiceFileDescriptorSupplier
      extends LectureStreamServiceBaseDescriptorSupplier {
    LectureStreamServiceFileDescriptorSupplier() {}
  }

  private static final class LectureStreamServiceMethodDescriptorSupplier
      extends LectureStreamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LectureStreamServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LectureStreamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LectureStreamServiceFileDescriptorSupplier())
              .addMethod(getStartStreamingMethod())
              .addMethod(getViewLectureRecordingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
