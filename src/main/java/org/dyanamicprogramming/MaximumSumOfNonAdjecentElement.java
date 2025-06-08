package org.dyanamicprogramming;

import java.util.Arrays;

public class MaximumSumOfNonAdjecentElement {
    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 5};
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(maximumSumOfAdjacenetElements(arr, dp, n));
        System.out.println(maximumSumOfAdjacenetElementsWithTabulation(arr, n));
    }

    private static int maximumSumOfAdjacenetElements(int[] arr, int dp[], int n) {
        if (n == 0) {
            return 0; // Base case: no elements to consider
        }
        if (n == 1) {
            return arr[0]; // Base case: only one element to consider
        }
        if (dp[n - 1] != -1) {
            return dp[n - 1]; // Return already computed value
        }

        // Include the current element and skip the next one
        int includeCurrent = arr[n - 1] + maximumSumOfAdjacenetElements(arr, dp, n - 2);
        // Exclude the current element and consider the next one
        int excludeCurrent = maximumSumOfAdjacenetElements(arr, dp, n - 1);

        dp[n - 1] = Math.max(includeCurrent, excludeCurrent); // Store the result in dp array
        return dp[n - 1];

    }

    private static int maximumSumOfAdjacenetElementsWithTabulation(int[] arr, int n) {
        if (n == 0) {
            return 0; // Base case: no elements to consider
        }
        if (n == 1) {
            return arr[0]; // Base case: only one element to consider
        }

        int[] dp = new int[n];
        dp[0] = arr[0]; // First element
        dp[1] = Math.max(arr[0], arr[1]); // Maximum of first two elements
        for (int i = 2; i < n; i++) {
            // Include the current element and skip the next one
            int includeCurrent = arr[i] + dp[i - 2];
            // Exclude the current element and consider the previous one
            int excludeCurrent = dp[i - 1];
            dp[i] = Math.max(includeCurrent, excludeCurrent); // Store the result in dp array
        }

        return dp[n - 1]; // Return the maximum sum of non-adjacent elements
    }
}
