package Basics;

public class Increment {
    public static void main(String[] args) {
        byte a = 5;
        a++;
        System.out.println(a); // 6

        byte b = 5;
        ++b;
        System.out.println(b); // 6

        byte c = 5;
        byte d = c++;
        System.out.println(c); // 6
        System.out.println(d); // 5

        byte e = 5;
        byte f = ++e;
        System.out.println(e); // 6
        System.out.println(f); // 6

        int g = 20;
        int h = g++ + g++;
        System.out.println(g); // 22
        System.out.println(h); // 41

        int i = 71;
        int j = ++i + ++i;
        System.out.println(i); // 73
        System.out.println(j); // 145

        int k = 89;
        int l = k++ + k++ + ++k + k++ + ++k + k++ + ++k - k--;
        System.out.println(k); // 95
        System.out.println(l); // 551

        int m = 177;
        int n = --m + m-- + m++ + m-- - --m - m-- - --m + m++ + --m - m-- + --m + ++m + ++m + m++;
        System.out.println(m); // 173
        System.out.println(n); // 1040
    }
}