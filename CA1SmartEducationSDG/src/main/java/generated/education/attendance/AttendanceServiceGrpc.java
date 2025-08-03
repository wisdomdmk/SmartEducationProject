package generated.education.attendance;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ===============================
 * AttendanceService Definition
 * ===============================
 * This service allows marking attendance for students.
 * - Unary RPC: MarkAttendance → records a single student's attendance
 * - Client Streaming RPC: BatchMarkAttendance → records attendance for multiple students in a batch
 * The server implementation must extend AttendanceServiceImplBase
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: AttendanceService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AttendanceServiceGrpc {

  private AttendanceServiceGrpc() {}

  public static final String SERVICE_NAME = "AttendanceService.AttendanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.education.attendance.AttendanceRequest,
      generated.education.attendance.AttendanceReply> getMarkAttendanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MarkAttendance",
      requestType = generated.education.attendance.AttendanceRequest.class,
      responseType = generated.education.attendance.AttendanceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.education.attendance.AttendanceRequest,
      generated.education.attendance.AttendanceReply> getMarkAttendanceMethod() {
    io.grpc.MethodDescriptor<generated.education.attendance.AttendanceRequest, generated.education.attendance.AttendanceReply> getMarkAttendanceMethod;
    if ((getMarkAttendanceMethod = AttendanceServiceGrpc.getMarkAttendanceMethod) == null) {
      synchronized (AttendanceServiceGrpc.class) {
        if ((getMarkAttendanceMethod = AttendanceServiceGrpc.getMarkAttendanceMethod) == null) {
          AttendanceServiceGrpc.getMarkAttendanceMethod = getMarkAttendanceMethod =
              io.grpc.MethodDescriptor.<generated.education.attendance.AttendanceRequest, generated.education.attendance.AttendanceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MarkAttendance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.education.attendance.AttendanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.education.attendance.AttendanceReply.getDefaultInstance()))
              .setSchemaDescriptor(new AttendanceServiceMethodDescriptorSupplier("MarkAttendance"))
              .build();
        }
      }
    }
    return getMarkAttendanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.education.attendance.AttendanceRequest,
      generated.education.attendance.AttendanceSummary> getBatchMarkAttendanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchMarkAttendance",
      requestType = generated.education.attendance.AttendanceRequest.class,
      responseType = generated.education.attendance.AttendanceSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.education.attendance.AttendanceRequest,
      generated.education.attendance.AttendanceSummary> getBatchMarkAttendanceMethod() {
    io.grpc.MethodDescriptor<generated.education.attendance.AttendanceRequest, generated.education.attendance.AttendanceSummary> getBatchMarkAttendanceMethod;
    if ((getBatchMarkAttendanceMethod = AttendanceServiceGrpc.getBatchMarkAttendanceMethod) == null) {
      synchronized (AttendanceServiceGrpc.class) {
        if ((getBatchMarkAttendanceMethod = AttendanceServiceGrpc.getBatchMarkAttendanceMethod) == null) {
          AttendanceServiceGrpc.getBatchMarkAttendanceMethod = getBatchMarkAttendanceMethod =
              io.grpc.MethodDescriptor.<generated.education.attendance.AttendanceRequest, generated.education.attendance.AttendanceSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchMarkAttendance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.education.attendance.AttendanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.education.attendance.AttendanceSummary.getDefaultInstance()))
              .setSchemaDescriptor(new AttendanceServiceMethodDescriptorSupplier("BatchMarkAttendance"))
              .build();
        }
      }
    }
    return getBatchMarkAttendanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AttendanceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttendanceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttendanceServiceStub>() {
        @java.lang.Override
        public AttendanceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttendanceServiceStub(channel, callOptions);
        }
      };
    return AttendanceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AttendanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttendanceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttendanceServiceBlockingStub>() {
        @java.lang.Override
        public AttendanceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttendanceServiceBlockingStub(channel, callOptions);
        }
      };
    return AttendanceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AttendanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AttendanceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AttendanceServiceFutureStub>() {
        @java.lang.Override
        public AttendanceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AttendanceServiceFutureStub(channel, callOptions);
        }
      };
    return AttendanceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ===============================
   * AttendanceService Definition
   * ===============================
   * This service allows marking attendance for students.
   * - Unary RPC: MarkAttendance → records a single student's attendance
   * - Client Streaming RPC: BatchMarkAttendance → records attendance for multiple students in a batch
   * The server implementation must extend AttendanceServiceImplBase
   * </pre>
   */
  public static abstract class AttendanceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary RPC: Mark attendance for a single student
     * Request contains student_id, timestamp, and class_id
     * Response confirms if attendance was recorded
     * </pre>
     */
    public void markAttendance(generated.education.attendance.AttendanceRequest request,
        io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMarkAttendanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC: Mark attendance for multiple students in a batch
     * Client sends a stream of AttendanceRequest messages
     * Server responds with a summary of how many students were marked present
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceRequest> batchMarkAttendance(
        io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBatchMarkAttendanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMarkAttendanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.education.attendance.AttendanceRequest,
                generated.education.attendance.AttendanceReply>(
                  this, METHODID_MARK_ATTENDANCE)))
          .addMethod(
            getBatchMarkAttendanceMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                generated.education.attendance.AttendanceRequest,
                generated.education.attendance.AttendanceSummary>(
                  this, METHODID_BATCH_MARK_ATTENDANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * ===============================
   * AttendanceService Definition
   * ===============================
   * This service allows marking attendance for students.
   * - Unary RPC: MarkAttendance → records a single student's attendance
   * - Client Streaming RPC: BatchMarkAttendance → records attendance for multiple students in a batch
   * The server implementation must extend AttendanceServiceImplBase
   * </pre>
   */
  public static final class AttendanceServiceStub extends io.grpc.stub.AbstractAsyncStub<AttendanceServiceStub> {
    private AttendanceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttendanceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttendanceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Mark attendance for a single student
     * Request contains student_id, timestamp, and class_id
     * Response confirms if attendance was recorded
     * </pre>
     */
    public void markAttendance(generated.education.attendance.AttendanceRequest request,
        io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMarkAttendanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming RPC: Mark attendance for multiple students in a batch
     * Client sends a stream of AttendanceRequest messages
     * Server responds with a summary of how many students were marked present
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceRequest> batchMarkAttendance(
        io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getBatchMarkAttendanceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * ===============================
   * AttendanceService Definition
   * ===============================
   * This service allows marking attendance for students.
   * - Unary RPC: MarkAttendance → records a single student's attendance
   * - Client Streaming RPC: BatchMarkAttendance → records attendance for multiple students in a batch
   * The server implementation must extend AttendanceServiceImplBase
   * </pre>
   */
  public static final class AttendanceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AttendanceServiceBlockingStub> {
    private AttendanceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttendanceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttendanceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Mark attendance for a single student
     * Request contains student_id, timestamp, and class_id
     * Response confirms if attendance was recorded
     * </pre>
     */
    public generated.education.attendance.AttendanceReply markAttendance(generated.education.attendance.AttendanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMarkAttendanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ===============================
   * AttendanceService Definition
   * ===============================
   * This service allows marking attendance for students.
   * - Unary RPC: MarkAttendance → records a single student's attendance
   * - Client Streaming RPC: BatchMarkAttendance → records attendance for multiple students in a batch
   * The server implementation must extend AttendanceServiceImplBase
   * </pre>
   */
  public static final class AttendanceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AttendanceServiceFutureStub> {
    private AttendanceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AttendanceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AttendanceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC: Mark attendance for a single student
     * Request contains student_id, timestamp, and class_id
     * Response confirms if attendance was recorded
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.education.attendance.AttendanceReply> markAttendance(
        generated.education.attendance.AttendanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMarkAttendanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MARK_ATTENDANCE = 0;
  private static final int METHODID_BATCH_MARK_ATTENDANCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AttendanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AttendanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MARK_ATTENDANCE:
          serviceImpl.markAttendance((generated.education.attendance.AttendanceRequest) request,
              (io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceReply>) responseObserver);
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
        case METHODID_BATCH_MARK_ATTENDANCE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchMarkAttendance(
              (io.grpc.stub.StreamObserver<generated.education.attendance.AttendanceSummary>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AttendanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AttendanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.education.attendance.AttendanceServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AttendanceService");
    }
  }

  private static final class AttendanceServiceFileDescriptorSupplier
      extends AttendanceServiceBaseDescriptorSupplier {
    AttendanceServiceFileDescriptorSupplier() {}
  }

  private static final class AttendanceServiceMethodDescriptorSupplier
      extends AttendanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AttendanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AttendanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AttendanceServiceFileDescriptorSupplier())
              .addMethod(getMarkAttendanceMethod())
              .addMethod(getBatchMarkAttendanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
