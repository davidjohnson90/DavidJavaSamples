/**
 * 
 */
package com.david.java.collections;

import java.util.HashSet;

/**
 * @author David
 *
 */
public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Arun");
		hashSet.add("Andrew");
		hashSet.add("David");
		hashSet.add("Johnson");
		hashSet.add("Sundarson");
		System.out.println(hashSet);
	}
}