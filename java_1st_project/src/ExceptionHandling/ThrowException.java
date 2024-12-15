package ExceptionHandling;

import java.util.Scanner;

class Ops1 {
    void function1() throws Exception {
        System.out.println("Inside Fun-1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int n2 = sc.nextInt();

        int res = n1 / n2;

        System.out.println(res);

        System.out.println("Division Operation is Completed");
    }
}

class Ops2 {
    void funtion2() throws Exception {
        Ops1 op1 = new Ops1();
        op1.function1();
    }
}

class Ops3 {
    void function3() throws Exception {
        try {
            Ops2 op2 = new Ops2();
            op2.funtion2();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception handled in fun-3");
            throw e;
        }
    }
}

public class ThrowException {
    public static void main(String[] args) {
        try {
            Ops3 op3 = new Ops3();
            op3.function3();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
