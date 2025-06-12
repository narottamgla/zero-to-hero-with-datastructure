package org.takeuforward;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int number =4;
        int factorial = 1;

       System.out.println(getFactorial(factorial, number));


    }

    private static int getFactorial(int factorial,int number) {

        if(number==1 ){
            return factorial;
        }
        factorial = factorial*number;
        return  getFactorial(factorial,number-1);
    }
}
