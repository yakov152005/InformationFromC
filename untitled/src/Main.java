import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HeadOfDepartment headOfDepartment = new HeadOfDepartment("Menachem",
                "Domb", 30, "Communication", "Prof");
        Department department = new Department("CS", headOfDepartment);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("0 - Print");
            System.out.println("1 - Change Name: ");
            System.out.println("2 - Add lecturer: ");
            System.out.println("3 - Add Course: ");
            System.out.println("4 - Choose a course: ");
            System.out.println("5 - Search a student: ");
            System.out.println("6 - Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println(department);
                }
                case 1 -> {
                    System.out.println("Choose a name: ");
                    String name = new Scanner(System.in).nextLine();
                    department.setName(name);
                }
                case 2 -> {
                    department.addLecturer();
                }
                case 3 -> {
                    department.addCourse();
                }
                case 5 -> {
                    String textToSearch = new Scanner(System.in).nextLine();
                    department.search(textToSearch);
                }
                 case 4 -> {
                     System.out.println(department.getCourses());
                     System.out.println("Choose a course: ");
                     choice = new Scanner(System.in).nextInt();
                     Course course = department.getCourseByIndex(choice);
                     boolean stop = false;
                    while (!stop) {
                        System.out.println("1 - Print");
                        System.out.println("2 - Change name");
                        System.out.println("3 - Add Student ");
                        System.out.println("4 - Back");
                        choice = new Scanner(System.in).nextInt();
                        switch (choice) {
                            case 4 -> {
                                stop = true;
                            }
                            case 1 -> {
                                System.out.println(course);
                            }
                            case 2 -> {
//                                course.setName()

                            }
                            case 3 -> {
                                System.out.println("Enter first name: ");
                                String firstName = new Scanner(System.in).nextLine();
                                System.out.println("Enter last name: ");
                                String lastName = new Scanner(System.in).nextLine();
                                Student student = new Student(firstName, lastName, 1353);
                                course.addStudent(student);
                            }

                        }
                    }
                 }
            }

        }

    }
}
