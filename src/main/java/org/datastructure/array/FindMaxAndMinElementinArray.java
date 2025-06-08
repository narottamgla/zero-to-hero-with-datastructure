package org.datastructure.array;

public class FindMaxAndMinElementinArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, 7};
        int[] result = findMaxAndMin(arr);
        System.out.println("Maximum Element: " + result[0]);
        System.out.println("Minimum Element: " + result[1]);
    }

    private static int[] findMaxAndMin(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{max, min}; // Return an array containing max and min
    }
}
