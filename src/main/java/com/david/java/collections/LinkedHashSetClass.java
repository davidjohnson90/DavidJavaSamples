/**
 * 
 */
package com.david.java.collections;

import java.util.LinkedHashSet;

/**
 * @author David
 *
 */
public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<String>();
		hashSet.add("Arun");
		hashSet.add("Andrew");
		hashSet.add("David");
		hashSet.add("Johnson");
		hashSet.add("Sundarson");
		System.out.println(hashSet);
	}
}