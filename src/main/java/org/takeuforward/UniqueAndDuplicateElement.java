package org.takeuforward;

import java.util.Arrays;

public class UniqueAndDuplicateElement {

    public static void main(String[] args) {
        int arr [] = {7,15,1,15,1};

        System.out.println(findSingleDuplicateNumber(arr));
    }

    private static int findSingleDuplicateNumber(int[] arr) {

        int occurance = 1;
        for (int i=0;i< arr.length;i++){
            boolean flag = false;
            for (int j=0;j<arr.length;j++){
              if (arr[i]==arr[j] && i!= j){
                  occurance++;
                  if(occurance == 2) {
                      flag = true;
                      break;
                  }
              }
              if(!flag)
                  return arr[i];
          }
        }
        return -1;
    }

}
