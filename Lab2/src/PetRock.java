public class PetRock {
    private String name;
    public int children;

    private boolean happy = false;

    public PetRock(String name, int children) {
        if (name.isEmpty()) {
            throw new IllegalStateException();
        }
        this.name = name;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }

    public String getHappyMessage() throws IllegalStateException {
        if (!happy) {
            throw new IllegalStateException();
        }
        return "I'm happy!";
    }

    public String getChildren() {
        return name + "has" + children + "children";
    }

   // get children number only
    public int children() {
        return children;
    }

    @Override
    public String toString() {
        return "PetRock Stats:" +
                "name='" + name + '\'' +
                ", children=" + children +
                ", happy=" + happy ;
    }
}
