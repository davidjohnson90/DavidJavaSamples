/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class MethodOverrideUnCheckedException extends SuperChecked {
	void show() throws ArrayIndexOutOfBoundsException { // ArrayIndexOutOfBoundsException
														// is an unchecked
														// exception
		System.out.println("Child Class...");
	}

	public static void main(String[] args) {
		SuperUnChecked unChecked = new SuperUnChecked();
		unChecked.show();
	}
}

class SuperUnChecked {
	void show() {
		System.out.println("Parent Class...");
	}
}