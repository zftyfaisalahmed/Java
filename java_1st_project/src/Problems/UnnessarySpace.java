package Problems;

import java.util.Scanner;

public class UnnessarySpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase();

        String str2 = "";
        // String str3 = "lsnvkjn vnjs jnkjvnkn ";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ' && str1.charAt(i + 1) == ' ') {

            } else {
                str2 = str2 + str1.charAt(i);
            }
        }

        System.out.println(str2);
        // System.out.println(str3);
    }
}
