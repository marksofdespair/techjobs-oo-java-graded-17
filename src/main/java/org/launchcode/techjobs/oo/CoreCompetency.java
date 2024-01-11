package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    // Constructors
    public CoreCompetency() {
        // inherited
    }

    public CoreCompetency(String value) {
        super(value); // Call the constructor of the superclass (JobField) with the provided value
    }

    // Custom toString, equals, and hashCode methods:
    // inherited

    // Getter for 'id' (Setter handled by the superclass)
    public int getId() {
        return super.getId();
    }

    // Getter and setter for 'value'
    public String getValue() {
        return super.getValue();
    }

    public void setValue(String value) {
        super.setValue(value);
    }

    // You can add additional methods specific to the CoreCompetency class if needed
}

