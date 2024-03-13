public class HeadOfDepartment extends Lecturer {
    private String expertise;
    private String degree;

    public HeadOfDepartment(String firstName, String lastName, int seniority,
                            String expertise, String degree) {
        super(firstName, lastName, seniority);
        this.expertise = expertise;
        this.degree = degree;
    }

    public String toString() {
        return super.toString() + "\nExpertise: " + this.expertise
                + "\nDegree: " + this.degree;
    }
}
