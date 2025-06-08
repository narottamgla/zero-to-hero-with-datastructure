package org.bosscoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inclusion {

    public static void main(String[] args) {

        Inclusion inclusion = new Inclusion();
        String s1 = "adc";
        String s2 = "dcda";
     //   boolean result = inclusion.checkInclusion(s1, s2);
     //   System.out.println("Is s1 a permutation of s2? " + result);

        boolean result1 = inclusion.checkPermutaion(s1, s2);
        System.out.println("Is s1 a permutation of s2? " + result1);


    }

    public boolean checkInclusion(String s1, String s2){
        //convert s1 to arraylist
        List<Character> s1List = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            s1List.add(c);
        }
        //convert s2 to arraylist
        List<Character> s2List = new ArrayList<>();
        for (char c : s2.toCharArray()) {
            s2List.add(c);
        }
        for (Character c : s1List) {
            if (!s2List.contains(c)) {
                return false; // If any character in s1 is not in s2, return false
            }
        }
        return true;
    }

    public boolean checkPermutaion(String s1, String s2){
        //convert s1 to arraylist

        int strLength = s1.length();

        for(int i = 0; i < s2.length()-strLength+1; i++) {
            String c = s2.substring(i,i+strLength);
            if (permutationCheck(s1, c)) {
                return true; // If any character in s1 is not in s2, return false
            }
         }
        return false;
}

    private boolean permutationCheck(String s1, String c) {
        System.out.println(s1 + " " + c);

        return s1.length() == c.length() &&
               Arrays.equals(s1.chars().sorted().toArray(), c.chars().sorted().toArray());
    }
    }
