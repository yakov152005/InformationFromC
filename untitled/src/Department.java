import java.util.Scanner;

public class Department {
    private String name;
    private HeadOfDepartment headOfDepartment;
    private Lecturer[] lecturers;
    private Course[] courses;

    public Department (String name, HeadOfDepartment headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
        this.lecturers = new Lecturer[0];
        this.courses = new Course[0];
        this.name = name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void addCourse () {
        if (this.lecturers.length == 0) {
            System.out.println("You cannot create a course " +
                    "since there are no lecturers available");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the course name: ");
            String courseName = scanner.nextLine();
            Lecturer lecturer = null;
            if (this.lecturers.length == 1) {
                lecturer = this.lecturers[0];
            } else {
                for (int i = 0; i < this.lecturers.length; i++) {
                    System.out.println((i + 1) + ". " + this.lecturers[i]);
                }
                System.out.println("Choose an index: ");
                int index = scanner.nextInt();
                lecturer = this.lecturers[index - 1];
            }
            Course course = new Course(courseName, lecturer);
            Course[] temp = new Course[this.courses.length + 1];
            for (int i = 0; i < this.courses.length; i++) {
                temp[i] = this.courses[i];
            }
            temp[temp.length - 1] = course;
            this.courses = temp;

        }
    }

    public void addLecturer () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lecturer first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the lecturer last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the seniority: ");
        int seniority = new Scanner(System.in).nextInt();
        Lecturer lecturer = new Lecturer(firstName, lastName, seniority);
        Lecturer[] temp = new Lecturer[this.lecturers.length + 1];
        for (int i = 0; i < this.lecturers.length; i++) {
            temp[i] = this.lecturers[i];
        }
        temp[temp.length - 1] = lecturer;
        this.lecturers = temp;
    }

    public String toString () {
        String output = "Name: " + this.name;
        output += "\nLecturers: ";
        for (int i = 0; i < this.lecturers.length; i++) {
            output += "\n" + this.lecturers[i];
        }
        output += "\n\n\nCourses: ";
        output += this.getCourses();
        return output;
    }

    public String getCourses () {
        String output = "";
        for (int i = 0; i < this.courses.length; i++) {
            output += "\n" + this.courses[i];
        }
        return output;
    }

    public Course getCourseByIndex (int index) {
        return this.courses[index];
    }

    public Student[] search (String text) {
        int countResults = 0;
        for (int i = 0; i < this.courses.length; i++) {
            countResults += this.courses[i].countResults(text);
        }
        System.out.println(countResults);
        return null;
    }
}
