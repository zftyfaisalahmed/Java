package Matrix;

import java.util.Arrays;

class FindRecur {
    public static void findDuplicates(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Duplicate elements:");

        boolean duplicateFound = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Element : " + arr[i]);
                duplicateFound = true;
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicates found.");
        }
    }

}

public class FindDuplicates {
    public static void main(String[] args) {
        FindRecur fr = new FindRecur();
        int[] arr = { 1, 2, 3, 4, 2, 1, 2, 4 };
        fr.findDuplicates(arr);
    }
}