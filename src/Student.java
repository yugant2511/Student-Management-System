public class Student {

    private String name;
    private int age;
    private String grade;
    private String studentID;
    private String contact;

    // constructor
    public Student(String name, int age, String grade, String studentID, String contact) {
        this.name = name;
        setAge(age);
        this.grade = grade;
        this.studentID = studentID;
        this.contact = contact;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getContact() {
        return contact;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else
            System.out.println("Age must be positive number");
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void display() {
        System.out.printf(
            "%-10s %-15s %-5d %-8s %-15s\n",
            studentID, name, age, grade, contact
        );
    }
}
