package test.easy;

import main.easy.PalindromeNumber;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    @org.junit.jupiter.api.Test
    public void isPalindrome121() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @org.junit.jupiter.api.Test
    void isPalindromeNegative121() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @org.junit.jupiter.api.Test
    void isPalindrome10() {
        assertFalse(PalindromeNumber.isPalindrome(10));
    }
}