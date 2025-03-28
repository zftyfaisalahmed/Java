package Problems;

public class UpperCase {
    public static String toUpperCase(String str) {

        char[] str2 = str.toCharArray();

        for (int i = 0; i < str2.length; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str2[i] = (char) (str2[i] - 32);
            }
        }

        return new String(str2);
    }

    public static void main(String[] args) {
        String str1 = "abcds";

        String res = toUpperCase(str1);
        System.out.println(res);
    }
}
