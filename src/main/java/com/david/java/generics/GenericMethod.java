/**
 * 
 */
package com.david.java.generics;

/**
 * @author David
 *
 */
public class GenericMethod {
	public static void main(String[] args) {
		display(1, "Hi, Am David...");
	}

	/**
	 * @param v
	 * @param t
	 */
	static <V, T> void display(V v, T t) {
		System.out.println(v.getClass().getName() + " = " + v);
		System.out.println(t.getClass().getName() + " = " + t);
	}
}
