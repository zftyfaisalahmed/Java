package ArrayCode;

import java.util.Scanner;

class studentMarks {
    int arr[][];
    Scanner sc = new Scanner(System.in);

    void createArray(int m) {
        arr = new int[m][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the student count for class no " + (i + 1));
            int n = sc.nextInt();
            arr[i] = new int[n];

        }

        System.out.println("Array created..!");
        System.out.println("The size of array[0] is " + arr[0].length);
        System.out.println("The size of array[1] is " + arr[1].length);
        System.out.println("The size of array[2] is " + arr[2].length);
    }

    void addData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside the class no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the marks of student no: " + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void disaplyData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside the class no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("The marks of student no " + (j + 1) + " is :" + arr[i][j]);
            }
        }
    }
}

public class ArrayCode4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the class number");
        int m = sc.nextInt();

        studentMarks student = new studentMarks();
        student.createArray(m);
        student.addData();
        student.disaplyData();

    }

}
