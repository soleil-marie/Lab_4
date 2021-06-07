
import org.junit.Test;

import static org.junit.Assert.*;

public class CSuiteManagerTest {
    CSuiteManager thing1 = new CSuiteManager("Francine", 277,"000298","thing",5,
            "Manager of Stuff");
    CSuiteManager thing2 = new CSuiteManager("Glorg", 30,"000298","thing",90,
            "People Watcher", 50,3.00 );

    @Test
    public void getAllOptionsPrice() {
        assertEquals(150, thing2.getAllOptionsPrice(), 0);
    }

    @Test
    public void setStockOptions() {
        thing1.setStockOptions(20);
        assertTrue(thing1.getStockOptions() == 20);
    }

    @Test (expected = IllegalArgumentException.class)
    public void setStockOptionsException() throws IllegalArgumentException {
        thing1.setStockOptions(-2);
    }

    @Test
    public void getCapitalGains() {
        assertEquals(-50, thing2.getCapitalGains(2.00), 0);
    }

    @Test
    public void testToString() {
        System.out.println(thing1.toString());
        System.out.println(thing2.toString());
        assertEquals("Position: CSuite Manager\n" +
                " Name: Francine\n" +
                "Fancy Title: Manager of Stuff\n", thing1.toString());
        assertEquals("Position: CSuite Manager\n" +
                " Name: Glorg\n" +
                "Fancy Title: People Watcher\n", thing2.toString());
    }

    @Test
    public void testGetNumSubordinates() {
       assertEquals(5,thing1.getNumSubordinates());
    }

}