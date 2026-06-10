class student1 {
    String name;
    int id;

    student1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("name: " + name + " " + "id: " + id);
    }
}

public class parameterizedConstractor {
    public static void main(String[] args) {
        student1 s1 = new student1("Aryan", 10);
        s1.display();
    }
}