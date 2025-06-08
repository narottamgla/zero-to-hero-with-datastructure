package org.slidingwindow;

import java.util.ArrayList;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        findAnagrams(s, p);
    }

    private static void findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
          System.out.println("No     anagrams found");
            return;
        }
        for (int i = 0; i <= s.length() - p.length(); i++) {
            String subString = s.substring(i, i + p.length());
            if (isAnagram(subString, p)) {
                System.out.println("Anagram found at index: " + i);
                System.out.println(subString);
            }
        }
    }


    private static boolean isAnagram(String s, String p) {
        if (s.length() < p.length()) {
            return false;
        }
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : p.toCharArray()) {
            characters.add(c);
        }
        for (char c : s.toCharArray()) {
            if (characters.contains(c)) {
                characters.remove((Character) c);
            } else {
                return false;
            }
        }
        return characters.isEmpty();
    }
}
