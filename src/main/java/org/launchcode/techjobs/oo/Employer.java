package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer() {
    }

    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:
    // inherited

    // Getters and Setters:
    // inherited

    public void setValue(String value) {
        this.value = value;
    }

}
