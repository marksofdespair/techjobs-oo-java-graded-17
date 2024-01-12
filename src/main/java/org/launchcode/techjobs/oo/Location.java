package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {

    // Constructors
    public Location() {
        // inherited
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field.
    // The constructor should also call the empty constructor in order to initialize the 'id' field.
    public Location(String value) {
        this(); // Call the empty constructor to initialize the 'id' field
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:
    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Location objects "equal" when
    //  their id fields match.
    @Override
    public int hashCode() {
        return super.getId(); // Inherited getId() method from JobField
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); // Inherited equals() method from JobField
    }

    // Getters and Setters:
    // Inherited

    // TODO: Add any additional methods specific to the Location class if needed
}