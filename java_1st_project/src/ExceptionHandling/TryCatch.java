package ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the num1 : ");
            int n1 = sc.nextInt();
            System.out.println("Enter the num2 : ");
            int n2 = sc.nextInt();

            int res = n1 / n2;

            System.out.println(res);
        } catch (Exception e) {
            System.out.println("Exception is Handled");
        }
    }
}
