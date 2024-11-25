package ArrayCode;

import java.util.Scanner;

class StudentNames {

    String arr[][][];
    Scanner sc = new Scanner(System.in);

    void createArray(int l, int m, int n) {
        arr = new String[l][m][n];
        System.out.println("Array created..!");
    }

    void addData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("In the school no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Inside the class no: " + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the name of the student of no " + (k + 1));
                    arr[i][j][k] = sc.nextLine();
                }
            }
        }
    }

    void disaplyData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("In the school no: " + (i + 1));
            System.out.println("--------------------------");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Inside the class no " + (j + 1) + " is :" + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("The name of the student " + (k + 1) + " is " + arr[i][j][k]);
                }
            }
        }
    }

}

public class ArrayCode3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the schools number");
        int l = sc.nextInt();

        System.out.println("Enter the classes number");
        int m = sc.nextInt();

        System.out.println("Enter the Students number");
        int n = sc.nextInt();

        StudentNames student = new StudentNames();
        student.createArray(l, m, n);
        student.addData();
        student.disaplyData();
    }
}
