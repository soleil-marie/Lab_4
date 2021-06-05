import org.junit.Test;

import static org.junit.Assert.*;
// note: took out all the "throws Exception" that person had in the video b/c java complained w/ yellow
// warnings

// can define up here instead of in every test
public class PetRockTest {
    private PetRock rocky = new PetRock("Rocky",5);
    private PetRock rockela = new PetRock("rockela",8);

    @Test
    public void getName() {
        assertEquals("Rocky", rocky.getName());

    }

    @Test
    public void testUnhappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    // test involving unhappy exception
    @Test (expected = IllegalStateException.class)
    public void happyFail() {
        rocky.getHappyMessage();
    }

    @Test
    public void happyMessage() {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy!", msg);
    }

    // other test involving exceptions
    @Test (expected = IllegalStateException.class)
    public void nameEmpty() {
        PetRock empty = new PetRock("", 0);

    }
    @Test
    public void testChildrenString() {
        PetRock rockela = new PetRock("rockela",8);
        rockela.getChildren();
    }

    @Test
    public void testChildrenNumber() {
        PetRock rockela = new PetRock("rockela",8);
        assertEquals(8, rockela.children());
        assertEquals(5, rocky.children());
    }

    // test on assertFalse, wait how does it compare a str message to boolean??
    @Test
    public void testAssertFalse() {
        assertFalse("rocky is happy", rocky.isHappy());
    }

    @Test
    public void toStringTest() {
        System.out.println(rocky.toString());
        System.out.println(rockela.toString());
    }
}