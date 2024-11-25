package ArrayCode;

import java.util.Scanner;

class ArrayOper {
    int[] arr;
    Scanner sc = new Scanner(System.in);

    public void createArray(int n) {
        arr = new int[n];
        System.out.println("Array Created");
    }

    public void addData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the data of marks : " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Data is added");
    }

    public void viewData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The marks of the student no : " + (i + 1) + " is = " + arr[i]);
        }
    }
}

public class ArrayCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();

        ArrayOper ac = new ArrayOper();

        ac.createArray(n);
        ac.addData();
        ac.viewData();
    }
}