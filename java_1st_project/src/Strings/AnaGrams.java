package Strings;

import java.util.Arrays;
import java.util.Scanner;

class AnnaGrams {
    static String input1 = "";
    static String input2 = "";

    boolean caseOne(String inp, String inp2) {

        char[] input1 = inp.toCharArray();
        char[] input2 = inp2.toCharArray();

        Arrays.sort(input1);
        Arrays.sort(input2);

        return Arrays.equals(input1, input2);

    }

}

public class AnaGrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Strings One : ");
        String inp = sc.nextLine();

        System.out.println("Enter the Strings two : ");
        String inp2 = sc.nextLine();

        AnnaGrams an = new AnnaGrams();
        // an.caseOne(inp, inp2);

        System.out.println(an.caseOne(inp, inp2) ? "The Two Strings are anagram" : "The Two Strings are not anagram");
    }
}
