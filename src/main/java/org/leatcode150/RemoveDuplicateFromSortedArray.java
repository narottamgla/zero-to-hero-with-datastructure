package org.leatcode150;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        int newArr[] = removeDuplicates(arr);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
    }

    private static int[] removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return arr;
        }

        int count = 1; // Start from the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count - 1]) {
                arr[count++] = arr[i];
            }
        }
        return java.util.Arrays.copyOf(arr, count);
    }
}
