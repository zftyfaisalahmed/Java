package Problems;

import java.util.Arrays;

public class AnagramForm {
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toLowerCase().toCharArray(); // ['d', 'o', 'g']
        char[] arr2 = str2.toLowerCase().toCharArray(); // ['g', 'o', 'd']

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " is an anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
