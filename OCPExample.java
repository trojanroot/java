abstract class shape {
    abstract double area();
}

class Circle extends shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class OCPExample {
    public static void main(String[] args) {
        shape s1 = new Circle(5);
        shape s2 = new Rectangle(5, 9);

        System.out.println("Circlce area: " + s1.area());
        System.out.println("Rectangle  area: " + s2.area());
    }
}