package org.string;

import java.util.HashSet;
import java.util.Set;

public class AllCombinationOfString2 {
    static Set<String> setOfString = new HashSet<>();

    public static void main(String[] args) {
        String input = "AB";
        Set<String> stringSet = printAllSubString(input, 0 , input.length()-1);
        System.out.println(stringSet);
        //stringSet.forEach(System.out::println);
    }

    private static Set<String> printAllSubString(String input, int l, int r) {
        if (l==r){
            setOfString.add(input);
            return setOfString;
        }
        for (int i=l;i<= r;i++){
            input = swap(input, l , i);
            printAllSubString(input, l+1, r);
            input= swap(input , l , i);

        }
        return setOfString;

    }

    public static String swap(String str, int i, int j) {
        char charArray[] = str.toCharArray();
        char temp = charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
    }


}
