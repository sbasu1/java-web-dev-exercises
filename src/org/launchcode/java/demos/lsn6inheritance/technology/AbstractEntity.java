package org.launchcode.java.demos.lsn6inheritance.technology;

public abstract class AbstractEntity {
    private int id;

    public AbstractEntity(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
