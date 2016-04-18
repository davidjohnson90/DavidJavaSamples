package com.david.java.thisKeyword;

/**
 * @author David
 *
 */
public class ThisInitializeMember {

	Double width, height, breadth;

	public ThisInitializeMember(double w, double h, double b) {
		this.width = w;
		this.height = h;
		this.breadth = b;

		System.out.println(this.width * this.height * this.breadth);
	}

	public static void main(String[] args) {
		new ThisInitializeMember(10, 10, 10);
	}
}
