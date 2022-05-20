package easy;

import java.util.HashMap;

class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = romanNumerals.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            // if current char is greater than or equal to the char to the
            // right, then add current char
            // otherwise, subtract current char
            if (romanNumerals.get(s.charAt(i)) >= romanNumerals.get(s.charAt(i +
            1))) {
                result += romanNumerals.get(s.charAt(i));
            } else {
                result -= romanNumerals.get(s.charAt(i));
            }
        }
        return result;
    }
}