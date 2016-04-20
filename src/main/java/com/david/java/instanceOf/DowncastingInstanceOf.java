/**
 * 
 */
package com.david.java.instanceOf;

/**
 * @author David
 *
 */
public class DowncastingInstanceOf {
	public static void main(String[] args) {
		Parent parent = new Child();
		Child.show(parent);
	}
}

class Parent {

}

class Child extends Parent {
	/**
	 * 
	 */
	public void check() {
		System.out.println("Successful Casting...");
	}

	public static void show(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			child.check();
		}
	}
}
