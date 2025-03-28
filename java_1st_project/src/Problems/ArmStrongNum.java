package Problems;

public class ArmStrongNum {
    public static void main(String[] args) {
        int num = 153;

        int og = num;

        int sum = 0;
        int digits = String.valueOf(num).length(); // count the number of digit

        while (num > 0) {
            int lastDigit = num % 10; // extract the last digit
            sum += Math.pow(lastDigit, digits);
            num /= 10; // remove the last digit maked 0
        }

        if (sum == og) {
            System.out.println("Armstrong " + sum + " " + og);
        } else {
            System.out.println("Not " + sum + " " + og);
        }
    }
}
