package Problems;

public class WordCount {
    public static void main(String[] args) {
        String str = "The Word is Good";

        int wordCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                wordCount++;
            }
        }

        System.out.println(wordCount);
    }
}
