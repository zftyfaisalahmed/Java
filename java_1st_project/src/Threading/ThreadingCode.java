package Threading;

import java.util.Scanner;

public class ThreadingCode {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition Operation Started");
        System.out.println("Enter the first Number for addition : ");
        int addnum1 = sc.nextInt();
        System.out.println("Enter the second Number for addition : ");
        int addnum2 = sc.nextInt();
        int resnum = addnum1 + addnum2;
        System.out.println("The Addition result is : " + resnum);
        System.out.println("Addition Operation is completed");

        System.out.println("Multiplication Operation Started");
        System.out.println("Enter the first Number for Multiplication : ");
        int mulnum1 = sc.nextInt();
        System.out.println("Enter the second Number for Multiplication : ");
        int mulnum2 = sc.nextInt();
        int resnum1 = mulnum1 * mulnum2;
        System.out.println("The Multiplication result is : " + resnum1);
        System.out.println("Multiplication Operation is completed");

        System.out.println("Printing Op-1 is started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("India");
            Thread.sleep(3000);
        }
        System.out.println("Printing Op-1 is Ended");

        System.out.println("Printing Op-2 is started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("US");
            Thread.sleep(3000);
        }
        System.out.println("Printing Op-2 is Ended");
    }
}
