package main.easy;

class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int reverse = 0;
        while (num > 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        int x = 123;
        boolean isPalindrome = isPalindrome(x);
        System.out.println("Is palindrome number: " + isPalindrome);
    }
}