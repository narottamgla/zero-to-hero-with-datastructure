package org.takeuforward;

import java.util.Arrays;

public class MissingAndDuplicateElement {

    public static void main(String[] args) {
        int arr [] = {1,2,4,5,6, 6,7};

        findMissingEndDuplicateNumber(arr);
    }

    private static void findMissingEndDuplicateNumber(int[] arr) {

        int tempArr[] = new int [arr.length+1];

        Arrays.fill(tempArr,-1);

        for(int i=0;i< arr.length;i++){
            tempArr[arr[i]]++;
        }

        for (int i=0;i<tempArr.length;i++){
            if (tempArr[i]==-1){
                System.out.println("Missing number::"+ i);
            }

            if (tempArr[i]==0){
                System.out.println("Occurred single ::"+ i);
            }

            if (tempArr[i]>0){
                System.out.println("Duplicate number::"+ i);
            }
        }
    }

}
