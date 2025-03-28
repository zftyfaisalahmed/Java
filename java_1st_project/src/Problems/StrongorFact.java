package Problems;

public class StrongorFact {
    public static void main(String[] args) {
        int num = 145;

        int og = num;
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10; // extract the last digit
            int fact = 1;

            for (int i = lastDigit; i > 0; i--) {
                fact *= i; // multiply the last digit
            }

            sum += fact;
            num /= 10; // remove the last digit
        }

        if (sum == og) {
            System.out.println("Strong " + sum + " " + og);
        } else {
            System.out.println("Not " + sum + " " + og);
        }
    }
}
