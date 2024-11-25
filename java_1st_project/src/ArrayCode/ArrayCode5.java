package ArrayCode;

import java.util.Scanner;

class StudentMarks2 {

    int arr[][][];
    Scanner sc = new Scanner(System.in);

    void createArray(int m) {
        arr = new int[m][][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the class count in school no " + (i + 1));
            int n = sc.nextInt();
            arr[i] = new int[n][];

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside the school-" + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the student count in class: " + (j + 1));
                arr[i][j] = new int[sc.nextInt()];
            }
        }

    }

    void addData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside the school no: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("inside the class" + (j + 1));
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the marks of student no: " + (k + 1));
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    void disaplyData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Inside the school no: " + (i + 1));
            System.out.println("===========================");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Class " + (j + 1) + " Marks:");
                System.out.println("----------------------");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("The marks of student no: " + (k + 1) + arr[i][j][k]);
                }
                System.out.println();
            }
        }
    }

}

public class ArrayCode5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the school number");
        int m = sc.nextInt();

        StudentMarks2 student = new StudentMarks2();
        student.createArray(m);
        student.addData();
        student.disaplyData();
    }

}
