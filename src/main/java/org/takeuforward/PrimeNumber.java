package org.takeuforward;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 10;

        boolean isPrimeNumber = isPrimeNumber(number);
        System.out.println(isPrimeNumber);

    }

    private static boolean isPrimeNumber(int number) {
        int divisorCount =0;
        for (int i=1;i<=number/2;i++){
            if(number%i==0){
                divisorCount++;
            }
        }

        return divisorCount==1;
    }
}
