package Strings;

public class Stringcode7 {
    public static void main(String[] args) {
        String s = "SachinRameshTendulkar";

        System.out.println("Original String " + s);
        System.out.println("UpperCase String " + s.toUpperCase());
        System.out.println("LowerCase String " + s.toLowerCase());

        System.out.println("Char at Position 5 is : " + s.charAt(5));

        System.out.println("The Total length of the given String" + s.length());

        System.out.println(s.endsWith("Tendulkar"));
        System.out.println(s.endsWith("Hendulkar"));

        System.out.println(s.hashCode());

        System.out.println(s.indexOf("s"));
        System.out.println(s.indexOf("Z"));

        System.out.println(s.getClass());
        System.out.println(s.indexOf("s", 10));

        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());

        System.out.println(s.lastIndexOf("e"));

        System.out.println(s.replace("e", "@"));

        System.out.println(s.startsWith("Sachin"));
        System.out.println(s.startsWith("Vachin"));

    }
}

// Original String SachinRameshTendulkar
// UpperCase String SACHINRAMESHTENDULKAR
// LowerCase String sachinrameshtendulkar
// Char at Position 5 is : n
// The Total length of the given String21
// true
// false
// 1672428618
// 10
// -1
// class java.lang.String
// 10
// false
// false
// 13
// SachinRam@shT@ndulkar
// true
// false