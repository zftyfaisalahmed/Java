package Problems;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Hi Good Everyday";
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }

        System.out.println(str2);
    }
}
