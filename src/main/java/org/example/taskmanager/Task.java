package org.example.taskmanager;

public class Task {
    public String n;
    public String d;
    public boolean c;

    public Task(String name, String description) {
        n = name;
        d = description;
        c = false;
    }

    public String gN() {
        return n;
    }

    public String gD() {
        return d;
    }

    public boolean gC() {
        return c;
    }

    public void mAC() {
        c = true;
    }
}
