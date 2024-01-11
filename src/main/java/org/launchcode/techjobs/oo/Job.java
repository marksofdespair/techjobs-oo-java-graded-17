package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField{
    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() { // Constructor initializes ID field w/ unique value
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Constructor takes 5 parameters to assign their values.
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }   // MAKE SURE ITS IN ORDER COME BACK HERE IF U HAVE ISSUES LATER 5HEAD SEE TASK3
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override // generated hashCode Override
    public int hashCode() {
        return (id);
    }

    @Override
    public boolean equals(Object toBeCompared1) { // generated equals Override I edited appropriately
        if (this == toBeCompared1)
            return true;
        if (toBeCompared1 == null || getClass() != toBeCompared1.getClass())
            return false;
        Job otherJob = (Job) toBeCompared1;

        return id == otherJob.id;
    }

    @Override
    public String toString() {
        return System.lineSeparator() +
                "ID: " + getId() + System.lineSeparator() +
                "Name: " + getFieldValueOrNotAvailable(getName()) + System.lineSeparator() +
                "Employer: " + getFieldValueOrNotAvailable(getEmployer().getValue()) + System.lineSeparator() +
                "Location: " + getFieldValueOrNotAvailable(getLocation().getValue()) + System.lineSeparator() +
                "Position Type: " + getFieldValueOrNotAvailable(getPositionType().getValue()) + System.lineSeparator() +
                "Core Competency: " + getFieldValueOrNotAvailable(getCoreCompetency().getValue()) + System.lineSeparator();
    }

    private String getFieldValueOrNotAvailable(String field) {
        if (field == null || field.trim().isEmpty()) {
            return "Data not available";
        }
        return field;
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}