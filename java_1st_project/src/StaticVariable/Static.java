package StaticVariable;

class Dog1 {
    static String name;
    static int price;
    static String breed;

    void display() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(breed);
    }
}

public class Static {
    public static void main(String[] args) {
        // Display default values
        System.out.println("Default values:");
        System.out.println(Dog1.name); // null
        System.out.println(Dog1.price); // 0
        System.out.println(Dog1.breed); // null

        // Assign values to static variables
        Dog1.name = "jimmy";
        Dog1.price = 6000;
        Dog1.breed = "GR";

        // Display assigned values using class reference
        System.out.println("\nAfter assigning values:");
        System.out.println(Dog1.name); // jimmy
        System.out.println(Dog1.price); // 6000
        System.out.println(Dog1.breed); // GR
    }
}
