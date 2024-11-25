package Strings;

import java.util.Scanner;

class Password {

    static String upper = "";
    static String lower = "";
    static String num = "";
    static String str_spl = "";
    static String pass = "";

    void upperString(String inp) {
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) >= 65 && inp.charAt(i) <= 90) {
                upper = upper + inp.charAt(i);
            }
        }
    }

    void lowerString(String inp) {
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) >= 97 && inp.charAt(i) <= 122) {
                lower = lower + inp.charAt(i);
            }
        }
    }

    void numberString(String inp) {
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) >= 48 && inp.charAt(i) <= 57) {
                num = num + inp.charAt(i);
            }
        }
    }

    void speicalString(String inp) {
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) >= 33 && inp.charAt(i) <= 47 || inp.charAt(i) == 64) {
                str_spl = str_spl + inp.charAt(i);
            }
        }
    }

    void printResult() {
        System.out.println("UpperCase " + upper);
        System.out.println("LowerCase " + lower);
        System.out.println("Number " + num);
        System.out.println("SpeicalCase " + str_spl);

        // System.out.println("Password " + pass);
    }

    void passwordSet(String inp) {
        for (int i = 0; i < inp.length(); i++) {
            if ((inp.charAt(i) >= 65 && inp.charAt(i) <= 90) && (inp.charAt(i) >= 97 && inp.charAt(i) <= 122)
                    && (inp.charAt(i) >= 48 && inp.charAt(i) <= 57) && (inp.charAt(i) >= 33 && inp.charAt(i) <= 47)
                    && (inp.charAt(i) == 64)) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        }
    }
}

public class PasswordChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password : ");
        String inp = sc.nextLine();

        Password pa = new Password();
        pa.numberString(inp);
        pa.lowerString(inp);
        pa.upperString(inp);
        pa.speicalString(inp);
        pa.printResult();
        pa.passwordSet(inp);

    }
}
