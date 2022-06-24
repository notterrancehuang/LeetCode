package main.easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> leftParen = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                leftParen.push(c);
            } else if (c == ')' && !leftParen.isEmpty() && leftParen.peek() ==
            '(') {
                leftParen.pop();
            } else if (c == ']' && !leftParen.isEmpty() && leftParen.peek() ==
            '[') {
                leftParen.pop();
            } else if (c == '}' && !leftParen.isEmpty() && leftParen.peek() ==
            '{') {
                leftParen.pop();
            } else {
                return false;
            }
        }
        return leftParen.isEmpty();
    }
}