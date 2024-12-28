package JavaTest;

public class PanGram {
    static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabetTracker = new boolean[26];
        int alphabetCount = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!alphabetTracker[index]) {
                    alphabetTracker[index] = true;
                    alphabetCount++;
                }
            }
            if (alphabetCount == 26) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        if (isPangram(input)) {
            System.out.println("The string is a Pangram.");
        } else {
            System.out.println("The string is not a Pangram.");
        }
    }
}
