package Problems;

import java.util.Arrays;

public class Armstrong {
    public static boolean isArmStrong(int num) {
        int og = num;
        int sum = 0, digits = 0;

        int temp = num;
        while (temp > 0) {
            temp /= 10; // remove the last digit
            digits++; // count the number of digit
        }

        temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10; // Extract the last digit
            sum += Math.pow(lastDigit, digits);
            temp /= 10; // remove the last digit
        }

        return sum == og;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmStrong(num)) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Not ArmStrong");
        }
    }
}
