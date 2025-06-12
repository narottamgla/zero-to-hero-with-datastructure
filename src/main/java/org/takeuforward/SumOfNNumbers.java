package org.takeuforward;

public class SumOfNNumbers {

    public static void main(String[] args) {

        int n=4;
        int sum =0;
         sumOfNNumbers(sum , n);

        System.out.println(sumOfNNumbers(sum,n));

    }

    private static int sumOfNNumbers(int sum, int n) {

        if (n==0){
            return sum;
        }
       // ;
        sum =sum+n;
        return sumOfNNumbers(sum,n-1);

    }
}
