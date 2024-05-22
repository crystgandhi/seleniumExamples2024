package com.seleniumExamples2024;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Jack", 63);
        hashMap.put("Nancy", 89);
        hashMap.put("Bob", 45);
//Use TreeMap to sort the HashMap by keys
		TreeMap<String, Integer> sortedMap = new TreeMap<>(hashMap);
		System.out.println("HashMap sorted by keys:");
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
