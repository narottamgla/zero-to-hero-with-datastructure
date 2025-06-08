package org.leatcode150;

public class ProductArrayOfSelfExpect {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int result[] = productArray(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] productArray(int[] arr) {
        int arr2[]= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr2[i]= calculateProduct(arr, i);
        }
        return arr2;
    }

    private static int calculateProduct(int[] arr, int i) {
        int product = 1;
        for (int j = 0; j < arr.length; j++) {
            if (j != i) {
                product *= arr[j];
            }
        }
        return product;
    }


}

