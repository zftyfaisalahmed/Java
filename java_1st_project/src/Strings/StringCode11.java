package Strings;

import java.util.Scanner;

class StringReverse {
    void trimString(String inp) {
        int spc_cnt = 0;

        inp = inp.trim();
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ' && inp.charAt(i + 1) != ' ') {
                spc_cnt++;
                // System.out.println(inp.charAt(i));
            }
        }
        int wrd_cnt = spc_cnt + 1;

        // System.out.println(spc_cnt);

        String str_tmp = "";

        String arr[] = new String[wrd_cnt];
        int temp = arr.length - 1;

        // System.out.println(temp);

        for (int i = inp.length() - 1; i >= 0; i--) {
            if (inp.charAt(i) == ' ') {
                arr[temp] = str_tmp;
                temp--;
                str_tmp = "";
            } else {
                str_tmp = str_tmp + inp.charAt(i);
            }
        }

        arr[temp] = str_tmp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ' ');
        }
    }
}

public class StringCode11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String inp = sc.nextLine();

        StringReverse sr = new StringReverse();

        sr.trimString(inp);
        // sr.wordCount(inp);

    }
}
