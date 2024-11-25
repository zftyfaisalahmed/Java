package ClassMethod;

class AnimalDog extends Object {
    private String name;
    private String color;
    private String breed;
    private int age;
    private int cost;

    public AnimalDog(String name) {
        this("Jimmy", "GR");
        this.name = name;
    }

    public AnimalDog(String name, String breed) {
        this("Rocky", "Lab", "Brown");
        this.name = name;
        this.breed = breed;

        System.out.println("Content After Execution of Two Parametrized Constructor");
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("===================");
    }

    public AnimalDog(String name, String breed, String color) {
        this("Harry", "Pug", "Black", 4);
        this.name = name;
        this.breed = breed;
        this.color = color;

        System.out.println("Content After Execution of Three Parametrized Constructor");
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("===================");
    }

    public AnimalDog(String name, String breed, String color, int age) {
        this("Name", "JR", "White", 5, 8000);
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;

        System.out.println("Content After Execution of Four Parametrized Constructor");
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("===================");
    }

    public AnimalDog(String name, String breed, String color, int age, int cost) {
        this();
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.cost = cost;

        System.out.println("Content After Execution of Five Parametrized Constructor");
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("===================");
    }

    public AnimalDog() {
        super();
        this.name = "Tonny";
        this.breed = "Blue";
        this.color = "pug";
        this.age = 4;
        this.cost = 6000;

        System.out.println("Content Execution of Zero Parametrized Constructor");
        System.out.println(name);
        System.out.println(color);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(cost);
        System.out.println("===================");
    }

    void getData() {
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.cost);
        System.out.println("===================");
    }

}

public class ClassName1 {
    public static void main(String[] args) {
        AnimalDog ad = new AnimalDog();
        ad.getData();
        System.out.println("==============");
        AnimalDog ad1 = new AnimalDog("Jipsyyyyy");
        ad1.getData();

    }
}
