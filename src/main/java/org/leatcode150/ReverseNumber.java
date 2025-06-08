package org.leatcode150;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverseNumber(number));

    }

    private static int reverseNumber(int number) {

        int reversedNumber =0;
        while (number>0){
            int digit = number%10;
            reversedNumber = reversedNumber*10+ digit;
            number = number/10;
        }
        return  reversedNumber;
    }
}
