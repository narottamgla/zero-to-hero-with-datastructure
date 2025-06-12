package org.takeuforward;

public class LongestSubArrayWithGivenSum {

    public static void main(String[] args) {
        int arr [] = {1,1,2,3,4, 2,2};
        int requiredSub= 4;
        int maxSizeArray= getLongestSubArrayWithRequiredSum(arr,requiredSub);
        System.out.println(maxSizeArray);

    }

    private static int getLongestSubArrayWithRequiredSum(int[] arr, int requiredSum) {

        int start=0;
        int end=0;
        int arraLength= arr.length;
        int maxSubArraySize=0;

        for ( end=0;end< arraLength;end++){

            while (sumOfArray(arr, start,end)> requiredSum){
                start++;
            }
            if(sumOfArray(arr, start,end)==requiredSum) {
                System.out.println("End:"+ end + " : start:"+ start);
                maxSubArraySize = Math.max(maxSubArraySize, end - start);
            }
        }
        return maxSubArraySize;
    }

    private static int sumOfArray(int[] arr, int start, int end) {
        int sum =0;
        for (int i = start;i< end;i++){
           sum= sum+ arr[start];
        }
        return  sum;
    }
}
