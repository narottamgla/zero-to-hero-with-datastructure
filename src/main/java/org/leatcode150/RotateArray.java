package org.leatcode150;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        for(int i=1; i<=k; i++){
            int last = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
    }
}
