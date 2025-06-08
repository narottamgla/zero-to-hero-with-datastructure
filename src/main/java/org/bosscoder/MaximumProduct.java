package org.bosscoder;

public class MaximumProduct {

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = maxProduct(nums);
        System.out.println("Maximum product of a contiguous subarray is: " + maxProduct);
    }

    private static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap max and min when a negative number is encountered
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(nums[i], maxSoFar * nums[i]);
            minSoFar = Math.min(nums[i], minSoFar * nums[i]);

            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
