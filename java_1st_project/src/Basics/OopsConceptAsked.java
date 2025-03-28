package Basics;

// Abstraction
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract void makeSound();// why have you created this abstract explain

    @Override
    public String toString() { // How this toString is working expalin
        return "Name: " + name;
    }
}

// Inheritance
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Polymorphism
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Sound: Woof!"; // exlpain this super keyword working.
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Sound: Meow!";
    }
}

public class OopsConceptAsked {
    public static void main(String[] args) {
        // Incorrect assignment (as per your example)
        // Dog myDog = new Cat("Whiskers"); // This will cause a compilation error

        // Correct assignment
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        // Using the objects
        System.out.println(myDog);
        myDog.makeSound();
        System.out.println(myCat);
        myCat.makeSound();

        // Demonstrating Polymorphism
        Animal animalDog = new Dog("Spot");
        Animal animalCat = new Cat("Mittens");

        System.out.println(animalDog);
        animalDog.makeSound();
        System.out.println(animalCat);
        animalCat.makeSound();
    }
}