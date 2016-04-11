/**
 * 
 */
package com.david.java.method;

/**
 * @author David
 *
 */
public class MethodOverloadingTypeConversion {

	public static void main(String[] args) {
		MethodOverloadingTypeConversion conversion = new MethodOverloadingTypeConversion();
		conversion.find(8, 5);
		conversion.find(2, 4, 6);
	}

	/**
	 * @param l
	 * @param b
	 * @param h
	 */
	private void find(int l, int b, int h) {
		System.out.println("The area is : " + (l * b * h));
	}

	/**
	 * @param l
	 * @param b
	 */
	private void find(long l, long b) {
		System.out.println("The area is : " + (l * b));
	}
}
