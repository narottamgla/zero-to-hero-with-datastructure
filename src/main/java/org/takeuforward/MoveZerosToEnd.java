package org.takeuforward;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = { 1, 2,3 , 0 , 0 , 1 ,2};
        moveZerosToEnd2(arr);
        print(arr);
    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int [] moveZerosToEnd(int[] arr) {
        int k =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                arr[k]= arr[i];
                k++;
            }
        }
        for (int i=k;i<arr.length;i++ ){
            arr[i]=0;
        }

        return Arrays.copyOf(arr,k);
    }

    private static int [] moveZerosToEnd2(int[] arr) {
        int k =arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0 && i <= k){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                k--;
            }
        }
        return arr;
    }
}
