package ArrayCode;

import java.util.Scanner;

class ArrayOper1 {
    int[][] arr;
    Scanner sc = new Scanner(System.in);

    public void createArray1(int i, int j) {
        arr = new int[i][j];
        System.out.println("Array Created");
    }

    public void addData1() {
        for (int n = 0; n < arr.length; n++) {
            System.out.println("Inside class no : " + (n + 1));
            for (int m = 0; m < arr.length; m++) {
                System.out.println("Enter the marks of student: " + (m + 1));
                arr[n][m] = sc.nextInt();
            }
        }
        System.out.println("Array Data Added");
    }

    public void viewData1() {
        for (int n = 0; n < arr.length; n++) {
            System.out.println("Inside the class no : " + (n + 1));
            for (int m = 0; m < arr.length; m++) {
                System.out.println("The marks of the student no : " + (m + 1) + " is = " + arr[n][m]);
            }

        }
    }
}

public class ArrayCode2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class Count : ");
        int i = sc.nextInt();
        System.out.println("Enter the Student Count : ");
        int j = sc.nextInt();

        ArrayOper1 ao = new ArrayOper1();
        ao.createArray1(i, j);
        ao.addData1();
        ao.viewData1();

    }
}
