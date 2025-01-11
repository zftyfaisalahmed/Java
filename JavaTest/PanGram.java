package JavaTest;

class CheckAlpha {
    static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabetTracker = new boolean[26];
        int alphabetCount = 0;

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                int index = c - 97;
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
}

public class PanGram {
    public static void main(String[] args) {
        // CheckAlpha ca = new CheckAlpha();
        String input = "abcdeFghijkLmnopqrstuvwXyz";
        if (CheckAlpha.isPangram(input)) {
            System.out.println("The string is a Pangram.");
        } else {
            System.out.println("The string is not a Pangram.");
        }
    }
}
