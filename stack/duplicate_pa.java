package stack;

import java.util.Stack;

public class duplicate_pa {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;

                }
                if (count < 1) {
                    return true; // Duplicate parenthesis found
                } else {
                    s.pop(); // pop the opening parenthesis
                }
            } else {
                s.push(ch);
            }
        }
        return false; // No duplicate parenthesis found
    }

    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 = "(a+b)"; // false
        System.out.println(isDuplicate(str)); // true
        System.out.println(isDuplicate(str2)); // false
    }
}
