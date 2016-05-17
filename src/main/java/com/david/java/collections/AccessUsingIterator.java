/**
 * 
 */
package com.david.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author David
 *
 */
public class AccessUsingIterator {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Arun");
		arrayList.add("Andrew");
		arrayList.add("David");
		arrayList.add("Johnson");
		arrayList.add("Sundarson");

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
