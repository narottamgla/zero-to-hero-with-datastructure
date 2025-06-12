package org.takeuforward.string;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class IsomorphicString {

    public static void main(String[] args) {
        String s1= "egg";
        String s2 = "add";

        boolean isIsomorphicString = isIsomorphicString(s1,s2);

        System.out.println(isIsomorphicString);

        ;
    }

    private static boolean isIsomorphicString(String s1, String s2) {
        return getOccurrances(s1).equals(getOccurrances(s2));
    }

    public static List<Integer> getOccurrances(String s1){
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s1.toCharArray()){
            hm.getOrDefault(c, hm.getOrDefault(c,1)+1);
        }
        return hm.values().stream().toList();

    }
}
