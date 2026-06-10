class example{
    String name;
    int id;
    example(){
        this("Aryan");
        System.out.println("Default constructor");
    }
    example(String name){
        System.out.println("Name: "+name);
    }
    example(String name,int id){
        System.out.println("Name: " + name + " " + "id: " + id);
    }
}
public class constructionChanning {
    public static void main(String[] args) {
        new example();
    }
}
