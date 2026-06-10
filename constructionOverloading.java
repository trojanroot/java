class overloading {
    String name;
    int id;

    overloading(String name) {
        System.out.println("Name: " + name);
    }

    overloading(String name, int id) {
        System.out.println("Name: " + name + " " + "id: " + id);
    }

    overloading(int id) {
        System.out.println("id: " + id);
    }

}

public class constructionOverloading {
    public static void main(String[] args) {
        overloading cons = new overloading(10);
        overloading cons1 = new overloading("Aryan", 10);
        overloading cons2 = new overloading("Aryan");

    }
}