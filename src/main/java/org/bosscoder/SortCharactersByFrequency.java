package org.bosscoder;

import java.util.HashMap;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(sortByFrequency(s));
    }

    private static String sortByFrequency(String s) {

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (Character c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        StringBuilder sortedString = new StringBuilder();

        frequencyMap.entrySet().stream()
            .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
            .forEach(entry -> {
                for (int i = 0; i < entry.getValue(); i++) {
                    sortedString.append(entry.getKey());
                }
            });

        return sortedString.toString();
    }
}
