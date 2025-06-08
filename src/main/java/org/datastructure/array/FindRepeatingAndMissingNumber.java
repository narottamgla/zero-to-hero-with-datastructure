package org.datastructure.array;

import java.util.Arrays;

public class FindRepeatingAndMissingNumber {

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,5};
        findMissingAndDuplicateNumber(arr);
    }

    private static void findMissingAndDuplicateNumber(int[] arr) {
        int arr2[] = new int[arr.length+1];
        Arrays.fill(arr2,0);

        for (int i=0;i< arr.length;i++){
            arr2[arr[i]]++;
        }

        for (int i=1;i< arr2.length;i++){
            if (arr2[i]==0){
                System.out.println("Missing Element is :"+ i);
            }

            if (arr2[i]>1){
                System.out.println("Duplicate Element is :"+ i);
            }
        }


    }
}
