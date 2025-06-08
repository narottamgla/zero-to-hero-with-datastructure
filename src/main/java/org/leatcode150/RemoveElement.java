package org.leatcode150;

public class RemoveElement {
    public static void main(String[] args) {

        int arr[] = {3, 2, 2, 3};
        int value = 3;
        int newArr[] = removeElement(arr, value);
        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }

    public  static  int [] removeElement(int arr[], int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                arr[count++] = arr[i];
            }
        }
        return java.util.Arrays.copyOf(arr, count);
    }
}
