package Basics;

//Encapsulation and Abstraction
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Abstract method, implementation is hidden
    public abstract double getArea();

    @Override
    public String toString() {
        return "Color: " + color;
    }
}

// Inheritance
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Polymorphism (Method Overriding)
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius + ", Area: " + getArea();
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width + ", Area: " + getArea();
    }
}

public class OopsConcept {
    public static void main(String[] args) {
        // Creating objects
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 4, 6);

        // Using objects
        System.out.println(circle);
        System.out.println(rectangle);
    }
}