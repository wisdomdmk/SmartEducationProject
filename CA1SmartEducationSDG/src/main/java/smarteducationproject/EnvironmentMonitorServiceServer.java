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
import java.util.ArrayList;
import java.util.List;

// Import generated gRPC classes
import generated.environment.monitor.EnvironmentMonitorServiceGrpc.EnvironmentMonitorServiceImplBase;
import generated.environment.monitor.SensorData;
import generated.environment.monitor.AdjustmentCommand;
import generated.environment.monitor.EnvironmentStatus;

/**
 * EnvironmentMonitorServiceServer simulates a smart classroom monitoring system
 * It supports:
 * - Bidirectional streaming RPC: MonitorEnvironment
 * - Unary RPC: GetEnvironmentStatus
 */
public class EnvironmentMonitorServiceServer extends EnvironmentMonitorServiceImplBase {

    public static void main(String[] args) {
        EnvironmentMonitorServiceServer server = new EnvironmentMonitorServiceServer();
        int port = 50053;

        try {
            // Build and launch the gRPC server
            Server grpcServer = ServerBuilder.forPort(port)
                    .addService(server)
                    .build()
                    .start();

            System.out.println(LocalTime.now() + " ✅ Environment Monitor Server started on port " + port);
            grpcServer.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    // === Unary RPC: Evaluates current environment and provides summary/suggestions ===
    @Override
    public void getEnvironmentStatus(SensorData request, StreamObserver<EnvironmentStatus> responseObserver) {
        float temp = request.getTemperature();
        float light = request.getLightLevel();
        String timestamp = request.getTimestamp();

        System.out.println(LocalTime.now() + " 📡 [Unary] Sensor Data Received - Temp: " + temp + "°C, Light: " + light + "lm at " + timestamp);

        // Generate evaluation and suggestions
        String summary = "";
        List<String> suggestions = new ArrayList<>();

        if (temp > 28) {
            summary += "Too hot. ";
            suggestions.add("Turn on Air Conditioner");
        } else if (temp < 18) {
            summary += "Too cold. ";
            suggestions.add("Turn on Heater");
        } else {
            summary += "Temperature is okay. ";
        }

        if (light < 300) {
            summary += "Light is low.";
            suggestions.add("Turn on Lights");
        } else if (light > 800) {
            summary += "Light is too bright.";
            suggestions.add("Dim the Lights");
        } else {
            summary += "Light is sufficient.";
        }

        // Build response message
        EnvironmentStatus response = EnvironmentStatus.newBuilder()
                .setSummary(summary)
                .addAllSuggestions(suggestions)
                .build();

        // Send response back
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    // === Bi-directional streaming RPC: Sensors continuously send data, server continuously sends adjustment commands ===
    @Override
    public StreamObserver<SensorData> monitorEnvironment(StreamObserver<AdjustmentCommand> responseObserver) {

        return new StreamObserverImpl(responseObserver);
    }

    private static class StreamObserverImpl implements StreamObserver<SensorData> {

        private final StreamObserver<AdjustmentCommand> responseObserver;

        public StreamObserverImpl(StreamObserver<AdjustmentCommand> responseObserver) {
            this.responseObserver = responseObserver;
        }

        @Override
        public void onNext(SensorData data) {
            float temperature = data.getTemperature();
            float light = data.getLightLevel();
            String time = data.getTimestamp();
            
            System.out.println(LocalTime.now() + " 🔁 [Stream] Received sensor data at " + time +
                    " -> Temp: " + temperature + "°C, Light: " + light + "lm");
            
            // Decision logic based on thresholds
            String action = "";
            String device = "";
            
            if (temperature > 28) {
                action = "Turn on AC";
                device = "ACUnit1";
            } else if (temperature < 18) {
                action = "Turn on Heater";
                device = "HeaterUnit1";
            } else if (light < 300) {
                action = "Turn on Lights";
                device = "LightUnit1";
            } else if (light > 800) {
                action = "Dim Lights";
                device = "LightUnit1";
            } else {
                action = "No action needed";
                device = "System";
            }
            
            // Build the adjustment command
            AdjustmentCommand command = AdjustmentCommand.newBuilder()
                    .setAction(action)
                    .setTargetDevice(device)
                    .build();
            
            // Send command back to the sensor
            responseObserver.onNext(command);
            
            System.out.println(LocalTime.now() + " 🚀 [Response] Sent command: " + action + " to " + device);
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("❌ Error in sensor stream: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            // End the response stream
            responseObserver.onCompleted();
            System.out.println(LocalTime.now() + " 🛑 Streaming session closed by client.");
        }
    }
}

