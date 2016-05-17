/**
 * 
 */
package com.david.java.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author David
 *
 */
public class TreeMapClass {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("Arun", 26);
		treeMap.put("Andrew", 18);
		treeMap.put("David", 23);

		Set<Map.Entry<String, Integer>> set = treeMap.entrySet();
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
