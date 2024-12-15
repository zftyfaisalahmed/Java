package ExceptionHandling;

import java.util.Scanner;

class Operation1 {
    void Funtion1() {
        System.out.println("Inside Fun-1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the num2 : ");
        int n2 = sc.nextInt();

        int res = n1 / n2;

        System.out.println(res);

        System.out.println("Division Operation is Completed");

        System.out.println("Array Based operation is started");
        System.out.println("Enter the array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the position into which value has to stored : ");
        int pos = sc.nextInt();
        System.out.println("Enter the value to be inserted : ");
        int val = sc.nextInt();

        arr[pos] = val;

        System.out.println("Data added");
        System.out.println("Array operation is completed");
        System.out.println("Left Fun-1");
    }
}

class Operation2 {
    void Funtion2() {
        System.out.println("Inside Fun-2");
        Operation1 op1 = new Operation1();
        op1.Funtion1();
        System.out.println("Left Fun-2");
    }
}

class Operation3 {
    void Funtion3() {
        try {
            System.out.println("Inside Fun-3");
            Operation2 op2 = new Operation2();
            op2.Funtion2();
        } catch (Exception e) {
            System.out.println("Error Handled");
        }
        System.out.println("Left Fun-3");
    }
}

class Operation4 {
    void Funtion4() {
        System.out.println("Inside Fun-4");
        Operation3 op3 = new Operation3();
        op3.Funtion3();
        System.out.println("Left Fun-4");
    }
}

public class FunctionHandling {
    public static void main(String[] args) {
        System.out.println("Inside Main Fun");
        Operation4 op4 = new Operation4();
        op4.Funtion4();
        System.out.println("Left Main Fun");
    }
}
