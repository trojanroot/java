class Student {
    int id;
    String name;

    Student(int id, String name) //constructor
    {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("id= " + id);
        System.out.println("Name= " + name);
    }
}

public class objectConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aryan");
        Student s2 = new Student(2, "Hermit");
        s1.display();
        s2.display();
    }
}
