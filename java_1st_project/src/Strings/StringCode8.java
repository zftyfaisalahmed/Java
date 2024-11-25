package Strings;

import java.util.Scanner;

class replace {
    void replaceEvenChar(String inp) {
        String modify = "";

        for (int i = 0; i < inp.length(); i++) {
            if (i % 2 == 0) {
                modify = modify + "#";
            } else {
                modify = modify + inp.charAt(i);
            }
        }

        inp = modify;

        System.out.println("The Modified String is :" + inp);

    }
}

public class StringCode8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String Value : ");
        String inp = sc.nextLine();

        replace re = new replace();
        re.replaceEvenChar(inp);
    }
}
