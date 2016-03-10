package com.david.java.string;

/**
 * @author David
 *
 */
public class OverrideToString {
	public static void main(String[] args) {
		Complex complex = new Complex(10, 15);
		System.out.println(complex);
	}
}

class Complex {

	private double real, imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public String toString() {
		return String.format(real + " + i" + imaginary);
	}

}