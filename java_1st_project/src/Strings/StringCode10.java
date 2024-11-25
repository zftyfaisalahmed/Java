package Strings;

import java.util.Scanner;

public class StringCode10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String inp = sc.nextLine();

        String alpa = "";
        String num = "";
        String str_spl = "";

        for (int i = 0; i < inp.length(); i++) {
            if ((inp.charAt(i) >= 65 && inp.charAt(i) <= 90 || inp.charAt(i) >= 97 && inp.charAt(i) <= 122)) {
                alpa = alpa + inp.charAt(i);
            } else if ((inp.charAt(i) >= 48 && inp.charAt(i) <= 57)) {
                num = num + inp.charAt(i);
            } else {
                str_spl = str_spl + inp.charAt(i);
            }
        }

        System.out.println("Alphabet String : " + alpa);
        System.out.println("Numeric String : " + num);
        System.out.println("Speical Char String : " + str_spl);
    }
}
