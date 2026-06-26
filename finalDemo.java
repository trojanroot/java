final class Utility{
    public static int square(int num) {
        return num*num;        
    }
    public static int cube(int num){
        return num*num*num;
    }
}
class Bank{
    public final double calInt(double amount){
        return amount * 0.88;//8%interest
    }
}
class SBI extends Bank{
    // compiler Error:cannot override final method
    // public double calInt(double amount){
    //     return amount *0.10;
    // }
}
public class finalDemo {
    public static void main(String[] args) {
        final double PI=3.14159;
        double radius=7;
        double area=PI*radius*radius;
        System.out.println("Radius= "+radius);
        System.out.println("Area of circle= "+area);
        SBI sbi=new SBI();
        double amount=1000;
        double interest=sbi.calInt(amount);
        System.out.println("amount= "+amount);
        System.out.println("interest= "+interest);
        int num=5;
        System.out.println("square of "+ num +"="+ Utility.square(num));
        System.out.println("cube of "+ num +"="+ Utility.cube(num));

    }
}
