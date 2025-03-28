package Problems;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        // str = str.toLowerCase();

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                str2 = str2 + "@";
            } else if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                str2 = str2 + "#";
            } else if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
                str2 = str2 + "%";
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                str2 = str2 + "&";
            } else if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                str2 = str2 + "*";
            } else {
                str2 = str2 + str.charAt(i);
            }
        }

        System.out.println(str2);
    }
}
