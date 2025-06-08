package org.slidingwindow;

public class LongestSubArrayWithSubLessThenK {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 6;
        System.out.println(longestSubArray(arr, k));
    }

    private static int longestSubArray(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int currentSum = 0;
        for(end =0;end < arr.length; end++) {
            currentSum += arr[end];

            // Shrink the window from the left if the sum exceeds k
            while (currentSum > k && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            // Update maxLength if the current window is valid
            if (currentSum <= k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }
}
