/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smarteducationproject;

import io.grpc.ManagedChannel;
import generated.education.attendance.*;
import generated.lecture.stream.*;
import generated.environment.monitor.*;
/**
 *
 * @author charles
 */

public class SmartEducationClientLogic {

    // Stubs for interacting with services
    private final AttendanceServiceGrpc.AttendanceServiceBlockingStub attendanceStub;
    private final LectureStreamServiceGrpc.LectureStreamServiceBlockingStub lectureStub;
    private final EnvironmentMonitorServiceGrpc.EnvironmentMonitorServiceBlockingStub environmentStub;

    public SmartEducationClientLogic(ManagedChannel attendanceChannel, ManagedChannel lectureChannel, ManagedChannel environmentChannel) {
        // Initialize stubs with channels
        attendanceStub = AttendanceServiceGrpc.newBlockingStub(attendanceChannel);
        lectureStub = LectureStreamServiceGrpc.newBlockingStub(lectureChannel);
        environmentStub = EnvironmentMonitorServiceGrpc.newBlockingStub(environmentChannel);
    }

    public String markSingleAttendance(String studentId, String classId, String timestamp) {
        // Build and send attendance request
        AttendanceRequest request = AttendanceRequest.newBuilder()
                .setStudentId(studentId)
                .setClassId(classId)
                .setTimestamp(timestamp)
                .build();
        AttendanceReply reply = attendanceStub.markAttendance(request);

        return reply.getMessage();
    }

    public StreamReply startLectureStream(String courseId, String instructor) {
        // Start lecture stream
        StreamStartRequest request = StreamStartRequest.newBuilder()
                .setCourseId(courseId)
                .setInstructor(instructor)
                .build();
        return lectureStub.startStreaming(request);
    }

    public EnvironmentStatus getEnvironmentStatus(float temperature, float lightLevel, String timestamp) {
        // Get environment status
        SensorData data = SensorData.newBuilder()
                .setTemperature(temperature)
                .setLightLevel(lightLevel)
                .setTimestamp(timestamp)
                .build();
        return environmentStub.getEnvironmentStatus(data);
    }
}
