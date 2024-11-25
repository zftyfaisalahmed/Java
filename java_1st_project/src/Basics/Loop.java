package Basics;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value N : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n / 2 || j - i == n / 2 || i - j == n / 2 || i + j == 15) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
