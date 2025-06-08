package org.slidingwindow;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) {
        int arr[] = {10,9 ,2,5,3,7 , 101, 106, 18};
        
        int longest = getLongestIncreasingSubSequence(arr);

        System.out.println(longest);
    }

    private static int getLongestIncreasingSubSequence(int[] arr) {
        int longestIncreasingSequece=0;
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){

                if(isInCreasingSequnce(arr, i,j)){
                    longestIncreasingSequece = Math.max(longestIncreasingSequece, j-i+1);

                }
            }
        }
        return longestIncreasingSequece;
    }

    private static boolean isInCreasingSequnce(int[] arr, int start, int end) {

        for (int i=start;i< end;i++){

            if (arr[i+1]>arr[i]){

            }else {
                return false;
            }
        }
        return true;
    }
}
