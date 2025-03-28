package Basics;

public class ThisKeyword {
    private String name;
    private int age;

    public ThisKeyword(String name) {
        this.name = name; // 'this' refers to the instance variable 'name'
    }

    public ThisKeyword(String name, int age) {
        this(name); // Call the constructor with one argument
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name); // 'this' is optional here
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ThisKeyword person = new ThisKeyword("Alice", 30);
        person.printDetails();
    }
}