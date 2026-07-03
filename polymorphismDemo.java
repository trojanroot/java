class Animal{
    void sound(){
        System.out.println("Animal make a sound");
    }
    void sound(String name){
        System.out.println(name+"make a sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class polymorphismDemo {
    public static void main(String[] args) {
        //compile-time polymorphism
        Animal a=new Animal();
        a.sound();
        a.sound("cat");

        //run-time polymorphism
        Animal d= new Dog();
        d.sound();
    }
}
