package Problems;

public class OctaltoDec {
    public static void main(String[] args) {
        int oct = 157;

        int decimal = 0, base = 1;

        while (oct > 0) {
            int lastDigit = oct % 10; // Extract the last digit
            decimal += lastDigit * base;
            base *= 8; // Multiple into 8
            oct /= 10; // Remove the last digit
        }

        System.out.println(decimal); // coverts octal to decimal
    }
}
