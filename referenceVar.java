class student{
    int id;
    String name;
}
public class referenceVar{
    public static void main(String[] args){
        student s1= new student();
        s1.id=10;
        s1.name="Aryan";
        System.out.println("Id: "+s1.id+" "+"Name: "+s1.name);
    }
}