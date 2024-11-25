package ScannerCode;

import java.util.Scanner;

public class ScannerCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Byte data: ");
        byte b = sc.nextByte();
        System.out.println("Byte data is: " + b);

        System.out.println("Enter short data: ");
        short s = sc.nextShort();
        System.out.println("Short data is: " + s);

        System.out.println("Enter int data: ");
        int i = sc.nextInt();
        System.out.println("Byte Int is: " + i);

        System.out.println("Enter long data: ");
        long l = sc.nextByte();
        System.out.println("Byte long is: " + l);

        System.out.println("Enter string data: ");
        byte str = sc.nextByte();
        System.out.println("Byte string is: " + str);
    }

}
