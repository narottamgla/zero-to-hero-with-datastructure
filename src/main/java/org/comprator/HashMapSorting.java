package org.comprator;


import java.util.*;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 3);
        map.put("banana", 1);
        map.put("orange", 2);
        map.put("kiwi", 4);
        map.put("grape", 5);
        map.put("mango", 6);
        map.put("peach", 7);

        // Printing the original HashMap
        System.out.println("Original HashMap:");
        //map.forEach((key, value) -> System.out.println(key + ": " + value));

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Sorting the HashMap by keys
        System.out.println("\nSorted HashMap by keys:");
        LinkedList<Map.Entry<String, Integer>> sortedByKey = new LinkedList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sortedByKey.add(entry);
        }

        // Sort the list of entries by keys
        Collections.sort(sortedByKey, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        LinkedHashMap <String, Integer> sortedMapByKey = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : sortedByKey) {
            sortedMapByKey.put(entry.getKey(), entry.getValue());
        }

        // Printing the sorted HashMap by keys
        System.out.println("Sorted HashMap by keys:");
        sortedMapByKey.forEach((key, value) -> System.out.println(key + ": " + value));


        // Sorting the HashMap by values



    }
}
