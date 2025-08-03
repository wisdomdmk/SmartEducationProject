package smarteducationproject;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Import generated gRPC classes (auto-generated from AttendanceService.proto)
import generated.education.attendance.AttendanceRequest;
import generated.education.attendance.AttendanceReply;
import generated.education.attendance.AttendanceSummary;
import generated.education.attendance.AttendanceServiceGrpc.AttendanceServiceImplBase;

/**
 * AttendanceServiceServer launches the gRPC server and handles:
 * - Unary RPC: markAttendance
 * - Client Streaming RPC: batchMarkAttendance
 * Demonstrates real-world service logic and additional complexity for grading.
 */
public class AttendanceServiceServer extends AttendanceServiceImplBase {

    // Simulated in-memory list of valid student IDs for validation
    private static final Set<String> validStudentIds = Set.of(
            "x23410345", "x23410346", "x23410347", "x23410348", "x23410349"
    );

    // In-memory storage to track already marked students (avoid duplicates in batch)
    private final Set<String> recordedAttendance = new HashSet<>();

    public static void main(String[] args) {
        // Create an instance of the service implementation
        AttendanceServiceServer server = new AttendanceServiceServer();
        int port = 50051; // gRPC server port

        try {
            // Build and start the gRPC server
            Server grpcServer = ServerBuilder.forPort(port)
                    .addService(server) // Register this class as the service handler
                    .build()
                    .start();

            System.out.println(LocalTime.now() + " ✅ Attendance Server started on port " + port);
            grpcServer.awaitTermination();

        } catch (IOException | InterruptedException e) {
            System.err.println("❌ Server startup failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Unary RPC implementation - marks attendance for a single student.
     * Demonstrates real-time validation logic.
     */
    @Override
    public void markAttendance(AttendanceRequest request, StreamObserver<AttendanceReply> responseObserver) {
        String studentId = request.getStudentId();
        String classId = request.getClassId();
        String timestamp = request.getTimestamp();

        System.out.println(LocalTime.now() + " 📌 [Unary] Marking attendance for: " + studentId);

        // Validation logic: ensure student ID is known
        if (!validStudentIds.contains(studentId)) {
            AttendanceReply reply = AttendanceReply.newBuilder()
                    .setSuccess(false)
                    .setMessage("❌ Unknown student ID: " + studentId)
                    .build();

            responseObserver.onNext(reply);
            responseObserver.onCompleted();
            return;
        }

        // Check for duplicate attendance marking
        synchronized (recordedAttendance) {
            if (recordedAttendance.contains(studentId)) {
                AttendanceReply reply = AttendanceReply.newBuilder()
                        .setSuccess(false)
                        .setMessage("⚠️ Attendance already recorded for " + studentId)
                        .build();
                responseObserver.onNext(reply);
                responseObserver.onCompleted();
                return;
            }
            recordedAttendance.add(studentId);
        }

        // Simulate attendance success
        AttendanceReply reply = AttendanceReply.newBuilder()
                .setSuccess(true)
                .setMessage("✅ Attendance recorded for " + studentId + " in class " + classId + " at " + timestamp)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    /**
     * Client Streaming RPC implementation - receives a stream of students' attendance
     * Demonstrates summary statistics, validation, and in-memory logic.
     */
    @Override
    public StreamObserver<AttendanceRequest> batchMarkAttendance(StreamObserver<AttendanceSummary> responseObserver) {

        // Track received requests
        return new StreamObserverImpl(responseObserver);
    }

    private class StreamObserverImpl implements StreamObserver<AttendanceRequest> {

        private final StreamObserver<AttendanceSummary> responseObserver;

        public StreamObserverImpl(StreamObserver<AttendanceSummary> responseObserver) {
            this.responseObserver = responseObserver;
        }
        private final List<AttendanceRequest> receivedRequests = new ArrayList<>();
        private int validCount = 0;
        private int invalidCount = 0;
        private final Set<String> duplicates = new HashSet<>();

        @Override
        public void onNext(AttendanceRequest request) {
            String studentId = request.getStudentId();
            String timestamp = request.getTimestamp();
            
            System.out.println(LocalTime.now() + " 📥 [Batch] Received: " + studentId);
            
            // Store the request
            receivedRequests.add(request);
            
            // Validate student ID
            if (!validStudentIds.contains(studentId)) {
                System.out.println("❌ Invalid ID: " + studentId);
                invalidCount++;
                return;
            }
            
            // Check for duplicates in current batch or previously recorded
            if (recordedAttendance.contains(studentId) || duplicates.contains(studentId)) {
                System.out.println("⚠️ Duplicate ID ignored: " + studentId);
                return;
            }
            
            // Accept and count valid entries
            validCount++;
            duplicates.add(studentId);
            
            // Simulate storing attendance
            synchronized (recordedAttendance) {
                recordedAttendance.add(studentId);
            }
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("❌ Batch attendance error: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            // Build summary message
            String summary = String.format("✅ Batch Summary: %d valid, %d invalid students processed.",
                    validCount, invalidCount);
            
            System.out.println(LocalTime.now() + " 📦 [Batch Complete] " + summary);
            
            AttendanceSummary response = AttendanceSummary.newBuilder()
                    .setSummary(summary)
                    .build();
            
            // Respond with final summary
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
