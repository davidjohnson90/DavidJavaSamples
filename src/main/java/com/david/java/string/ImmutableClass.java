/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
public class ImmutableClass {
	String string;

	/**
	 * 
	 */
	public ImmutableClass(String s) {
		this.string = s;
	}

	public String get() {
		System.out.println("String is: " + string);
		return string;
	}

	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass("Hi David");
		immutableClass.get();
	}
}
