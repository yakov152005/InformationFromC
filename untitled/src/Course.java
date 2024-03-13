public class Course {
    private String name;
    private Lecturer lecturer;
    private Student[] students;

    public Course (String name, Lecturer lecturer) {
        this.name = name;
        this.lecturer = lecturer;
        this.students = new Student[0];
    }

    public void setLecturer (Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void addStudent (Student student) {
        Student[] temp = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            temp[i] = this.students[i];
        }
        temp[temp.length - 1] = student;
        this.students = temp;
    }

    public String toString () {
        String output = "Course name: " + this.name
                +"\nLecturer details: " + this.lecturer
                + "\nStudents list: ";
        for (int i = 0; i < this.students.length; i++) {
            output += "\n" + (i + 1) + "-" + this.students[i];
        }
        return output;
    }

    public int countResults (String text) {
        int count = 0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].matchesFirstName(text)) {
                count++;
            }
        }
        return count;
    }
}
