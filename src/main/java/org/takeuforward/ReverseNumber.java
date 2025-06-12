package org.takeuforward;

public class ReverseNumber {

    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseNumber2(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    private static int reverseNumber(int number) {

        int countOfDigit=0;
        int currentRev = 0;

        while (number>0){
            int mod= number%10;
            number = number/10;
            currentRev= currentRev*10+ mod;
            countOfDigit++;
        }

        return currentRev;
    }

    private static int reverseNumber2(int number) {
       return Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(number)).reverse()));

    }
}
