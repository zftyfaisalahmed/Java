package Strings;

import java.util.*;

class ReverseStringLogic {
    String reverse(String str) {
        String str_temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str_temp = str_temp + str.charAt(i);
        }

        return str_temp;
    }
}

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.next();

        ReverseStringLogic rsl = new ReverseStringLogic();
        rsl.reverse(str);

        System.out.println("The reversed string is : " + str);
        System.out.println("------------");
    }
}
