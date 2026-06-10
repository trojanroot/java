class array {
    String name;
    int id;

    array(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}

public class arrayofObject {
    public static void main(String[] args) {
        array[] a = new array[3];
        a[0] = new array("aryan", 10);
        a[1] = new array("Sushan", 19);
        a[2] = new array("Agrim", 21);
        for (int i = 0; i < a.length; i++) {
            a[0].display();
            a[1].display();
            a[2].display();
            System.out.println();
        }
    }
}
