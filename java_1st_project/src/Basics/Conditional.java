package Basics;

import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value :");
        // int age = 19;
        int age = sc.nextInt();
        if (age < 18) { // if else
            System.out.println("Less then 18");
        } else {
            System.out.println("Greater then 18");
        }

        System.out.println("Enter Value :");

        int age1 = sc.nextInt();
        if (age1 < 18) { // if else if
            System.out.println("Above Age 19");
        } else if (age1 > 60) {
            System.out.println("senior");
        } else {
            System.out.println("Less then 19");
        }
    }
}
