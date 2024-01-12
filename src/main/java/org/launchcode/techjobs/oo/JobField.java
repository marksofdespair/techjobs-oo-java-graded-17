package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    public String value;
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
    @Override
    public String toString() { // override default
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects w/ same id ==.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() { // override default
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

// Fields in common: 3
// Constructors: 2
// Get/Set: 2/1
// Custom Meths: 3
// Maybe I should stop short-handing method :T

