package com.david.java.thisKeyword;

/**
 * @author David
 *
 */
public class ThisReturnCurrentObject {
	public ThisReturnCurrentObject() {
		this.getDisplay();
	}

	private ThisReturnCurrentObject getDisplay() {
		System.out.println(this);
		return this;
	}

	public static void main(String[] args) {
		new ThisReturnCurrentObject();
	}
}
