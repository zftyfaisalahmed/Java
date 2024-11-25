package StaticVariable;

import java.util.Scanner;

class Farmer {
    double principle;
    static double rate;
    double time;
    double si; // simple interest

    static {
        rate = 2.678;

    }

    void collectData() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principle amount: ");
            principle = sc.nextDouble();

            System.out.println("Enter the time duration: ");
            time = sc.nextDouble();
        }
    }

    void calculate() {
        si = (principle * time * rate) / 100;
    }

    void display() {
        System.out.println("the si = " + si);
    }

}

public class StaticExample {

    public static void main(String[] args) {

        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();

        farmer1.collectData();
        farmer1.calculate();
        farmer1.display();
        System.out.println("---------------");

        farmer2.collectData();
        farmer2.calculate();
        farmer2.display();
        System.out.println("---------------");
    }

}
