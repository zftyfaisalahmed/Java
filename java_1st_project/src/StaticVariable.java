class Dog2 {
    static String name;
    static int price;
    static String breed;

    void display() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(breed);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        System.out.println("Default Values by JVM: ");
        System.out.println(Dog2.name);
        System.out.println(Dog2.price);
        System.out.println(Dog2.breed);
        System.out.println("============");

        Dog2.name = "jimmy";
        Dog2.price = 6000;
        Dog2.breed = "GR";

        System.out.println(Dog2.name);
        System.out.println(Dog2.price);
        System.out.println(Dog2.breed);
    }
}
