package Strings;

import java.util.Scanner;

class replaceOdd {
    void replaceOddChar(String inp) {
        String modify = "";

        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) % 2 == 0) {
                modify = modify + "#";
            } else {
                modify = modify + inp.charAt(i);
            }
        }

        inp = modify;

        System.out.println("The Modified String is :" + inp);

    }
}

public class StringCode9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String Value : ");
        String inp = sc.nextLine();

        replaceOdd re = new replaceOdd();
        re.replaceOddChar(inp);
    }
}
