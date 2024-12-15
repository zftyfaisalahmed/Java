package ExceptionHandling;

import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        try {
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
        } catch (Exception e) {
            System.out.println("Exception is Handled");
        }
    }
}
