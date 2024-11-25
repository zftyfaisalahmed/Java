package Patterns;

import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 || j == 0 && i != 0 || i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != 0) || (j == (n - 1) && i != 0) ||
                        (i == 0 && j != 0 && j != (n - 1)) ||
                        i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // I
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // S
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 || j == 0 && i != 0 && i <= 4 || i == n / 2 && j != 0 && j != n - 1
                        || j == n - 1 && i >= 6 && i <= 9 || i == n - 1 && j != n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i != 0) || (j == (n - 1) && i != 0) ||
                        (i == 0 && j != 0 && j != (n - 1)) ||
                        i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != n - 1 || i == n - 1 && j != 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            System.out.println();
        }
    }

}
