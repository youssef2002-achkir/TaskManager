package org.example.taskmanager;

import java.util.Scanner;

public class TaskInput {
    public static Task getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task name:");
        String name = scanner.nextLine();

        System.out.println("Enter task description:");
        String description = scanner.nextLine();

        return new Task(name, description);
    }
}
