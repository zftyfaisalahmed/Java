package Problems;

public class MostlyUsedChar {
    public static void main(String[] args) {
        String str = "Hello World";

        int[] ascii = new int[256]; // ascii char array

        for (char ch : str.toCharArray()) {
            ascii[ch]++; // counts the str has the char
        }

        char maxChar = '\0'; // null pointer
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (ascii[i] > maxCount) {
                maxCount = ascii[i]; // checks the char has repeated
                maxChar = (char) i; // stores the char is repeated
            }
        }

        System.out.println(maxChar); // l
    }
}
