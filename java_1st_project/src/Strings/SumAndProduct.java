package Strings;

import java.util.Scanner;

class CalculateString {

    int sum = 0;
    long prod = 1;

    void stringAdd(String str) {
        for (int i = 0; i < str.length(); i++) {
            sum = sum + str.charAt(i);
        }
    }

    void stringMutiple(String str) {
        for (int i = 0; i < str.length(); i++) {
            prod = prod * str.charAt(i);
        }
    }

    void printResult() {
        System.out.println("Addition of Sum : " + sum);
        System.out.println("Multiple of Prod : " + prod);
    }
}

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        CalculateString cs = new CalculateString();
        cs.stringAdd(str);
        cs.stringMutiple(str);
        cs.printResult();
    }
}
