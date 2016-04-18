/**
 * 
 */
package com.david.java.inheritance.superKeyWord;

/**
 * @author David
 *
 */
public class ChildMethods extends ParentMethods {
	String name;

	public void details() {
		super.details(); // calling Parent class details() method
		name = "Child";
		System.out.println(name);
	}

	public static void main(String[] args) {
		ChildMethods childMethods = new ChildMethods();
		childMethods.details();
	}
}

class ParentMethods {
	String name;

	public void details() {
		name = "Parent";
		System.out.println(name);
	}
}