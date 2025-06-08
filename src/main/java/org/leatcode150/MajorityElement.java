package org.leatcode150;
import  java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            // Check if the current number is the majority element
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        throw new IllegalArgumentException("No majority element found");
    }
}
