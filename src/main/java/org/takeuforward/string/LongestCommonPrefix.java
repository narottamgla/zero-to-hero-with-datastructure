package org.takeuforward.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String arr [] = {"hell","he", "hello"};

        String commonPrefix = findLongestCommonPrefix(arr);

        System.out.println("Common prefix :"+ commonPrefix);


    }

    private static String findLongestCommonPrefix(String[] arr) {

        String commonPrefix = arr[0];
        for(int i= arr.length;i>0;i--){
            commonPrefix = arr[0].substring(0,i);
            if(isCommonPrefix(arr,commonPrefix)){
               return  commonPrefix;
            }
        }

        return "";
    }


    public static boolean isCommonPrefix(String arr[], String prefix){

        for(String ele : arr){

            if(!ele.startsWith(prefix)){
                return false;
            }
        }

        return true;
    }
}
