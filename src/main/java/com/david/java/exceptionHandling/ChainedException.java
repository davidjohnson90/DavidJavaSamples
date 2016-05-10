/**
 * 
 */
package com.david.java.exceptionHandling;

import java.io.IOException;

/**
 * @author David
 *
 */
public class ChainedException {
	public static void main(String[] args) {
		try {
			divide(5, 0);
		} catch (ArithmeticException ae) {
			System.out.println("Caught : " + ae);
			System.out.println("Actual Cause : " + ae.getCause());
		}
	}

	/**
	 * @param i
	 * @param j
	 */
	private static void divide(int i, int j) {
		if (j == 0) {
			ArithmeticException arithmeticException = new ArithmeticException(
					"Exception Caught");
			arithmeticException
					.initCause(new IOException("Cause of divisor 0"));
			throw arithmeticException;
		} else {
			System.out.println(i / j);
		}
	}
}