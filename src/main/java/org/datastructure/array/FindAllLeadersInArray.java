package org.datastructure.array;

public class FindAllLeadersInArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 4, 8};
        findAllLeadersArray(arr);
        getLeader(arr);
    }

    private static void findAllLeadersArray(int[] arr) {
        System.out.println("Leader: " + arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (getLeader(arr, i, arr[i])) {
                System.out.println(arr[i]);

            }

        }
    }


    private static boolean getLeader(int[] arr, int index, int element) {

        for (int i = 0; i < index; i++) {
            if (arr[i] < element) {

            } else {
                return false;
            }
        }
        return true;
    }

    public static void getLeader(int arr[]){

        int leader = arr[0];
        System.out.println(leader);

        for (int element : arr){
            if (element> leader){
                leader=element;
                System.out.println(leader);

            }
        }
    }
}
