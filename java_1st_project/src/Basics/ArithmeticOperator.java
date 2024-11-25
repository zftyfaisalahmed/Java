package Basics;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the byte data : ");
        byte b = sc.nextByte();
        System.out.println("The byte data = " + b);
        System.out.println("========================");
        System.out.println("Enter the short data : ");
        short s = sc.nextShort();
        System.out.println("The Short data = " + s);
        System.out.println("========================");
        System.out.println("Enter the Integer data : ");
        int i = sc.nextInt();
        System.out.println("The int data = " + i);
        System.out.println("========================");
        System.out.println("Enter the Long data : ");
        Long l = sc.nextLong();
        System.out.println("The Long data = " + l);
        System.out.println("========================");
        System.out.println("Enter the float data : ");
        float f = sc.nextFloat();
        System.out.println("The float data = " + f);
        System.out.println("========================");
        System.out.println("Enter the double data :");
        double d = sc.nextDouble();
        System.out.println("The Double data = " + d);
        System.out.println("=======================");
        System.out.println("Enter the String data : ");
        String Str = sc.next();
        System.out.println("The String data = " + Str);
        System.out.println("========================");
    }
}