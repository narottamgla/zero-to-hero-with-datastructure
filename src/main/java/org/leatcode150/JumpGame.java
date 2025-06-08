package org.leatcode150;

public class JumpGame {

    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};
       // int arr[]= {3, 2, 1, 0, 4};
        System.out.println(canJump(arr));
    }

    private static boolean canJump(int[] arr) {

        int jump=1;

        for(int i=1 ;i<arr.length;i++){

            jump = jump+ arr[jump];

              if(jump>arr.length-1){
                return false;
            }
            if (jump==arr.length-1){
                return true;
            }

        }
        return false;
    }
}
