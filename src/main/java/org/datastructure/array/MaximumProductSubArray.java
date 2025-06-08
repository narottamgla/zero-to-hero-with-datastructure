package org.datastructure.array;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,0,-4, -5};
        int maximumProduct= getMaximumProduct(arr);
        System.out.println(maximumProduct);
    }

    private static int getMaximumProduct(int[] arr) {

        int maximumProduct= 0;

        for(int i=0;i< arr.length-1;i++){

            int product = arr[i];


            for (int j=i+1;j<arr.length;j++){

                    product = product * arr[j];


                if(maximumProduct<product){
                    maximumProduct=product;
                }

            }
        }

        return maximumProduct;
    }
}
