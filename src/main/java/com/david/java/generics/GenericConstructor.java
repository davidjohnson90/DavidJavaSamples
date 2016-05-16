/**
 * 
 */
package com.david.java.generics;

/**
 * @author David
 *
 */
public class GenericConstructor {
	private double val;

	<T extends Number> GenericConstructor(T obj) {
		val = obj.doubleValue();
	}

	void show() {
		System.out.println(val);
	}

	public static void main(String[] args) {
		GenericConstructor g1 = new GenericConstructor(100);
		GenericConstructor g2 = new GenericConstructor(120.5f);
		g1.show();
		g2.show();
	}
}
