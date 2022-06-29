package main.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] stringArray = s.split(" ");
        return stringArray[stringArray.length - 1].length();
    }
}