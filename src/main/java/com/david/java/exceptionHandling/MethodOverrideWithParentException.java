/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class MethodOverrideWithParentException extends SuperParent {
	void show() /* throws Exception */ { // CompileTime Error
		System.out.println("Child Class...");
	}

	public static void main(String[] args) {
		try {
			SuperParent superParent = new MethodOverrideWithParentException();
			superParent.show();
		} catch (Exception e) {
		}
	}
}

class SuperParent {
	void show() throws ArithmeticException {
		System.out.println("Parent Class...");
	}
}