package Problems;

public class ParenthesesValid {
    public static void main(String[] args) {
        String str = "{}[)";

        System.out.println(str);

        char[] stack = new char[str.length()];
        int top = -1;

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else {
                if (top == -1) {
                    System.out.println("False");
                    return;
                }

                char last = stack[top--];

                if ((ch == '}' && last != '{') || (ch == ')' && last != '(') || (ch == ']' && last != '[')) {
                    System.out.println("False");
                    return;
                }
            }
        }

        System.out.println(top == -1 ? "True" : "False");
    }
}
