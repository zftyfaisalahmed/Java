package Overloading;

class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread) {
        this(bread, "default sauce", "default cheese", "default topping");
    }

    Pizza(String bread, String sauce) {
        this(bread, sauce, "default cheese", "default topping");
    }

    Pizza(String bread, String sauce, String cheese) {
        this(bread, sauce, cheese, "default topping");
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    // void Pizza(String bread) {
    // this.bread = bread;
    // }

    // void Pizza(String bread, String sauce) {
    // this.bread = bread;
    // this.cheese = cheese;
    // }

    // Pizza(String bread, String sauce, String cheese) {
    // this.bread = bread;
    // this.cheese = cheese;
    // this.sauce = sauce;
    // }

    // Pizza(String bread, String sauce, String cheese, String topping) {
    // this.bread = bread;
    // this.cheese = cheese;
    // this.sauce = sauce;
    // this.topping = topping;
    // }
}

public class OverLoading1 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella", "Flakes");
        System.out.println("Here are the ingredients of ur pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}