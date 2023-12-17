package org.example.taskmanager;

public class TaskValidator {
    public static boolean isValid(Task task) {
        return task != null && task.n != null && !task.n.isEmpty();
    }
}

