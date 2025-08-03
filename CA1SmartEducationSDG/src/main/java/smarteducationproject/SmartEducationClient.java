/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarteducationproject;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SmartEducationClient {

    public static void main(String[] args) {
        // Initialize channels to communicate with gRPC services
        ManagedChannel attendanceChannel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        ManagedChannel lectureChannel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();
        ManagedChannel environmentChannel = ManagedChannelBuilder.forAddress("localhost", 50053)
                .usePlaintext()
                .build();

        // Instantiate client logic class to handle interactions
        SmartEducationClientLogic logic = new SmartEducationClientLogic(attendanceChannel, lectureChannel, environmentChannel);

        // Invoke client GUI
        SmartEducationGUI gui = new SmartEducationGUI(logic);
        gui.setVisible(true);
    }
}
