package Threading;

import java.util.Scanner;

class Opeartion extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("add")) {
            add();
        } else if (Thread.currentThread().getName().equals("mul")) {
            mul();
        } else if (Thread.currentThread().getName().equals("print1")) {
            print1();
        } else {
            print2();
        }
    }

    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition Operation started");
        System.out.println("Enter the first Number for Addition: ");
        int add_num1 = sc.nextInt();
        System.out.println("Enter the Second Number for Addition: ");
        int add_num2 = sc.nextInt();
        int add_res = add_num1 + add_num2;
        System.out.println("The addition result is: " + add_res);
        System.out.println("Addition Operation Completed");

    }

    void mul() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication Operation started");
        System.out.println("Enter the first Number for multiplication: ");
        int mul_num1 = sc.nextInt();
        System.out.println("Enter the Second Number for multiplication: ");
        int mul_num2 = sc.nextInt();
        int mul_res = mul_num1 * mul_num2;
        System.out.println("The multiplication result is: " + mul_res);
        System.out.println("Multiplicationn Operation Completed");

    }

    void print1() {
        try {

            System.out.println("Printing Operation-1 is Started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("India is the best country");
                Thread.sleep(3000);
            }
            System.out.println("Printing Operation-1 is completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void print2() {
        try {

            System.out.println("Printing Operation-2 is Started");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Rohit and virat are best");
                Thread.sleep(3000);
            }
            System.out.println("Printing Operation-2 is completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadCode2 {
    public static void main(String[] args) {
        Opeartion op1 = new Opeartion();
        Opeartion op2 = new Opeartion();
        Opeartion op3 = new Opeartion();
        Opeartion op4 = new Opeartion();

        op1.setName("add");
        op2.setName("mul");
        op3.setName("print1");
        op4.setName("print2");

        op1.start();
        op2.start();
        op3.start();
        op4.start();

    }

}