package ToStringMethod;

public class PrimitiveExample {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        byte b1 = 120;
        Byte b = new Byte(b1);
        System.out.println(b);
        System.out.println("========");
        short s1 = 120;
        Short s = new Short(s1);
        System.out.println(s);
        System.out.println("========");
        int i1 = 120;
        Integer i = new Integer(i1);
        System.out.println(i);
        System.out.println("========");
        long l1 = 120;
        Long l = new Long(l1);
        System.out.println(l);
        System.out.println("========");
        float f1 = 120.432f;
        Float f = new Float(f1);
        System.out.println(f);
        System.out.println("========");
        double d1 = 120.234567;
        Double d = new Double(d1);
        System.out.println(d);
        System.out.println("========");
        char c1 = 'A';
        Character c = new Character(c1);
        System.out.println(c);
        System.out.println("========");
        String st1 = "rama";
        String st = new String(st1);
        System.out.println(st);
        System.out.println("========");
    }
}
