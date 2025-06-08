package org.datastructure.array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUnionIntersect {

    public static void main(String[] args) {
        int arr1[]= {1, 2,3 ,4 };
        int arr2[] = {3,4,5};

        int[] unionArray =  findUnion(arr1,arr2);

        for (int a: unionArray){
            System.out.println(a);
        }



    }

    private static int[] findUnion(int[] arr1, int[] arr2) {

        ArrayList<Integer> unionList = new ArrayList<Integer>();

        for (int item : arr1){
            if (!unionList.contains(item)){
                unionList.add(item);
            }
        }

        for (int item : arr2){
            if (!unionList.contains(item)){
                unionList.add(item);
            }
        }

       return unionList.stream().mapToInt(Integer::intValue).toArray();

    }

    public int[] findIntersect(int arr1[], int arr2[]){

       return new int[]{1};
    }
}
