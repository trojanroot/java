class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle:" + area);
    }
}

class Rectangle extends Shape {
    void area(double length, double width) {
        double area = length * width;
        System.out.println("Area of Rectangle " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.area(5);
        System.out.println();
        Rectangle r = new Rectangle();
        r.display();
        r.area(4,5);
    }
}