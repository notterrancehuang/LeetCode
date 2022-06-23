package main.easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int minimumLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < minimumLength) {
                minimumLength = str.length();
            }
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return result.toString();
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}