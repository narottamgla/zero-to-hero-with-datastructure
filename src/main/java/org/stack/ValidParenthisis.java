package org.stack;

public class ValidParenthisis {

    public static void main(String[] args) {
        String s = "({[]})";
        boolean result = isValidParenthesis(s);
        System.out.println("Is the string '" + s + "' valid? " + result);
    }

    private static boolean isValidParenthesis(String s) {
        if (s == null || s.length() == 0) {
            return true; // An empty string is considered valid
        }

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; // Mismatched brackets
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }
}
