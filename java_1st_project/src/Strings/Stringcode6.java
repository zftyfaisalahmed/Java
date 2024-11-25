package Strings;

public class Stringcode6 {
    public static void main(String[] args) {
        String s1 = "Rama";
        String s2 = "rama";

        if (s1.compareToIgnoreCase(s2) == 0) {
            System.out.println(s1.compareTo(s2));
            System.out.println("String are equals");
        } else {
            System.out.println(s1.compareTo(s2));
            System.out.println("String are not equals");
        }

        // -32
        // String are equals
    }
}
