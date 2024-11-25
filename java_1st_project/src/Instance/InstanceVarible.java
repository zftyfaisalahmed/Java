package Instance;

class Dog {
    String name;
    int cost;
    String breed;

    void addData(int a, String b, String c) {
        name = b;
        cost = a;
        breed = c;
    }

    void display() {
        System.out.println(name);
        System.out.println(cost);
        System.out.println(breed);
        System.out.println("============");
    }
}

public class InstanceVarible {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
        d.addData(2000, "Rocky", "GR");
        d.display();
    }
}
