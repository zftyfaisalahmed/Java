package FriendsCode;

public class SahanaCode {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5 };
        int[] arr1 = new int[arr.length];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr1[newIndex] = arr[i];
                newIndex++;
            }
        }
        for (int i = 0; i < newIndex; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}