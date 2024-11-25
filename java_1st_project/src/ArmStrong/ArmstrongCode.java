package ArmStrong;

import java.util.Scanner;

public class ArmstrongCode {

    static void checkArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem * rem * rem;
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("the sum of cubes is: " + (sum));
            System.out.println("And the given number is also:" + (n));
            System.out.println("Its given number is armstrong number");
        } else {
            System.out.println("the sum of cubes is: " + (sum));
            System.out.println("And the given number is:" + (n));
            System.out.println("Its not a armstrong number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        checkArmstrong(num);
    }

}