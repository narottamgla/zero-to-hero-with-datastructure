package org.string;

import org.datastructure.array.FindPeakElement;

import java.util.HashSet;
import java.util.Set;

public class AllCombinationOfString {
    public static void main(String[] args) {
        String input = "Singh";
        Set<String> stringSet = printAllSubString(input);
        stringSet.forEach(System.out::println);
    }

    private static Set<String> printAllSubString(String input) {
        Set<String> setOfString = new HashSet<>();
        if (input==null){
            return null;
        }
        else if (input.isEmpty()){
            setOfString.add(input);
            return setOfString;
        }

        char initialChar= input.charAt(0);
        String remaingString= input.substring(1);
        Set<String> words = printAllSubString(remaingString);

        for (String newStr : words){
            for (int i=0;i< newStr.length();i++){
                setOfString.add(charInsert(newStr,initialChar,i));
            }
        }

        return setOfString;

    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }


}
