package org.launchcode.techjobs.oo;

import java.util.Objects;

// Fields in common: 3
// Cosntructors: 2
// Get/Set: 2/1
// Custom Meths: 3
// Maybe I should stop short-handing method :T


public abstract class JobField {
    // fields
    private int id;
    private static int nextId = 1;
    private String value;
    // constructors
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    // Getters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
    // Setters
    public void setValue(String value) {
        this.value = value;
    }

    // toString
    @Override
    public String toString() {
        return value;
    }

    // equals meth
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return getId() == jobField.getId();
    }

    // hashCode meth
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}