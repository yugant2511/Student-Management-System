import java.util.ArrayList;
import java.util.Scanner;

public class StudentInformationSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Add Student
    public static void addStudent() {

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();

        Student s = new Student(name, age, grade, id, contact);
        students.add(s);

        System.out.println("Student Added Successfully!");
    }

    // View Students
    public static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        System.out.printf(
            "%-10s %-15s %-5s %-8s %-15s\n",
            "ID", "Name", "Age", "Grade", "Contact"
        );
        System.out.println("----------------------------------------------------");

        for (Student s : students) {
            s.display();
        }
    }

    // Search Student
    public static void searchStudent() {

        System.out.print("Search by (1) ID or (2) Name: ");
        int ch = Integer.parseInt(sc.nextLine());

        if (ch == 1) {
            System.out.print("Enter Student ID: ");
            String id = sc.nextLine();

            for (Student s : students) {
                if (s.getStudentID().equalsIgnoreCase(id)) {
                    printSingleStudent(s);
                    return;
                }
            }
            System.out.println("Student not found.");

        } else if (ch == 2) {
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            for (Student s : students) {
                if (s.getName().equalsIgnoreCase(name)) {
                    printSingleStudent(s);
                    return;
                }
            }
            System.out.println("Student not found.");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Update Student
    public static void updateStudent() {

        System.out.print("Enter Student ID to update: ");
        String id = sc.nextLine();

        for (Student s : students) {
            if (s.getStudentID().equalsIgnoreCase(id)) {

                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());

                System.out.print("Enter new Age: ");
                s.setAge(Integer.parseInt(sc.nextLine()));

                System.out.print("Enter new Grade: ");
                s.setGrade(sc.nextLine());

                System.out.print("Enter new Contact: ");
                s.setContact(sc.nextLine());

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found.");
    }

    // Helper method
    private static void printSingleStudent(Student s) {
        System.out.println("Student Found:");
        System.out.printf(
            "%-10s %-15s %-5s %-8s %-15s\n",
            "ID", "Name", "Age", "Grade", "Contact"
        );
        s.display();
    }
}
