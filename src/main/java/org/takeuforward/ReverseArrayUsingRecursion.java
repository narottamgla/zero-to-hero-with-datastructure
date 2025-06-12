package org.takeuforward;

public class ReverseArrayUsingRecursion {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int temp[] = new int[arr.length];
        
        reverseArrayUsingRecursion(arr.length-1,arr);
    }

    private static void reverseArrayUsingRecursion(int n ,int[] arr) {

        if (n==-1){
            return;
        }
        System.out.println(arr[n]);
        reverseArrayUsingRecursion(n-1,arr);
    }
}
