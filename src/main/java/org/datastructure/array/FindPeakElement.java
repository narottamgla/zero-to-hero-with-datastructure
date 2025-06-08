package org.datastructure.array;

public class FindPeakElement {
    public static void main(String[] args) {
        int arr[] = {2,4,5,4};

        findPeakElement(arr);
    }

    private static void findPeakElement(int arr[]) {

        for (int i=1;i<arr.length-1;i++){

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
