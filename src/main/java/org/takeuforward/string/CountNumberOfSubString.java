package org.takeuforward.string;

import java.util.HashSet;
import java.util.Set;

public class CountNumberOfSubString {

    public static void main(String[] args) {
        String s1 = "abb";

        int count= getNumberOfSubString(s1);

        System.out.println(count);
    }

    private static int getNumberOfSubString(String s1) {
        Set<String> strs= new HashSet<>();
        for (int i=0;i< s1.length();i++){
            for (int j=i+1;j<= s1.length();j++){
              strs.add(s1.substring(i,j));

            }
        }

        System.out.println(strs);
        return strs.size();
    }
}
