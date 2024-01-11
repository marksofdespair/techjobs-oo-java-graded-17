package org.launchcode.techjobs.oo;
import org.junit.Test; //added import state
import static org.junit.Assert.*; //added import state
import javax.naming.Name; //added import state

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

        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Software Developer", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));
        Job job2 = new Job("Software Developer", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));

        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Software Developer", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));

        String jobString = job1.toString();

        assertEquals(System.lineSeparator(), jobString.substring(0, System.lineSeparator().length())); // Check for leading new line
        assertEquals(System.lineSeparator(), jobString.substring(jobString.length() - System.lineSeparator().length())); // Check for trailing new line
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Software Developer", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));

        String jobString = job.toString();

        // Check if the labels and data are present in the string
        assertTrue(jobString.contains("ID: " + job.getId()));
        assertTrue(jobString.contains("Name: " + job.getName()));
        assertTrue(jobString.contains("Employer: " + job.getEmployer()));
        assertTrue(jobString.contains("Location: " + job.getLocation()));
        assertTrue(jobString.contains("Position Type: " + job.getPositionType()));
        assertTrue(jobString.contains("Core Competency: " + job.getCoreCompetency()));
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("TechCo"), new Location("City"), new PositionType("Full-time"), new CoreCompetency("Java"));

        String jobString = job.toString();

        assertTrue(jobString.contains("Name: Data not available")); // Check if Name is empty
        assertFalse(jobString.contains("Employer: Data not available")); // Check if Employer is not empty
        assertFalse(jobString.contains("Location: Data not available")); // Check if Location is not empty
        assertFalse(jobString.contains("Position Type: Data not available")); // Check if Position Type is not empty
        assertFalse(jobString.contains("Core Competency: Data not available")); // Check if Core Competency is not empty
    }

}
