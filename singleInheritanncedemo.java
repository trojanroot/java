class person {
    String name;
    int age;

    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class children extends person {
    int rollno;

    children(String name, int age, int rollno) {
        super(name, age);
        this.rollno = rollno;
    }

    void displaychildren() {
        displayPerson();
        System.out.println("Rollno: " + rollno);
    }
}

public class singleInheritanncedemo {
    public static void main(String[] args) {
        children s1 = new children("Aryan", 19, 10);
        System.out.println("Student Details:");
        s1.displaychildren();
    }
}
