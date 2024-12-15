package HasARelation;

class Brain {
    String cerebrum;
    String cerebellum;

    public Brain(String cerebrum, String cerebellum) {
        super();
        this.cerebrum = cerebrum;
        this.cerebellum = cerebellum;
    }

    public String getCerebrum() {
        return cerebrum;
    }

    public String getCerebellum() {
        return cerebellum;
    }
}

class Heart {
    String left;
    String right;

    public Heart(String left, String right) {
        super();
        this.left = left;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }
}

class Human {
    Brain b = new Brain("Right Brain", "Left Brain");

    void hasHeart(Heart h) {
        System.out.println(h.getLeft());
        System.out.println(h.getRight());
    }
}

public class EnClosing1 {
    public static void main(String[] args) {
        Heart h = new Heart("Left Heart", "Right Heart");
        Human hu = new Human();

        System.out.println("Details of Brain");
        System.out.println(hu.b.getCerebrum());
        System.out.println(hu.b.getCerebellum());
        System.out.println("==============");
        // m.hasCharger(c);
        hu.hasHeart(h);
        System.out.println("==============");

        // killing the object

        hu = null;
        System.out.println("Details of Heart");
        System.out.println(h.getLeft());
        System.out.println(h.getRight());
        System.out.println("==============");
    }
}
