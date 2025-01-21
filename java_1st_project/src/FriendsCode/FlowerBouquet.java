package FriendsCode;

// Abstraction
abstract class Flower {
    abstract void fragrance();
}

// Encapsulation
class Rose extends Flower {
    private String color;

    public Rose(String color) {
        this.color = color;
    }

    public void fragrance() {
        System.out.println("Romantic scent for Faizii");
    }
}

// Inheritance
class MyLoveRose extends Rose {
    public MyLoveRose(String color) {
        super(color);
    }

    public void specialMessage() {
        System.out.println("Forever entwined with Faizii <3 Nisha");
    }
}

// Polymorphism
public class FlowerBouquet {
    public static void main(String[] args) {
        Flower roseForFaizii = new MyLoveRose("Red");
        roseForFaizii.fragrance();
        MyLoveRose faiziiRose = (MyLoveRose) roseForFaizii;
        faiziiRose.specialMessage();
    }
}
