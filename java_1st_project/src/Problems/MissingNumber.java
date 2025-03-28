package Problems;

public class MissingNumber {
    public static void missing(int[] arr, int n) {
        boolean[] present = new boolean[n + 1]; // create a arrays given in main

        // checks the num is present
        for (int num : arr) {
            present[num] = true;
        }

        // prints the missing number
        System.out.print("Missing");
        for (int i = 1; i < n + 1; i++) {
            if (!present[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 9, 15 };
        missing(arr, 16);
    }
}
