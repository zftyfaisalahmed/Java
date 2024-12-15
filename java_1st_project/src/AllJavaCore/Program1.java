package AllJavaCore;

import java.util.Scanner;

abstract class Shapes {
    double area;

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

class Circle extends Shapes {
    private double radius;
    private final double pi = 3.14768;

    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    @Override
    void calculate() {
        area = pi * radius * radius;
    }

    @Override
    void display() {
        System.out.println("Area of the Circle: " + area);
    }
}

class Rectangle extends Shapes {
    private double length;
    private double breadth;

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
        area = length * breadth;
    }

    @Override
    void display() {
        System.out.println("Area of the Rectangle: " + area);
    }
}

class Square extends Shapes {
    private double side;

    @Override
    void collectData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        side = sc.nextDouble();
    }

    @Override
    void calculate() {
        area = side * side;
    }

    @Override
    void display() {
        System.out.println("Area of the Square: " + area);
    }
}

class Geometry {
    void permit(Shapes ref) {
        ref.collectData();
        ref.calculate();
        ref.display();
    }
}

public class Program1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        Geometry g = new Geometry();

        System.out.println("Circle Details:");
        g.permit(c);
        System.out.println("================");

        System.out.println("Rectangle Details:");
        g.permit(r);
        System.out.println("================");

        System.out.println("Square Details:");
        g.permit(s);
        System.out.println("================");
    }
}
