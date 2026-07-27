class Person {
    protected String name;
    protected String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
    }
}

class Student extends Person {
    private int lcid;
    private double gpa;
    Student(String name, String email, int lcid, double gpa) {
        super(name, email);      // Calling Parent Constructor
        this.lcid = lcid;
        this.gpa = gpa;
    }
    @Override
    void displayInfo() {
        System.out.println("Student Information");
        System.out.println("--------------------------");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("LCID : " + lcid);
        System.out.println("GPA : " + gpa);
    }
}

class Lecturer extends Person {
    private String department;
    private String subject;
    Lecturer(String name, String email, String department, String subject) {
        super(name, email);      // Calling Parent Constructor
        this.department = department;
        this.subject = subject;
    }
    @Override
    void displayInfo() {
        System.out.println("Lecturer Information");
        System.out.println("--------------------------");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Department : " + department);
        System.out.println("Subject : " + subject);
    }
}
public class inheritanceMethodoverriding {
        public static void main(String[] args) {
        Student s1 = new Student(
                "Aryan Thapa",
                "aryanthapa@gmail.com",
                230101,
                3.85);
        Lecturer l1 = new Lecturer(
                "Rohit Sharma",
                "sharmarohit@gmail.com",
                "Computer Science",
                "Java Programming");
        s1.displayInfo();
        System.out.println();
        l1.displayInfo();
    }
}
