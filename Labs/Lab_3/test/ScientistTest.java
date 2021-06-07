import org.junit.Test;

import static org.junit.Assert.*;

public class ScientistTest {
    Scientist obj1 = new Scientist("bob", 34, "777777", "fish");
    Scientist obj2 = new Scientist("bob", 34, "777777", "fish", "Lab");

    @Test
    public void setSpecialty() {
        obj1.setSpecialty("CS");
        assertEquals("CS",obj1.getSpecialty());
        assertNotEquals("CS",obj2.getSpecialty());
    }

    @Test (expected = IllegalArgumentException.class)
    public void setSpecialtyException() throws IllegalArgumentException {
        obj1.setSpecialty("");
        obj2.setSpecialty("");
    }

    @Test
    public void getSpecialty() {
        obj1.setSpecialty("Biology");
        assertEquals("Biology", obj1.getSpecialty());
        assertEquals("Lab", obj2.getSpecialty());
    }

    @Test (expected = IllegalArgumentException.class)
    public void ConstructorException() throws IllegalArgumentException{
        obj1.setSpecialty("");
    }
    @Test
    public void testToString() {
        obj1.setSpecialty("Chemistry");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }

    @Test
    public void testInheritedMethod() {
        obj1.setAge(34);
        assertEquals(34, obj1.getAge());
    }

    /**
     * supposed to fail, comparison failure
     */
    @Test
    public void failedTest() {
        obj1.setSpecialty("Lab");
        assertEquals("Chemistry", obj1.getSpecialty());
    }
}