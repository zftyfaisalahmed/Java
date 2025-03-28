package Problems;

public class RemoveDup {
    public static void main(String[] args) {
        String str = "Hkajncjss";

        char[] chars = str.toCharArray();

        boolean[] seen = new boolean[256]; // ascii
        StringBuilder res = new StringBuilder();

        for (char ch : chars) {
            if (!seen[ch]) {
                seen[ch] = true;
                res.append(ch);
            }
        }

        System.out.println(res.toString());
    }
}
