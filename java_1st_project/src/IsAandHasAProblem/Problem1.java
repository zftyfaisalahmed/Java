package IsAandHasAProblem;

class Brain {
    private int size;
    private int iq;

    public Brain(int size, int iq) {
        this.size = size;
        this.iq = iq;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}

class Heart {
    private int beatsPerMinute;
    private double weight;

    public Heart(int beatsPerMinute, double weight) {
        this.beatsPerMinute = beatsPerMinute;
        this.weight = weight;
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Human {
    private Brain brain;
    private Heart heart;

    // Constructor
    public Human(Brain brain, Heart heart) {
        this.brain = brain;
        this.heart = heart;
    }

    // Getters and Setters
    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }
}

class Mobile {
    private String company;
    private int cost;

    // Constructor
    public Mobile(String company, int cost) {
        this.company = company;
        this.cost = cost;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Student extends Human {
    private Mobile mobile;
    private Book book;

    public Student(Brain brain, Heart heart, Mobile mobile, Book book) {
        super(brain, heart); // Call the Human constructor
        this.mobile = mobile;
        this.book = book;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Brain brain = new Brain(1200, 130);
        Heart heart = new Heart(72, 0.5);
        Mobile mobile = new Mobile("Samsung", 1000);
        Book book = new Book("Java Programming", "Fasial");

        Student student = new Student(brain, heart, mobile, book);

        System.out.println("Student Details:");
        System.out.println("Brain Size: " + student.getBrain().getSize() + " cc");
        System.out.println("Brain IQ: " + student.getBrain().getIq());
        System.out.println("Heart Beats Per Minute: " + student.getHeart().getBeatsPerMinute());
        System.out.println("Heart Weight: " + student.getHeart().getWeight() + " kg");
        System.out.println("Mobile Company: " + student.getMobile().getCompany());
        System.out.println("Mobile Cost: " + student.getMobile().getCost() + " rs");
        System.out.println("Book Name: " + student.getBook().getName());
        System.out.println("Book Author: " + student.getBook().getAuthor());
    }
}