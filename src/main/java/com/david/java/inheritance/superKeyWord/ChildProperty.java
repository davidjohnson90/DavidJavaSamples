/**
 * 
 */
package com.david.java.inheritance.superKeyWord;

/**
 * @author David
 *
 */
public class ChildProperty extends ParentProperty {
	String name;

	public static void main(String[] args) {
		ChildProperty childProperty = new ChildProperty();
		childProperty.details();
	}

	/**
	 * 
	 */
	private void details() {
		super.name = "Parent";
		name = "Child";
		System.out.println(super.name + " and " + name);
	}
}

class ParentProperty {
	String name;
}