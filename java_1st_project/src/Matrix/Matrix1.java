package Matrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];
        int res[][] = new int[n][n];

        System.out.println("Collecting the data for first array");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Collecting the data for second array");
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Finding the sum of 2 arrays : ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("The sum of 2 array : ");
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
