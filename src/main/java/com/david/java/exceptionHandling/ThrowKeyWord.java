/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class ThrowKeyWord {
	public static void main(String[] args) {
		avg();
	}

	/**
	 * 
	 */
	private static void avg() {
		try {
			throw new ArithmeticException("testException");
		} catch (ArithmeticException ae) {
			System.out.println("Exception caught");
		}
	}
}