package main.easy;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int length = s.length();
        int result = romanNumerals.get(s.charAt(length - 1));
        for (int i = length - 2; i >= 0; i--) {
            if (romanNumerals.get(s.charAt(i)) >= 
                romanNumerals.get(s.charAt(i + 1))) {
                result += romanNumerals.get(s.charAt(i));
            } else {
                result -= romanNumerals.get(s.charAt(i));
            }
        }
        return result;
    }
}