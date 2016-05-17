/**
 * 
 */
package com.david.java.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author David
 *
 */
public class HashTableClass {
	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
		hashtable.put("Arun", 26);
		hashtable.put("Andrew", 18);
		hashtable.put("David", 23);

		Set<Entry<String, Integer>> set = hashtable.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator
					.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
