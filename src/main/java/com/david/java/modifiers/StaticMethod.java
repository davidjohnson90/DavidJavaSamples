package com.david.java.modifiers;

public class StaticMethod {
	public static void main(String[] args) {
		square(8);
	}

	private static void square(int i) {
		System.out.println("The square of the number " + i + " is : " + i * i);
	}
}
