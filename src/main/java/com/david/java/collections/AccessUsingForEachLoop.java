/**
 * 
 */
package com.david.java.collections;

import java.util.ArrayList;

/**
 * @author David
 *
 */
public class AccessUsingForEachLoop {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Arun");
		arrayList.add("Andrew");
		arrayList.add("David");
		arrayList.add("Johnson");
		arrayList.add("Sundarson");

		for (String string : arrayList) {
			System.out.println(string);
		}
	}
}