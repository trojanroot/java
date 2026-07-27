interface Printable {
    void printDetails();
}

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

abstract class Shape {

    abstract double area();
}

class Circle extends Shape implements Printable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Circle");
        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area());
    }
}

class Rectangle extends Shape implements Printable {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle");
        System.out.println("Length : " + length);
        System.out.println("Width : " + width);
        System.out.println("Area : " + area());
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Method Overloading");
        System.out.println("-------------------------");
        System.out.println("10 + 20 = " + c.add(10, 20));
        System.out.println("10 + 20 + 30 = " + c.add(10, 20, 30));
        System.out.println("5.5 + 4.5 = " + c.add(5.5, 4.5));
        System.out.println();
        Circle circle = new Circle(7);
        Rectangle rectangle = new Rectangle(8, 5);
        Triangle triangle = new Triangle(10, 4);
        System.out.println("Method Overriding");
        System.out.println("-------------------------");
        System.out.println("Area of Circle : " + circle.area());
        System.out.println("Area of Rectangle : " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println();
        System.out.println("Printable Interface");
        System.out.println("-------------------------");
        circle.printDetails();
        System.out.println();
        rectangle.printDetails();
    }
}