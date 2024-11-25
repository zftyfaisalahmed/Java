package Strings;

public class Stringcode1 {
    public static void main(String[] args) {
        String str1 = "rama";
        String str2 = "rama";

        if (str1.equals(str2) == true) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }
        System.out.println("==============");

        if (str1 == str2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }
        // System.out.println();
    }
}
