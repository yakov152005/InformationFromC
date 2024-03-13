public class Student extends Person {
    private int number;

    public Student (String firstName, String lastName, int number) {
        super(firstName, lastName);
        this.number = number;
    }

    public String toString () {
        return super.toString() + "\nCard number: " + this.number;
    }


}
