package Strings;

import java.util.Scanner;

class PalindromeLogic {
    String reverse(String str) {
        String str_temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str_temp = str_temp + str.charAt(i);
        }

        return str_temp;

    }

    void palindromeCheck(String main_string, String rev_string) {
        if (main_string.equals(rev_string) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();
        String str_temp;

        PalindromeLogic pl = new PalindromeLogic();

        str_temp = pl.reverse(str);

        pl.palindromeCheck(str, str_temp);

        System.out.println("The reversed string is : " + str);
        // System.out.println("------------");

    }
}
