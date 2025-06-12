package org.takeuforward;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsiqutiveSequence {

    public static void main(String[] args) {
        int arr[] = {100,200,5,7,8,6};

        getLongestConsiqutiveSequnce(arr);
    }

    private static void getLongestConsiqutiveSequnce(int[] arr) {

        Arrays.sort(arr);

         int maxCount =0;
         int count=1;
        for(int i=1;i< arr.length-1;i++){

            if (arr[i]-arr[i-1]==1){
                count++;
                maxCount = Math.max(maxCount,count);
            }else {
                count=1;
            }
        }

        System.out.println(maxCount);


    }
}
