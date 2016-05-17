/**
 * 
 */
package com.david.java.collections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author David
 *
 */
public class AccessUsingListIterator {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Arun");
		arrayList.add("Andrew");
		arrayList.add("David");
		arrayList.add("Johnson");
		arrayList.add("Sundarson");

		ListIterator<String> iterator = arrayList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}
}
