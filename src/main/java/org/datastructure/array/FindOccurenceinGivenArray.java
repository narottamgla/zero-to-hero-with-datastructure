package org.datastructure.array;

import java.util.HashMap;

public class FindOccurenceinGivenArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 2};
        int target = 2;
        int count = findOccurrence(arr, target);

        System.out.println("Element " + target + " occurs " + count + " times in the array.");

        int count2 = findOccuranceUsingHashMap(arr, target);
        System.out.println("Element " + target + " occurs " + count2+ " times in the array.");


    }

    private static int findOccurrence(int[] arr, int target) {

        int count = 0; // Initialize a counter to keep track of occurrences
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++; // Increment the counter if the target is found
            }
        }
        return count; // Return the total count of occurrences
    }

    private static int findOccuranceUsingHashMap(int[] arr, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
           hm.put(arr[i] , hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm);
        return hm.get(target); // Return the total count of occurrences

    }
}
