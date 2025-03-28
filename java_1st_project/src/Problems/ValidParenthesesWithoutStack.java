package Problems;

public class ValidParenthesesWithoutStack {

    public static boolean isValid(String s) {
        char[] stack = new char[s.length()]; // Simulating stack using array
        int top = -1; // Stack pointer

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch; // Push into array (increment top)
            } else {
                if (top == -1)
                    return false; // No matching opening bracket

                char last = stack[top--]; // Pop from array (decrement top)

                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return top == -1; // Stack should be empty if valid
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("{[]}")); // true
    }
}
