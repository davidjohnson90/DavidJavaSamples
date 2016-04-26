/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("Hello");
		System.out.println(stringBuilder.append("David"));
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder.replace(5, 10, "Johnson"));
		System.out.println(stringBuilder.capacity());
		stringBuilder.ensureCapacity(32);
		System.out.println(stringBuilder.capacity());
	}
}
