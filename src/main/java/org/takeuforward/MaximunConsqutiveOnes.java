package org.takeuforward;

public class MaximunConsqutiveOnes {

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,1,1,1,3};
        System.out.println(findMaxConsequtiveOnes(arr));
        System.out.println(getMaxConsiqutiveOnes(arr));
        System.out.println(getMaxConsiqutiveOnes2(arr));
    }

    private static int findMaxConsequtiveOnes(int[] arr) {

        int start=0;
        int end;
        int maximumOnes=0;

        for(end=0;end< arr.length;end++){

            if(isConsiquetiveOnes(arr, start, end)){
                maximumOnes= Math.max(end-start,maximumOnes);
            }else {
                start++;
            }
        }
        return maximumOnes;
    }

    private static boolean isConsiquetiveOnes(int[] arr, int start, int end) {

        for (int i=start;i< end;i++){
            if(!(arr[i]==1)){
                return false;
            }
        }
        return true;
    }

    public static int getMaxConsiqutiveOnes(int arr[]){

        int maxOnes=0;
        int finalMax=0;

        for(int i=0;i<arr.length-1;i++){

            for (int j=i+1;j<arr.length;j++){

                if (arr[i]==arr[j] && arr[i]==1){
                    maxOnes++;
                }else {
                    finalMax= Math.max(maxOnes,finalMax);
                    maxOnes=0;
                }

            }
        }
        return finalMax;
    }


    public static int getMaxConsiqutiveOnes2(int arr[]){

        int maxOnes=1;
        int finalMax=0;

        for(int i=1;i<arr.length;i++){
                if (arr[i]==arr[i-1] && arr[i-1]==1){
                    maxOnes++;
                }else {
                    finalMax= Math.max(maxOnes,finalMax);
                    maxOnes=1;
                }
        }
        return finalMax;
    }
}
