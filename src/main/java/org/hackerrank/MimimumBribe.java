package org.hackerrank;

import java.util.Arrays;
import java.util.List;

public class MimimumBribe {

    public static void main(String[] args) {
        // Example usage
        List<Integer> queue = List.of(2, 1, 5, 3, 4);
        minimumBribes(queue);
        // Output: "Too chaotic"
        String str = "middle-Outz";
        //check string sorted or not
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println("Sorted String: " + sortedStr);
        if (str.equals(sortedStr)) {
            System.out.println("String is sorted");
        } else {
            System.out.println("String is not sorted");
        }




    }



    public static void minimumBribes(List<Integer> q) {

        for(int i=0;i<q.size();i++){
            int bribe = q.get(i)-i;
            if(bribe==2){
                System.out.println("1");
            }
            if(bribe>2){
                System.out.println(bribe);
                System.out.println("To chaotic");
            }
        }
        // Write your code here

    }
}
