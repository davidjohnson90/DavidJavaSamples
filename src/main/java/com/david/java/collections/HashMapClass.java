/**
 * 
 */
package com.david.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author David
 *
 */
public class HashMapClass {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Arun", 26);
		hashMap.put("Andrew", 18);
		hashMap.put("David", 23);

		Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}