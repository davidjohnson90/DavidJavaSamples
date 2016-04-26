/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
public class StringBufferClass {
	static StringBuffer stringBuffer = new StringBuffer("Hello");

	public static void main(String[] args) {
		String string = "Hello";
		string.concat("David");
		System.out.println(string);

		System.out.println(stringBuffer.append("David"));
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.replace(5, 10, "Johnson"));
		System.out.println(stringBuffer.capacity());
		stringBuffer.ensureCapacity(32);
		System.out.println(stringBuffer.capacity());
	}
}