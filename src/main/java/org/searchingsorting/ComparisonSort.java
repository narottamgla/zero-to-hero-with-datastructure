package org.searchingsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComparisonSort {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1,1,3,2,1);
        List<Integer> sortedArr = countingSort(arr);
        System.out.println("Sorted Array: " + sortedArr);
    }

    public static List<Integer> countingSort(List<Integer> arr) {

        if (arr.isEmpty()){
            return arr;
        }
        // Write your code here
        int max =0;
        for(int ele: arr){
            if(ele>max){
                max=ele;
            }
        }

        int arr2[] = new int[max+1];

        for(int ele: arr){
            int index= arr.get(ele);
            arr2[index]++;
        }

        System.out.println(Arrays.toString(arr2));

        ArrayList<Integer> sortedArr= new ArrayList<>();

        int pos=0;

        //0 3 1 1
        for(int i=1;i<arr2.length;i++){
            int ele = arr2[i];
            for(int j=0;j<ele;j++){
                sortedArr.add(i);
                pos++;
            }

        }
        return sortedArr;

    }

    public static List<Integer> countingSort2(List<Integer> arr) {
        if (arr == null || arr.isEmpty()) return arr;
        int max = arr.get(0);
        int min = arr.get(0);
        for (int ele : arr) {
            if (ele > max) max = ele;
            if (ele < min) min = ele;
        }
        int[] count = new int[max - min + 1];
        for (int ele : arr) {
            count[ele - min]++;
        }
        List<Integer> sorted = new java.util.ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                sorted.add(i + min);
            }
        }
        return sorted;
    }

}

