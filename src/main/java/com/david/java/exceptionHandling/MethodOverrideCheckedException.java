/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class MethodOverrideCheckedException extends SuperChecked {
	void show() /* throws Exception */{ // Compile Time Error
		System.out.println("Child Class...");
	}

	public static void main(String[] args) {
		SuperChecked checked = new SuperChecked();
		checked.show();
	}
}

class SuperChecked {
	void show() {
		System.out.println("Parent Class...");
	}
}