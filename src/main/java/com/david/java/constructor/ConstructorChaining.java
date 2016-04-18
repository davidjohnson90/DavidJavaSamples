package com.david.java.constructor;

/**
 * @author David
 *
 */
public class ConstructorChaining {
	public ConstructorChaining() {
		this(10);
	}

	public ConstructorChaining(int i) {
		System.out.println("The integer called by constructorChaining is " + i);
	}

	public static void main(String[] args) {
		new ConstructorChaining();
	}
}
