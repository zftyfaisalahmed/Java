package Strings;

import java.util.Scanner;

class VowelLogic {
    void vowelCount(String str) {
        int count = 0;
        int cons_count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            } else {
                cons_count++;
            }
        }
        System.out.println("Vowel count = " + count);
        System.out.println("Consonant Count = " + cons_count);
        System.out.println("============================");
    }

    void upperCaseVowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println("Capital Vowel count = " + count);
        System.out.println("============================");
    }

    void lowerCaseVowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Lower Case Vowel count = " + count);
        System.out.println("============================");
    }

    void replaceAllVowel(String str) {
        String str_tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                str_tmp = str_tmp + '#';
            } else {
                str_tmp = str_tmp + str.charAt(i);
            }
        }
        System.out.println("Replaced String is : " + str_tmp);
        System.out.println("============================");
    }

    void replaceUpperCaseVowels(String str) {
        String str_tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O'
                    || str.charAt(i) == 'U') {
                str_tmp = str_tmp + '#';
            } else {
                str_tmp = str_tmp + str.charAt(i);
            }
        }
        System.out.println("Replaced String is : " + str_tmp);
        System.out.println("============================");
    }

    void replaceLowerCaseVowels(String str) {
        String str_tmp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                str_tmp = str_tmp + '#';
            } else {
                str_tmp = str_tmp + str.charAt(i);
            }
        }
        System.out.println("Replaced String is : " + str_tmp);
        System.out.println("============================");
    }

    void sumVowelPositions(String str) {

    }

    void sumVowels(String str) {

    }
}

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        VowelLogic vl = new VowelLogic();
        vl.vowelCount(str);
        vl.lowerCaseVowelCount(str);
        vl.upperCaseVowelCount(str);
        vl.replaceAllVowel(str);
        vl.replaceUpperCaseVowels(str);
    }
}