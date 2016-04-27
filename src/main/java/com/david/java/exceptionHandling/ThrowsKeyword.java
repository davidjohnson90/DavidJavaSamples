/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class ThrowsKeyword {
	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("caught" + e);
		}
	}

	/**
	 * 
	 */
	private static void check() throws ArithmeticException {
		System.out.println("Inside check function");
		throw new ArithmeticException("demo");
	}
}
