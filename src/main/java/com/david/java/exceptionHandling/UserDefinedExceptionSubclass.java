/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class UserDefinedExceptionSubclass {
	public static void main(String[] args) {
		try {
			sum(-10, 10);
		} catch (DavidException de) {
			System.out.println(de);
		}
	}

	/**
	 * @param i
	 * @param j
	 */
	private static void sum(int i, int j) throws DavidException {
		if (i < 0) {
			throw new DavidException(i);
		} else {
			System.out.println(i + j);
		}
	}
}

class DavidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int i;

	/**
	 * 
	 */
	public DavidException(int i) {
		this.i = i;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return "DavidException: The number " + i + " is less than 0.";
	}
}