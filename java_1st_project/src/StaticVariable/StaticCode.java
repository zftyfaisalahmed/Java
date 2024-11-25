package StaticVariable;

class Calculator {
    static int a, b, c;
    int p, q, r;

    // Static Block will be executed when ever the variable get the place at static
    // memory
    static {
        a = 100;
        b = 200;
        c = 300;
    }

    // This non static block will get executed when an object is created for the
    // class
    {
        p = 900;
        q = 800;
        r = 700;
    }

    // Static method
    static void display1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    // Non static method
    void display2() {
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);

        // we can call or use static variables inside the non static block or method but
        // not vice versa
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

public class StaticCode {

    public static void main(String[] args) {

        // these static variables can be accessed without creating object for the class
        System.out.println(Calculator.a);
        System.out.println(Calculator.b);
        System.out.println(Calculator.c);
        System.out.println("+++++++++");

        Calculator.display1();
        System.out.println("+++++++++");
        // But can access the non static variables or methods directly we need to create
        // object for the class
        Calculator calculator = new Calculator();
        System.out.println(calculator.p);
        System.out.println(calculator.q);
        System.out.println(calculator.r);
        System.out.println("+++++++++");
        calculator.display2();

    }

}
