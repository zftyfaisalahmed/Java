package Strings;

public class Stringcode3 {
    public static void main(String[] args) {
        String str1 = new String("RAMA");
        String str2 = new String("rama");

        if (str1.equalsIgnoreCase(str2) == true) {
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
