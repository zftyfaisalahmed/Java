public class ReversedByword {
    public static void main(String[] args) {
        String str = "Hello World";

        String[] words = str.split(" ");
        StringBuilder res = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
            if (i > 0) {
                res.append(" ");
            }
        }

        System.out.println(res.toString());
    }
}
