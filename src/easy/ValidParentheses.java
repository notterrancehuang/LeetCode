package easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> leftParen = new Stack<>();
        for (char c : s.toCharArray()) {
            // opening parentheses
            if (c == '(' || c == '[' || c == '{') {
                leftParen.push(c);
            }
            
            // closing parentheses
            else if (c == ')' && !leftParen.isEmpty() && leftParen.peek() == '(') {
                leftParen.pop();
            } else if (c == ']' && !leftParen.isEmpty() && leftParen.peek() == '[') {
                leftParen.pop();
            } else if (c == '}' && !leftParen.isEmpty() && leftParen.peek() == '{') {
                leftParen.pop();
            }

            // not a valid symbol
            else {
                return false;
            }
        }
        return leftParen.isEmpty();
    }
}