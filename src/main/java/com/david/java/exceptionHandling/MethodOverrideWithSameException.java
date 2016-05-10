/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class MethodOverrideWithSameException extends SuperSame {
	void show() throws Exception {
		System.out.println("Child Class...");
	}

	public static void main(String[] args) {
		try {
			SuperSame superSame = new MethodOverrideWithSameException();
			superSame.show();
		} catch (Exception e) {
		}
	}
}

class SuperSame {
	void show() throws Exception {
		System.out.println("Parent Class...");
	}
}