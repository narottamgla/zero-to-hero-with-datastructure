package org.takeuforward;

import java.awt.*;


public class AllPermutationOfArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3};
        int left=0;
        int right=arr.length-1;
        printAllPermutationOfArray(arr,left , right);
    }

    private static void printAllPermutationOfArray(int arr[], int left , int right) {

        if (left ==right){
            printArray(arr);
        }
        for(int i = left ;i<= right;i++){
            arr = swap(arr, left,i );
            printAllPermutationOfArray(arr,left+1,right);
            arr = swap(arr, left,i);
        }


    }

    private static void printArray(int[] arr) {

        for (int ele:arr){
            System.out.print(ele+ "\t");
        }
        System.out.println();
    }

    private static int[] swap(int[] arr, int left, int i) {

        int temp = arr[left];
        arr[left]=arr[i];
        arr[i]=temp;
        return arr;
    }
}
