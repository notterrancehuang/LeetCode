package easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strArray = s.split(" ");
        int numWords = strArray.length;
        return strArray[numWords - 1].length();
    }
}