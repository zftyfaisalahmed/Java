package AllJavaCore;

import java.util.Scanner;

// Abstraction: Abstract class defining common behavior for all shapes.
abstract class Shapes {
    double area; // Common property for all shapes.

    // Abstracted methods for all shapes, to be implemented by subclasses.
    void collectData() {
        System.out.println("Collect Details from all the shapes");
    }

    void calculate() {
        System.out.println("Calculate the Details");
    }

    void display() {
        System.out.println("Area of the shape: " + area);
    }
}

// Encapsulation: Circle class with private fields.
class Circle extends Shapes {
    private double radius; // Encapsulated field, cannot be accessed directly outside this class.
    private final double pi = 3.14768; // Constant specific to Circle.

    // Overriding abstract methods to implement specific behavior for Circle.
    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble(); // Encapsulation: Access via method.
    }

    @Override
    void calculate() {
        area = pi * radius * radius; // Calculate area specific to Circle.
    }

    @Override
    void display() {
        System.out.println("Area of the Circle: " + area);
    }
}

// Encapsulation: Rectangle class with private fields.
class Rectangle extends Shapes {
    private double length;
    private double breadth;

    // Collect dimensions specific to Rectangle.
    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();
    }

    @Override
    void calculate() {
        area = length * breadth; // Calculate area specific to Rectangle.
    }

    @Override
    void display() {
        System.out.println("Area of the Rectangle: " + area);
    }
}

// Encapsulation: Square class with private fields.
class Square extends Shapes {
    private double side;

    // Collect dimensions specific to Square.
    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        side = sc.nextDouble();
    }

    @Override
    void calculate() {
        area = side * side; // Calculate area specific to Square.
    }

    @Override
    void display() {
        System.out.println("Area of the Square: " + area);
    }
}

// Polymorphism and Abstraction in action: Geometry class works with Shapes
// reference.
class Geometry {
    void permit(Shapes ref) {
        ref.collectData(); // Dynamic Polymorphism: Calls method based on actual object type.
        ref.calculate(); // Polymorphism ensures appropriate method is executed.
        ref.display();
    }
}

public class Program1 {
    public static void main(String[] args) {
        // Inheritance: Circle, Rectangle, and Square are derived from Shapes.
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        // Geometry uses abstraction to work with Shapes.
        Geometry g = new Geometry();

        // Circle Example
        System.out.println("Circle Details:");
        g.permit(c); // Polymorphism: Circle-specific methods are executed.
        System.out.println("================");

        // Rectangle Example
        System.out.println("Rectangle Details:");
        g.permit(r); // Polymorphism: Rectangle-specific methods are executed.
        System.out.println("================");

        // Square Example
        System.out.println("Square Details:");
        g.permit(s); // Polymorphism: Square-specific methods are executed.
        System.out.println("================");
    }
}
