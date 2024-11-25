package Matrix;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Collecting elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("======");
        System.out.println("Array elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("=====");
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Element is found in position " + (i + 1));
                System.exit(0);

            }
        }
        System.out.println("Element not found");

    }
}