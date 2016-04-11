/**
 * 
 */
package com.david.java.classInitialization;

/**
 * If a subclass does not declare a constructor, the compiler produces a
 * corresponding method that explicitly calls its superclass's default
 * no-argument method. Furthermore, for each subclass constructor that
 * explicitly calls a superclass constructor, the compiler inserts a call to the
 * superclass constructor's equivalent method at the start of the subclass's
 * method.
 * 
 * Following the call to a superclass's method, a subclass's method executes
 * byte code instructions for each subclass object field initializer and object
 * block initializer. Those byte code instructions execute the initializers in
 * the same order as they appear in source code. Furthermore, the byte code
 * instructions duplicate in each subclass constructor that calls a superclass
 * constructor
 * 
 * @author David
 *
 */
@SuppressWarnings("unused")
public class ObjectInitializationClassHierarchies extends ObjectParent {

	int a = 2;

	{
		System.out.println("a = " + ++a);
	}

	ObjectInitializationClassHierarchies() {
		System.out.println("Executing subclass constructor");
	}

	ObjectInitializationClassHierarchies(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		ObjectInitializationClassHierarchies hierarchies1 = new ObjectInitializationClassHierarchies();
		ObjectInitializationClassHierarchies hierarchies2 = new ObjectInitializationClassHierarchies(
				"Executing other subclass constructor");
	}
}

class ObjectParent {
	int x = 1;

	{
		System.out.println("x = " + ++x);
	}

	ObjectParent() {
		System.out.println("Executing superclass constructor");
	}
}
