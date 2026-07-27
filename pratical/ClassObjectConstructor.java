class Student {
    private String name;
    private int lcid;
    private int year;
    private double gpa;

    Student() {
        name = "Not Assigned";
        lcid = 0;
        year = 0;
        gpa = 0.0;
    }

    Student(String name, int lcid, int year, double gpa) {
        this.name = name;
        this.lcid = lcid;
        this.year = year;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getLcid() {
        return lcid;
    }

    public int getYear() {
        return year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLcid(int lcid) {
        this.lcid = lcid;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("LCID : " + lcid);
        System.out.println("Year : " + year);
        System.out.println("GPA  : " + gpa);
        System.out.println("------------------------------");
    }
}

public class ClassObjectConstructor {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Aryan Thapa", 1001, 1, 3.80);
        students[1] = new Student("Hermit Shrestha", 1002, 2, 3.60);
        students[2] = new Student("Sushan Karki", 1003, 3, 3.75);
        students[3] = new Student("Kashib Pradhan", 1004, 2, 3.45);
        students[4] = new Student();
        students[4].setName("Ankit Chaudhary");
        students[4].setLcid(1005);
        students[4].setYear(1);
        students[4].setGpa(3.95);
        System.out.println("Student Records");
        System.out.println("---------------------------------");
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}