/**
 * 
 */
package com.david.java.method;

/**
 * @author David
 *
 */
public class MethodOverloadingArgumentNumbers {
	public static void main(String[] args) {
		MethodOverloadingArgumentNumbers numbers = new MethodOverloadingArgumentNumbers();
		numbers.find(8, 5);
		numbers.find(4, 6, 2);
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
	private void find(int l, int b) {
		System.out.println("The area is : " + (l * b));
	}
}
