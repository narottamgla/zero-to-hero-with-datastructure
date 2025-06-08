package org.leatcode150;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int [] mergedArray = mergeTwoSortedArrays(arr1, arr2);

        System.out.print("Merged Array: "+ Arrays.toString(mergedArray));
    }

    public static int [] mergeTwoSortedArrays(int [] arr1, int [] arr2){

        int arr1len = arr1.length;
        int arr1len2 = arr2.length;
        int [] mergedArray = new int[arr1len + arr1len2];

        int i = 0, j = 0, k = 0;

        while (i < arr1len && j < arr1len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i< arr1len) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < arr1len2) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;

    }
}
