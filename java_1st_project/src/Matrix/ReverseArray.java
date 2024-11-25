package Matrix;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " value:");
            arr[i] = sc.nextInt();
        }

        System.out.println("Display array before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("Display array before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
