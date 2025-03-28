package Problems;

import java.util.Arrays;

public class Sorting {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minNum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minNum]) {
                    minNum = j;
                }
            }

            int temp = arr[minNum];
            arr[minNum] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 6, 2, 1, 3, 4, 5 };
        // bubbleSort(arr);
        // System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
