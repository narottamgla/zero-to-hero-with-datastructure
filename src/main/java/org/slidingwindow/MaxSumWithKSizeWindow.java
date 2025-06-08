package org.slidingwindow;

public class MaxSumWithKSizeWindow {

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumWithKSizeWindow(arr, k));
    }

    private static int maxSumWithKSizeWindow(int[] arr, int k) {

        if (arr.length < k) {
            return -1; // Not enough elements for a window of size k
        }

        int maxSum = 0;
        int currentSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
