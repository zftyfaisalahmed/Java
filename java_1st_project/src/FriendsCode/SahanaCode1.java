package FriendsCode;

import java.util.Scanner;

public class SahanaCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.next();
        String s1 = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j <= s1.length() - 1; j++) {
                if (s.charAt(i) == s1.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}