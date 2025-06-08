package org.twopointers;

import org.searchingsorting.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, -4};
        int target = 0;
        int result[] = threeSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int [] threeSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[3];
        boolean found = false;
        HashMap<Integer,Integer> hm= new HashMap<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int compliment = target - nums[i] - nums[j];
                // Perform binary search for the third number
                System.out.println("Compliment: " + compliment);

                if (hm.containsKey(compliment)) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                    result[2] = compliment;
                    found = true;
                }
                hm.put(nums[j], j);
            }// Store the second number and its index
            if (found) break;
        }

        return found ? result : new int[]{};
    }
}
