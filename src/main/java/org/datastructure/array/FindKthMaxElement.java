package org.datastructure.array;

public class FindKthMaxElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2; // Find the 2nd largest element
        int result = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }

    private static int findKthLargest(int[] arr, int k) {

        for (int i=0;i< arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] < arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k - 1]; // Return the kth largest element
    }
}
