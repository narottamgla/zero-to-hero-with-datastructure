package org.leatcode150;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int number) {
        if (number < 0) {
            return false; // Negative numbers are not palindromes
        }

        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
            number /= 10; // Remove the last digit
        }

        return originalNumber == reversedNumber; // Check if the original and reversed numbers are the same
    }

}
