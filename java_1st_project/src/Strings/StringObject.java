package Strings;

import java.lang.String;

public class StringObject {
    public static void main(String[] args) {
        String first = new String("Hi");
        String second = new String("Hi");

        if (first == second) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
