package org.takeuforward;

import java.util.ArrayList;
import java.util.Arrays;

public class ReArrangeElementBuSign {
    static int  positiveTaken = 0;
   static int negetiveTaken= 0;


    public static void main(String[] args) {
        int arr[] = {1,2 ,-4,-5};
        Arrays.stream(reArrangeElementBySign(arr)).forEach(el->System.out.println(el));
    }

    private static int[] reArrangeElementBySign(int[] arr) {

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negetive = new ArrayList<>();

        for (int el: arr){
            if (el>0){
                positive.add(el);
            }
            else {
                negetive.add(el);
            }
        }

        for (int i=0;i<arr.length/2;i++){
            arr[2*i]= positive.get(i);
            arr[2*i+1]= negetive.get(i);

        }
        return arr;

    }

}
