package org.hackerrank;

public class SuperDigit {
    public static void main(String[] args) {
        long n = 148;
        int k = 3;
        long result = superDigit(n, k);
        System.out.println("Super Digit: " + result);
    }

    private static long superDigit(long n, int k) {
        // Calculate the initial sum of digits
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }


        // Recursively calculate the super digit
        return calculateSuperDigit(sum);
    }

    private static long calculateSuperDigit(long n) {
        if (n < 10) {
            return n; // Base case: single digit
        }

        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return calculateSuperDigit(sum); // Recursive call
    }
}
