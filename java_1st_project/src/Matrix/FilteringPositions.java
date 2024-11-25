package Matrix;

public class FilteringPositions {

    public static void main(String[] args) {
        // we are using some static arrays here
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = 0;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("even indexed item: " + (arr[i]));
                sum = sum + (arr[i]);
            } else {
                System.out.println("odd indexed item: " + (arr[i]));
                product = product * (arr[i]);
            }
        }

        System.out.println("sum: " + (sum));
        System.out.println("product: " + (product));
    }

}
