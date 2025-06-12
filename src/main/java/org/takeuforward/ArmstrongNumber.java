package org.takeuforward;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        boolean isArmstrongNumber = isArmstrongNumber(number);
        System.out.println(isArmstrongNumber);

    }

    private static boolean isArmstrongNumber(int number) {
        int temp = number;
        int armstrongNumber=0;
        while (temp>0){
            int mod = temp%10;
            temp=temp/10;
            armstrongNumber= mod*mod*mod+ armstrongNumber;
        }
        System.out.println(armstrongNumber);
        return armstrongNumber==number;

    }
}
