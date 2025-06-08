package org.slidingwindow;



public class LongestSubStringAfterOnesReplacement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        System.out.println(longestSubStringAfterOnesReplacement(arr, k));
    }

    private static int longestSubStringAfterOnesReplacement(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int zeroCount = 0;

        for (end = 0; end < arr.length; end++) {
            if (arr[end] == 0) {
                zeroCount++;
            }

            // Shrink the window from the left if the number of zeros exceeds k
            while (zeroCount > k && start <= end) {
                if (arr[start] == 0) {
                    zeroCount--;
                }
                start++;
            }

            // Update maxLength if the current window is valid
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

}
