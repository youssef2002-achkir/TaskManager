package org.example.taskmanager;

import java.util.List;
public class TaskReportGenerator {
        public static String generateReport(List<Task> tasks) {
            StringBuilder report = new StringBuilder("Task Report:\n");

            for (Task task : tasks) {
                report.append("Task Name: ").append(task.n).append("\nTask Description: ").append(task.d).append("\n---\n");
            }

            return report.toString();
        }
    }



