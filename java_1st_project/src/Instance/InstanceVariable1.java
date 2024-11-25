package Instance;

class Car {
    String model;
    String brand;
    int price;

    void addData(int a, String b, String c) {
        model = b;
        brand = c;
        price = a;
    }

    void display() {
        System.out.println(model);
        System.out.println(brand);
        System.out.println(price);
        System.out.println("===========");
    }
}

public class InstanceVariable1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        c.addData(6788, "Toyato", "null");
        c.display();
    }
}
