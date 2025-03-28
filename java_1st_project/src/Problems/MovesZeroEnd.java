package Problems;

import java.util.Arrays;

public class MovesZeroEnd {
    public static void moves(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                j++;
            }
        }

        // Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 7, 0, 6, 5, 4, 0, 4, 9, 0, 0 };

        moves(arr);
        System.out.println(Arrays.toString(arr));

    }
}
