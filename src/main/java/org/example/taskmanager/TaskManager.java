package org.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager{
    public static void main(String[] args) {
        Category work = new Category("Work");
        Category personal = new Category("Personal");

        List<Task> allTasks = new ArrayList<>();

        System.out.println("Adding tasks to the 'Work' category:");
        Task task1 = TaskInput.getInput();
        work.aT(task1);
        allTasks.add(task1);

        Task task2 = TaskInput.getInput();
        work.aT(task2);
        allTasks.add(task2);

        System.out.println("Adding tasks to the 'Personal' category:");
        Task task3 = TaskInput.getInput();
        personal.aT(task3);
        allTasks.add(task3);

        Task task4 = TaskInput.getInput();
        personal.aT(task4);
        allTasks.add(task4);

        System.out.println("\nWork Category:\n" + work);
        System.out.println("Personal Category:\n" + personal);

        System.out.println("\nGenerated Task Report:\n" + TaskReportGenerator.generateReport(allTasks));
    }
}


