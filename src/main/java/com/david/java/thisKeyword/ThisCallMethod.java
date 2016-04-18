package com.david.java.thisKeyword;

/**
 * @author David
 *
 */
public class ThisCallMethod {
	public ThisCallMethod() {
		this.getName();
		System.out
				.println("I am in constructor and I called a method with this.");
	}

	private void getName() {
		System.out.println("I am David");
	}

	public static void main(String[] args) {
		new ThisCallMethod();
	}
}
