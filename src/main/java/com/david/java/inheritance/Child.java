/**
 * 
 */
package com.david.java.inheritance;

/**
 * @author David
 *
 */
public class Child extends Parent {

	public static void main(String[] args) {
		Child child = new Child();
		child.child1();
		child.parent1();
	}

	/**
	 * 
	 */
	private void child1() {
		System.out.println("Child method");
	}

}

class Parent {
	/**
	 * 
	 */
	public void parent1() {
		System.out.println("Parent method");
	}
}