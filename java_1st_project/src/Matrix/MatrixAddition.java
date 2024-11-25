package Matrix;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrices: ");
        int n = sc.nextInt();

        System.out.println("Matrices created");
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];

        System.out.println("Enter the values of matrix one: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("enter the value for the position:" + "row" + (i + 1) + "-" + "col" + (j + 1));
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values of matrix two: ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println("enter the value for the position:" + "row" + (i + 1) + "-" + "col" + (j + 1));
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Adding both matrices");
        int[][] result = new int[n][n];
        int[][] product = new int[n][n];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]);
                System.out.print("	");
            }
            System.out.println();
        }

        System.out.println("Multiplying martices");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("displaying the product: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(product[i][j]);
                System.out.print("	");
            }
            System.out.println();
        }

    }

}
