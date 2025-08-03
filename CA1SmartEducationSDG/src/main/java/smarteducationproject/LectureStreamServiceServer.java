/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarteducationproject;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Import the generated gRPC service and message classes from proto
import generated.lecture.stream.LectureStreamServiceGrpc.LectureStreamServiceImplBase;
import generated.lecture.stream.StreamStartRequest;
import generated.lecture.stream.StreamReply;
import generated.lecture.stream.RecordingRequest;
import generated.lecture.stream.LectureFrame;

import com.google.protobuf.ByteString;

/**
 * This class simulates a gRPC server for a Smart Lecture Streaming Service.
 * It contains both unary and server-streaming RPC implementations.
 */
public class LectureStreamServiceServer extends LectureStreamServiceImplBase {

    public static void main(String[] args) {
        // Instantiate service handler
        LectureStreamServiceServer server = new LectureStreamServiceServer();
        int port = 50052; // Define gRPC port

        try {
            // Build and start the gRPC server
            Server grpcServer = ServerBuilder.forPort(port)
                    .addService(server) // Attach the service implementation
                    .build()
                    .start();

            System.out.println(LocalTime.now() + ": 📡 Lecture Stream Server started on port " + port);

            // Keep the server running
            grpcServer.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // === Unary RPC Implementation ===
    @Override
    public void startStreaming(StreamStartRequest request, StreamObserver<StreamReply> responseObserver) {
        // Extract request details
        String courseId = request.getCourseId();
        String instructor = request.getInstructor();

        System.out.println(LocalTime.now() + ": 🎥 Start stream for Course: " + courseId + ", Instructor: " + instructor);

        // Simulate stream status logic
        String status = new Random().nextBoolean() ? "active" : "offline";

        // Dynamically generate a stream URL
        String streamUrl = "https://stream.ncirl.ie/" + courseId.toLowerCase();

        // Build reply message
        StreamReply reply = StreamReply.newBuilder()
                .setStreamUrl(streamUrl)
                .setStatus(status)
                .build();

        // Send and complete the RPC
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }

    // === Server Streaming RPC Implementation ===
    @Override
    public void viewLectureRecording(RecordingRequest request, StreamObserver<LectureFrame> responseObserver) {
        String courseId = request.getCourseId();
        String date = request.getDate();

        System.out.println(LocalTime.now() + ": 📼 Begin streaming lecture recording for Course: " + courseId + " on " + date);

        try {
            // Simulate sending 5 frames of data with time delay
            for (int i = 1; i <= 5; i++) {
                // Simulate a 1 second delay to mimic real streaming
                TimeUnit.SECONDS.sleep(1);

                // Create a mock binary frame (e.g., "Frame data 1", etc.)
                byte[] frameData = ("Frame data " + i).getBytes();

                // Format timestamp like "00:00:01"
                String timestamp = String.format("00:00:%02d", i);

                // Build and send frame
                LectureFrame frame = LectureFrame.newBuilder()
                        .setFrameData(ByteString.copyFrom(frameData)) // Simulated binary data
                        .setTimestamp(timestamp)
                        .build();

                // Send frame to client
                responseObserver.onNext(frame);

                System.out.println(LocalTime.now() + ": ▶️ Sent frame " + i + " at " + timestamp);
            }
        } catch (InterruptedException e) {
            // Handle interruptions gracefully
            e.printStackTrace();
        }

        // Complete the stream
        responseObserver.onCompleted();
        System.out.println(LocalTime.now() + ": ✅ Finished streaming lecture recording.");
    }
}
