package org.example.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class Category {
    public String n;
    public List<Task> t;

    public Category(String name) {
        n = name;
        t = new ArrayList<>();
    }

    public String gN() {
        return n;
    }

    public List<Task> gT() {
        return t;
    }

    public void aT(Task task) {
        t.add(task);
    }
}
