class base {
    String name;
    int id;

    base(){
        System.out.println("Default construction called");
    }

    base(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Name: " + name + " " + "Id: " + id);
    }

    void display() {
        System.out.println("Name " + name);
        System.out.println("Id " + id);
    }
}

public class superConstructor extends base {
    superConstructor() {
        this("Aryan", 10);
        System.out.println("Delivered Class constructor class");
    }

    superConstructor(String name, int id) {
        super(name, id);
    }

    public static void main(String[] args) {
        superConstructor sc = new superConstructor();
    }
}
