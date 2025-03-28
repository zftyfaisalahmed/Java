package Problems;

public class OddOcc {
    public static int OddOccer(int[] o) {
        int result = 0;
        for (int num : o) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 5, 5, 5, 5 }; // the number of time is repeated in odd
        System.out.println("Odd : " + OddOccer(arr));
    }
}
