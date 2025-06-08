package org.datastructure.array;

public class ArraySimple {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr.length);

        int median = (arr.length+1) / 2;

        System.out.println("Median index: " + median);
        System.out.println("Median value: " + arr[median - 1]);
        }
}
