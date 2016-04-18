/**
 * 
 */
package com.david.java.inheritance.superKeyWord;

/**
 * @author David
 *
 */
public class ChildConstructor extends ParentConstructor {
	String name;

	/**
	 * @param n1
	 * @param n2
	 */
	public ChildConstructor(String n1, String n2) {
		super(n1);
		this.name = n2;
	}

	public static void main(String[] args) {
		ChildConstructor childConstructor = new ChildConstructor("Parent", "Child");
		childConstructor.details();
	}

	/**
	 * 
	 */
	private void details() {
		System.out.println(super.name + " and " + name);
	}
}

class ParentConstructor {
	String name;

	public ParentConstructor(String n) {
		name = n;
	}
}