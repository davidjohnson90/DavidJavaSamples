package com.david.java.modifiers;

/**
 * @author David
 *
 */
public class FinalModifier {
	final int MAX_PRICE = 999; // final variable
	final int MIN_PRICE = 699;

	public FinalModifier() {
		display();
	}

	final void display() // final method
	{
		System.out.println("Max price is " + MAX_PRICE);
		System.out.println("Min price is " + MIN_PRICE);
	}

	public static void main(String[] args) {
		new FinalModifier();
	}
}
