package org.launchcode.techjobs.oo;


import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotNull(job1.getName());
        assertNotNull(job1.getEmployer());
        assertNotNull(job1.getLocation());
        assertNotNull(job1.getPositionType());
        assertNotNull(job1.getCoreCompetency());
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(job1, job2);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job1.toString();

        assertTrue(jobString.startsWith(System.lineSeparator())); // Check for leading new line
        assertTrue(jobString.endsWith(System.lineSeparator())); // Check for trailing new line
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job.toString();

        // Check if labels / data are present in string
        assertTrue(jobString.contains("ID: " + job.getId()));
        assertTrue(jobString.contains("Name: " + job.getName()));
        assertTrue(jobString.contains("Employer: " + job.getEmployer()));
        assertTrue(jobString.contains("Location: " + job.getLocation()));
        assertTrue(jobString.contains("Position Type: " + job.getPositionType()));
        assertTrue(jobString.contains("Core Competency: " + job.getCoreCompetency()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job.toString();

        assertTrue(jobString.contains("Name: Data not available")); // Checks if Name empty
        assertFalse(jobString.contains("Employer: Data not available")); // Checks if Employer is NOT empty
        assertFalse(jobString.contains("Location: Data not available")); // Checks if Location is NOT empty
        assertFalse(jobString.contains("Position Type: Data not available")); // Checks if Position Type is NOT empty
        assertFalse(jobString.contains("Core Competency: Data not available")); // Checks if Core Competency is NOT empty
    }

}