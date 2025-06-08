package org.datastructure.array;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};


        int arrWithoutDuplicate[] = removeDuplicates(arr);
        for (int i = 0; i < arrWithoutDuplicate.length; i++) {
            System.out.println(arrWithoutDuplicate[i]);
        }
    }

    private static int[] removeDuplicates(int[] arr) {
        int distinctCount=1;

        for (int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[distinctCount]=arr[i];;
                distinctCount++;
            }
        }
       return Arrays.copyOf(arr,distinctCount);
    }
}
