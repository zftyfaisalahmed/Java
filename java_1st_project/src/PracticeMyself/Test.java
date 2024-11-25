package PracticeMyself;

class Calculation {
    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    void sub(int a, int b) {
        int c = a - b;
        System.out.println(c);
    }
}

public class Test {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.add(10, 20);
        c.sub(30, 10);
    }
}
