/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class MethodOverrideWithNoException extends SuperNo {
	void show() {
		System.out.println("Child Class...");
	}

	public static void main(String[] args) {
		try {
			SuperNo superNo = new MethodOverrideWithNoException();
			superNo.show();
		} catch (Exception e) {
		}
	}
}

class SuperNo {
	void show() throws Exception {
		System.out.println("Parent Class...");
	}
}