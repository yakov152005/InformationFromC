public class Lecturer extends Person{
    private int seniority;

    public Lecturer (String firstName, String lastName, int seniority) {
        super(firstName, lastName);
        this.seniority = seniority;
    }

    public String toString () {
        return super.toString() + "\nSeniority: " + this.seniority;
    }
}
