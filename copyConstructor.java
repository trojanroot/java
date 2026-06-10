class greek{
    String name;
    int id;
    greek(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    //copy constructor
    greek(greek obj2){
        this.name=obj2.name;
        this.id=obj2.id;
    }
}
public class copyConstructor {
    public static void main(String[] args) {
        System.out.println("First Objects");
        greek g1=new greek("Aryan",10);
        System.out.println("Greekname: "+g1.name+" "+"Greekid: "+g1.id);
        greek greek2=new greek(g1);
        System.out.println("Copy construction used second object");
        System.out.println("Greekname: "+greek2.name+" "+"Greekid: "+greek2.id);
    }
}
