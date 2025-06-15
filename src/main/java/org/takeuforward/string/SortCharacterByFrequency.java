package org.takeuforward.string;

import java.util.*;

public class SortCharacterByFrequency {


    public static void main(String[] args) {
        String s1 = "aaabbbaaabbbbcccccccdd";
        sortByOccurance(s1);
    }

    private static void sortByOccurance(String s1) {

        HashMap<Character , Integer> hm = new HashMap<>();

        for (Character c: s1.toCharArray()){
            hm.put(c,hm.getOrDefault(c,1)+1);
        }

        //sort map by values
        LinkedList<Map.Entry<Character,Integer>> linkedList = new LinkedList<>(hm.entrySet());

        Collections.sort(linkedList, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });


        LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();

        for (Map.Entry<Character,Integer> entry: linkedList){
         linkedHashMap.put(entry.getKey(),entry.getValue());
        }


        String finalString = "";
        System.out.println(linkedHashMap);
        for (Map.Entry<Character,   Integer> characterEntry: linkedHashMap.entrySet()){
            finalString=  finalString + String.valueOf(characterEntry.getKey()).repeat(characterEntry.getValue())+ " ";
        }

        System.out.println(finalString);
    }


}
