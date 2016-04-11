/**
 * 
 */
package com.david.java.classInitialization;

/**
 * When a class hierarchy is involved, the compiler creates a separate method
 * for each class in that hierarchy. At runtime, the JVM loads all hierarchy
 * classes and calls their methods in a top-to-bottom order. That means the
 * highest superclass's method (which is Object's method) executes first. After
 * Object's method completes, the next highest superclass's method executes. The
 * process continues in a top-down fashion until the class with the main()
 * method (if present) executes.
 * 
 * @author David
 *
 */

public class ClassHierarchyInitializer extends ClassParent {

	static int b = 2 + a;

	static {
		System.out.println("b = " + b);
		System.out.println("Child initializer");
		System.out.println("a = " + a);
	}

	public static void main(String[] args) {
		System.out.println("am in main");
	}
}

class ClassParent {
	static int a = 1;

	static {
		System.out.println("a = " + a);
		System.out.println("Parent initializer");
	}
}