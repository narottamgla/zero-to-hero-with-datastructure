package org.takeuforward;

public class ReverseString {

    public static void main(String[] args) {

        String str = "My name is narottam singh";

        String reverseStr = reverseString(str);

        System.out.println(reverseStr);


    }

    private static String reverseString(String str) {

        String strArr[] = str.split(" ");
        String reverseStr= "";

        for (int i = strArr.length-1;i>=0;i--){
            reverseStr = reverseStr + " " + strArr[i];

        }

        return reverseStr.trim();
    }
}
