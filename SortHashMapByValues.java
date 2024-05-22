package com.seleniumExamples2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValues {
	
	public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jack", 91);
        hashMap.put("Nancy", 89);
        hashMap.put("Bob", 73);
        hashMap.put("Kathy",24);
        hashMap.put("George", 37);
        

        // Convert the HashMap to a list of Map entries
        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());

        // Sort the list by values
        list.sort(Map.Entry.comparingByValue());

        // Put the sorted entries back into a LinkedHashMap to maintain the order
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("HashMap sorted by values:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
