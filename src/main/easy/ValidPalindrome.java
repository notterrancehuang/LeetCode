package main.easy;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        // removes all non-alphanumeric characters and converts to lowercase
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}