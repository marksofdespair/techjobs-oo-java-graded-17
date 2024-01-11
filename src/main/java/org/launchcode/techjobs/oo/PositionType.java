package org.launchcode.techjobs.oo;

import javax.swing.text.Position;

public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() { // returns the value of PositionType objects
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public int hashCode() { // adds hashCode meth
        return (id);
    }

    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared)
            return true;
        if (toBeCompared == null || getClass() != toBeCompared.getClass())
            return false;
        PositionType otherPositionType = (PositionType) toBeCompared;
        return id == otherPositionType.id();
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
