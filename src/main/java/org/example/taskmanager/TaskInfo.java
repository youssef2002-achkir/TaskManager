package org.example.taskmanager;

public class TaskInfo {
    public static String getInfo(Task task) {
        return "Task Info:\nName: " + task.n + "\nDescription: " + task.d + "\nCompleted: " + task.c;
    }
}
