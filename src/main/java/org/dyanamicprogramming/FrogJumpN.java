package org.dyanamicprogramming;

import java.util.Arrays;

public class FrogJumpN {

    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20, 50};
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int maxJumps = 2; // Maximum number of jumps allowed
        System.out.println("Minimum cost to reach the end: " + minCost(arr, dp, n,maxJumps));
    }

    private static int minCost(int[] arr, int[] dp, int n, int maxJump) {

        if (n == 0) {
            return 0; // Base case: no cost to reach the first stone
        }
        for(int i =1;i< n;i++){
            int currentLowestCost = Integer.MAX_VALUE;
            for (int k = 1; k <= maxJump && i - k >= 0; k++) {
                int jumpCost = minCost(arr, dp, i - k, maxJump) + Math.abs(arr[i] - arr[i - k]);
                currentLowestCost = Math.min(currentLowestCost, jumpCost); // Update with the minimum cost
            }

            dp[i] = currentLowestCost;

        }

        return dp[n - 1]; // Return the minimum cost to reach the last stone
    }
}
