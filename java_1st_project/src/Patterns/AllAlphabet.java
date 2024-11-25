package Patterns;

import java.util.Scanner;

public class AllAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
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
            // B
            for (int j = 0; j < n; j++) {
                if ((j == 0) || (j == (n - 1) && i != 0 && i != (n / 2) && i != (n - 1)) ||
                        (i == 0 && j != (n - 1)) ||
                        (i == (n / 2)) && j != (n - 1) ||
                        (i == (n - 1) && j != (n - 1))) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            // C
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 0 && i != (n - 1) || i == 0 && j != 0 || i == (n - 1) && j != 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // D
            // System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if ((j == (n - 1) && i != 0 && i != (n - 1)) || j == 0 || (i == 0 || i == (n - 1)) && j != (n - 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");
            // E
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 || j == 0 && i != 0 && i != n - 1 || i == (n / 2) || i == (n - 1) && j != 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // F
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 || j == 0 && i != 0 || i == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // G
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 && j != n - 1 || j == 0 && i != 0 && i != n - 1
                        || i == (n - 1) && j < n / 2 && j != 0 || j == n / 2 && i > n / 2
                        || i == n / 2 && j >= 6 && j <= 9 || j == n - 1 && i >= 6) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // H
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == n / 2) {
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

            // J
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2 || i - j == (n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // K
            for (int j = 0; j < n; j++) {
                if (j == 0 || i - j == (n / 2) || i + j == (n / 2)) {
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

            // M
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j && i <= n / 2 || i + j == n - 1 && i <= n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || j == i) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // O
            for (int j = 0; j < n; j++) {
                if (j == 0 && i != 0 && i != 1 && i != 2 && i <= 7 || i == 0 && j != 0 && j != 1 && j != 2 && j <= 7
                        || j == n - 1 && i != 0 && i != 1 & i != 2 && i <= 7
                        || i == n - 1 && j != 0 && j != 1 && j != 2 && j <= 7 || i + j == 3 || i - j == 7 || j - i == 7
                        || i + j == 17) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // P
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j != n - 1 || i == n / 2 && j != n - 1
                        || j == n - 1 && i != 0 & i != n / 2 && i <= n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // Q
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0 && j < 8 || j == 0 && i != 0 && i < 8 || i == 8 && j != 0 && j <= 8
                        || j == 8 && i != 0 && i <= 8 || i == j && i >= n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // R
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j <= n / 2 || j == n / 2 && i != 0 && i < n / 2 || i == n / 2 && j <= n / 2
                        || i - j == n / 2) {
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

            // T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // U
            for (int j = 0; j < n; j++) {
                if (j == 0 && i <= 8 || j == n - 1 && i <= 8 || i == n - 1 && j >= 2 && j <= 8
                        || i + j == n - 1 && i >= 9 && i < n - 1 || j - i == 0 && i >= 9 && i < n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // V
            for (int j = 0; j < n; j++) {
                if (j == 0 && i <= n / 2 || j == n - 1 && i <= n / 2 || i - j == n / 2 || j + i == 15) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // W
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i + j == n - 1 && i >= n / 2 || i == j && i >= n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // X
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // Y
            for (int j = 0; j < n; j++) {
                if (i == j && i <= n / 2 || i + j == n - 1 && i <= n / 2 || j == n / 2 && i >= n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("     ");

            // Z
            for (int j = 0; j < n; j++) {
                if (i == 0 || i + j == n - 1 || i == n - 1) {
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
