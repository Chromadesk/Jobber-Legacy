package org.jobber.models;

public abstract class DataInstance {
    private static int nextId;
    private final int id;

    public DataInstance() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
