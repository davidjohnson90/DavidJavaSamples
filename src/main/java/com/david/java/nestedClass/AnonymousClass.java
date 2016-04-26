/**
 * 
 */
package com.david.java.nestedClass;

/**
 * @author David
 *
 */
public class AnonymousClass {
	public static void main(String[] args) {
		Animal animal = new Animal() {

			@Override
			public void type() {
				System.out.println("Anonymous Animal...");
			}
		};
		animal.type();
	}
}

interface Animal {
	void type();
}