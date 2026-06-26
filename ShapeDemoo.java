abstract class shape{
    abstract double calculateArea();
}
class Circle extends shape{
    private double radius;
    public  Circle (double radius){
        this.radius=radius;
    }
    double calculateArea(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends shape{
    private double length;
    private double weidth;

    public Rectangle(double length,double weidth){
        this.length=length;
        this.weidth=weidth;
    }
    @Override
    double calculateArea(){
        return length*weidth;
    }
}
public class ShapeDemoo {
    public static void main(String[] args) {
        
        shape circle = new Circle(5);
        shape rectangle=new Rectangle(10, 4);

        System.out.println("Circle area= "+circle.calculateArea() );
        System.out.println("Rectangle  area= "+rectangle.calculateArea() );


    }
}
