package Problems;

public class BinarytoDec {
    public static void main(String[] args) {
        int bin = 1011;

        int decimal = 0, base = 1;

        while (bin > 0) {
            int lastDigit = bin % 10; // extract the last digit
            decimal += lastDigit * base;
            base *= 2;
            bin /= 10; // remove the last digit
        }

        System.out.println(decimal);
    }
}
