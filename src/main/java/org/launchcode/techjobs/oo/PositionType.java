package org.launchcode.techjobs.oo;

import javax.swing.text.Position;

public class PositionType extends JobField {

    // Constructors
    public PositionType() {
        // The constructor of the superclass (JobField) will automatically handle id and nextId
    }

    public PositionType(String value) {
        super(value); // Call the constructor of the superclass (JobField) with the provided value
    }

    // Custom toString, equals, and hashCode methods:
    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return super.getValue(); // Use the inherited getValue() method from JobField
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public int hashCode() {
        return super.getId(); // Use the inherited getId() method from JobField
    }

    @Override
    public boolean equals(Object toBeCompared) {
        return super.equals(toBeCompared); // Use the inherited equals() method from JobField
    }

    // Getters and Setters:
    // No need to redefine these methods, as they are inherited from JobField

    // TODO: Add any additional methods specific to the PositionType class if needed
}