package Problems;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        System.out.println(chars);

    }
}
