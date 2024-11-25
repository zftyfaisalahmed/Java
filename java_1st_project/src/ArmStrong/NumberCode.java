package ArmStrong;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberCode {

    static boolean code(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            arr.add(rem);
            temp = temp / 10;
        }
        arr.toArray();
        System.out.println(arr.toString());

        boolean result = false;
        int sum = 0;
        int prev_sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            sum = arr.get(i) + arr.get(arr.size() - i - 1);
            System.out.println("------");
            if (i > 0) {
                System.out.println(sum);
                prev_sum = sum;
                sum = arr.get(i) + arr.get(arr.size() - i - 1);
                System.out.println("i" + arr.get(i));
                System.out.println("arr[size-i-1]" + arr.get(arr.size() - i - 1));
                System.out.println(prev_sum);
                System.out.println(sum);
                if (sum == prev_sum) {
                    result = true;
                    System.out.println(result);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();

        System.out.println(code(n));

    }

}
