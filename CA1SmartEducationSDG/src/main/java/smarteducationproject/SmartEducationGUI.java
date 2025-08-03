/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package smarteducationproject;

import generated.environment.monitor.EnvironmentStatus;
import generated.lecture.stream.StreamReply;
import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
/*
 * SmartEducationGUI.java
 *
 * This Java Swing class implements a user interface for interacting with three gRPC services:
 * AttendanceService, LectureStreamService, and EnvironmentMonitorService.
 * 
 */

public class SmartEducationGUI extends JFrame {

    private final SmartEducationClientLogic logic;

    private JTextArea logArea;

    public SmartEducationGUI(SmartEducationClientLogic logic) {
        this.logic = logic;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Smart Education GUI");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        // Attendance tab
        JPanel attendancePanel = new JPanel();
        JButton markAttendanceButton = new JButton("Mark Attendance");
        markAttendanceButton.addActionListener(e -> markAttendance());
        attendancePanel.add(markAttendanceButton);

        // Lecture tab
        JPanel lecturePanel = new JPanel();
        JButton startLectureButton = new JButton("Start Lecture");
        startLectureButton.addActionListener(e -> startLectureStream());
        lecturePanel.add(startLectureButton);

        // Environment tab
        JPanel environmentPanel = new JPanel();
        JButton environmentStatusButton = new JButton("Check Environment");
        environmentStatusButton.addActionListener(e -> checkEnvironmentStatus());
        environmentPanel.add(environmentStatusButton);

        // Log area for displaying feedback
        logArea = new JTextArea(15, 70);
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);

        tabs.add("Attendance", attendancePanel);
        tabs.add("Lecture", lecturePanel);
        tabs.add("Environment", environmentPanel);

        // Layout setup
        setLayout(new BorderLayout());
        add(tabs, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void markAttendance() {
        String response = logic.markSingleAttendance("x23410345", "HDCSDEVINTJAN25I", LocalDateTime.now().toString());
        logArea.append(response + "\n");
    }

    private void startLectureStream() {
        StreamReply response = logic.startLectureStream("DS801", "Dr. Trina");
        logArea.append("Lecture Stream URL: " + response.getStreamUrl() + "\nStatus: " + response.getStatus() + "\n");
    }

    private void checkEnvironmentStatus() {
        EnvironmentStatus status = logic.getEnvironmentStatus(25.0f, 300.0f, LocalDateTime.now().toString());
        logArea.append("Environment: " + status.getSummary() + "\nSuggestions: " + status.getSuggestionsList() + "\n");
    }
}
