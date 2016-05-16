/**
 * 
 */
package com.david.java.generics;

/**
 * @author David
 *
 */
public class GenericMethodWithBoundedTypeParameter {
	public static void main(String[] args) {
		display("Hi, Am David...", 23);
		// display(23, "Hi, Am David...");
	}

	/**
	 * @param t
	 * @param v
	 */
	private static <T, V extends Number> void display(T t, V v) {
		System.out.println(t.getClass().getName() + " = " + t);
		System.out.println(v.getClass().getName() + " = " + v);
	}
}