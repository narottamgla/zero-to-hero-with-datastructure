package org.dyanamicprogramming;

import java.util.Arrays;

public class FrogJump {

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20, 50};
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println("Minimum cost to reach the end: " + minCost(arr, dp, n));
    }

    private static int minCost(int[] arr, int[] dp, int n) {

        if (n == 0) {
            return 0; // Base case: no cost to reach the first stone
        }
        for(int i =1;i< n;i++){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= minCost(arr, dp, i - 1) + Math.abs(arr[i] - arr[i - 1]);
            if (i>1){
                jumpTwo = minCost(arr, dp, i - 2) + Math.abs(arr[i] - arr[i - 2]);
            }

            dp[i] = Math.min(jumpOne, jumpTwo);

        }

        return dp[n - 1]; // Return the minimum cost to reach the last stone
    }
}
