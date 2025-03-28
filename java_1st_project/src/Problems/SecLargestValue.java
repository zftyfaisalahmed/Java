package Problems;

public class SecLargestValue {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7 };

        if (arr.length < 2) {
            System.out.println(Integer.MIN_VALUE);
            return;
        }

        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                seclargest = largest;
                largest = num;
            } else if (num > seclargest && largest != num) {
                seclargest = num;
            }
        }

        if (seclargest == Integer.MIN_VALUE) {
            System.out.println("Not");
        } else {
            System.out.println(seclargest);
        }
    }
}
