public class Scientist extends Person
{
    private String specialty;

    /**
     * Constructor 1 for Scientist.
     * @param name String
     * @param age int
     * @param SSN String
     * @param passwd String
     */
    public Scientist(String name, int age, String SSN, String passwd) {
        super(name, age, SSN, passwd);
        this.specialty = "Computer Science";

    }

    /**
     * Constructor 2 for scientist
     * @param name string
     * @param age int
     * @param SSN String
     * @param passwd String
     * @param specialty String
     * @throws IllegalArgumentException
     */
    public Scientist(String name, int age, String SSN, String passwd, String specialty) throws IllegalStateException {
        super(name, age, SSN, passwd);
        if (specialty.equals("")) {
            throw new IllegalArgumentException();
        }
        this.specialty = specialty;
    }

    public void setSpecialty(String specialty) throws IllegalArgumentException {
        if (specialty.equals("")) {
            throw new IllegalArgumentException ();
        }
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    @Override
    public String toString() {
        return "Scientist{" +
                "Specialty='" + specialty + '\'' +
                '}';
    }
}
