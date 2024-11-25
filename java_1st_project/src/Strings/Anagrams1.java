package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Operators {

    char[] convertTo(String s) {
        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    boolean checkequal(char[] arr1, char[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;

    }

}

public class Anagrams1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Strings one : ");
        String str1 = sc.next();
        System.out.println("Enter the String 2 : ");
        String str2 = sc.next();

        if (str1.length() == str2.length()) {
            Operators op = new Operators();

            char[] arr1 = op.convertTo(str1);
            char[] arr2 = op.convertTo(str2);

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean res = op.checkequal(arr1, arr2);
            if (res == true) {
                System.out.println("AnaGram");
            } else {
                System.out.println("Not Anagram");
            }

        } else {
            System.out.println("Not Anagram");
        }
    }
}
