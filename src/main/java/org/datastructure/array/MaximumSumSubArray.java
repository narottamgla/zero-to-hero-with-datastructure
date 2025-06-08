package org.datastructure.array;

public class MaximumSumSubArray {

    public static void main(String[] args) {

        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxSumArray = getMaxSumArray(arr);

        System.out.println(maxSumArray);
    }

    private static int getMaxSumArray(int[] arr) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int currentSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                currentSum = currentSum + arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }
}
