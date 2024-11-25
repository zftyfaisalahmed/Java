package Strings;

class Dog {
    private String name;
    private String color;
    private int cost;
    private int age;
    private String breed;

    // Specific setter
    void setName(String name) {
        this.name = name;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setCost(int cost) {
        this.cost = cost;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    // Specific getter
    String getName() {
        return name;
    }

    String getColor() {
        return color;
    }

    int getCost() {
        return cost;
    }

    int getAge() {
        return age;
    }

    String getBreed() {
        return breed;
    }

    void setData1(String name, String color, int age, int cost, String breed) {
        setName(name);
        setColor(color);
        setCost(cost);
        setAge(age);
        setBreed(breed);
    }

    void setData2(String name, String color, int age, int cost, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.cost = cost;
        this.age = age;
    }

    void getData1() {
        System.out.println(getName());
        System.out.println(getColor());
        System.out.println(getCost());
        System.out.println(getAge());
        System.out.println(getBreed());
    }

    void getData2() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(cost);
        System.out.println(age);
        System.out.println(breed);
    }

}

public class Stringcode13 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setName("Jimmy");
        d1.setColor("Brown");
        d1.setBreed("BR");
        d1.setCost(7000);
        d1.setAge(7);

        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println(d1.getAge());
        System.out.println(d1.getBreed());
        System.out.println(d1.getCost());

        System.out.println("================");

        Dog d2 = new Dog();
        d2.setData1("Rocky", "Black", 8, 5000, "BR");
        d2.getData1();

        System.out.println("================");

        Dog d3 = new Dog();
        d3.setAge(7);
        d3.setBreed("BR");

        System.out.println(d3.getName());
        System.out.println(d3.getColor());
        System.out.println(d3.getAge());
        System.out.println(d3.getBreed());
        System.out.println(d3.getCost());

    }
}
