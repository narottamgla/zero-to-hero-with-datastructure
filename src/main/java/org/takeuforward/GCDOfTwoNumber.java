package org.takeuforward;

public class GCDOfTwoNumber {

    public static void main(String[] args) {

        int number1 =11;
        int number2 =121;

        int gcd = getGCDOfTwoNumber(number1,number2);
        System.out.println(gcd);


    }

    private static int getGCDOfTwoNumber(int number1, int number2) {

        int getmaxNum= number1;
        int gcdNum=1;

        if (number1< number2){
            getmaxNum=number2;
        }

        for (int i=1;i<=getmaxNum/2;i++){
            if (number1%i ==0&& number2%i==0){
               gcdNum=i;
            }
        }

        return gcdNum;
    }
}
