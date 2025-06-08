package org.searchingsorting;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        sorting(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void sorting(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[i];
                    arr[i] = arr[j ];
                    arr[j] = temp;
                }
            }
        }
    }
}
