public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== Student Information System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(StudentInformationSystem.sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid Input! Enter number only.");
                continue;
            }

            switch (choice) {
                case 1:
                    StudentInformationSystem.addStudent();
                    break;
                case 2:
                    StudentInformationSystem.viewStudents();
                    break;
                case 3:
                    StudentInformationSystem.searchStudent();
                    break;
                case 4:
                    StudentInformationSystem.updateStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
