package ArrayCode;

import java.util.Scanner;

public class Code2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("colloecting array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("=============");
        System.out.println("array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("duplicate element is: ");
                System.out.print(arr[i] + " ");

            }
        }
    }

}