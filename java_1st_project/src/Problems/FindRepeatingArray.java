package Problems;

public class FindRepeatingArray {
    public static int findRepeat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // found first repeating
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 6 };
        int repeat = findRepeat(arr);

        if (repeat != -1) {
            System.out.println(repeat);
        } else {
            System.out.println(repeat);
        }
    }
}
