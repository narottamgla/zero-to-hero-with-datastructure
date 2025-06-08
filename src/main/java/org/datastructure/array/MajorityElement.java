package org.datastructure.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int arr [] = {1,1,3,3,2,2,2,2};
        
        int majorityElement = getMajorityElement(arr);
        System.out.println(majorityElement);
    }

    private static int getMajorityElement(int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i=0;i< arr.length;i++){
            hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

        int count=0;
        int majorityElement=0;
        for (Map.Entry<Integer,Integer> entry: hm.entrySet()){

            if (entry.getValue()>count){
                count=entry.getValue();
                majorityElement=entry.getKey();
            }
        }
        return majorityElement;
    }
}
