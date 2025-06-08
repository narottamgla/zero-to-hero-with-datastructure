package org.searchingsorting;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // To avoid overflow

            if (arr[mid] == target) {
                return mid; // Return the index if the target is found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public int binarySearch(int[] arr, int target, int left, int right) {

        int mid = left + (right - left) / 2; // To avoid overflow

        if (left > right) {
            return -1; // Base case: target not found
        }

        if (arr[mid] == target) {
            return mid; // Return the index if the target is found
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right); // Search in the right half
        } else {
            return binarySearch(arr, target, left, mid - 1); // Search in the left half
        }

    }
}
