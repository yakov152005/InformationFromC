public abstract class Person {
    private String firstName;
    private String lastName;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String getFullName () {
        return this.firstName + " " + this.lastName;
    }

    public String toString () {
        return "Name: " + this.getFullName();
    }

    public boolean matchesFirstName (String text) {
        return this.firstName.contains(text);
    }
}
