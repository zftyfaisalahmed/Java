package Problems;

public class FindFactor {
    public static void main(String[] args) {
        int num = 12;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("These are the factor number : " + i + " = " + num);
            }
        }
    }
}
