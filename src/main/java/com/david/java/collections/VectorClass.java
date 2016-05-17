/**
 * 
 */
package com.david.java.collections;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author David
 *
 */
public class VectorClass {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();
		vector.add("Arun");
		vector.add("Andrew");
		vector.add("David");
		vector.add("Johnson");
		vector.add("Sundarson");

		Enumeration<String> enumeration = vector.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}