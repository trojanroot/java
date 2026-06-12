class Animal {
    void eat() {
        System.out.println("Animal is eating. ");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class multiInheritance {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
