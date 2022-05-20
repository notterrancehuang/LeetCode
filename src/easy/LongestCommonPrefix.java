package easy;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        // find the minimum length
        int minimumLength = strs[0].length();
        for (String str : strs) {
            if (str.length() < minimumLength) {
                minimumLength = str.length();
            }
        }
        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return sb.toString();
                }
            }
            sb.append(current);
        }
        return sb.toString();
    }
}
