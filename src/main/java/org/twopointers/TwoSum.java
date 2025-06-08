package org.twopointers;

import static java.util.Collections.binarySearch;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4, 4, 11, 15};
        int target = 8;
        int[] result = findTwoSumWithHashMap(nums, target);
        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null; // Not enough elements to find a pair
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right}; // Found the pair
            } else if (sum < target) {
                left++; // Move left pointer to increase sum
            } else {
                right--; // Move right pointer to decrease sum
            }
        }

        return null; // No pair found
    }

    public int[] findTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null; // Not enough elements to find a pair
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Found the pair
                }
            }
        }

        return null; // No pair found
    }

    public static int[] findTwoSumWithHashMap(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null; // Not enough elements to find a pair
        }

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Found the pair
            }
            map.put(nums[i], i);
        }

        return null; // No pair found
    }

    public static int[] findTwoSumWithBinarySearch(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null; // Not enough elements to find a pair
        }

       for (int i = 0; i < nums.length - 1; i++) {
            int complement = target - nums[i];
            int index = binarySearch(nums, complement, i + 1, nums.length - 1);
            if (index != -1) {
                return new int[]{i, index}; // Found the pair
            }
        }

        return null; // No pair found
}

    private static int binarySearch(int[] nums, int complement, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == complement) {
                return mid; // Found the complement
            } else if (nums[mid] < complement) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Complement not found
    }
}