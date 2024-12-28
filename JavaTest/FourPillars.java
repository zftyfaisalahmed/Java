package JavaTest;

// Abstraction
abstract class Shape {
    abstract void draw();
}

// Inheritance and Polymorphism
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Encapsulation
class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
}

public class FourPillars {
    public static void main(String[] args) {
        // Demonstrating Polymorphism
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();

        // Demonstrating Encapsulation
        Account account = new Account(1000);
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}
