package org.dyanamicprogramming;


public class FibonacciSeries {
    public static void main(String[] args) {
        int n=4;
         int outcome= fibonacciSeries(n);
         System.out.println("outcome::"+  outcome);

    }

    private static int fibonacciSeries(int n) {

        int[] dp = new int[n+1];

        if(n==0|| n==1){
            return 1;
        }
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[n];

    }
}
