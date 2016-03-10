/**
 * 
 */
package com.david.java.classInitialization;

/**
 * there exists a situation in which you can declare a class hierarchy -- in
 * which each class has its own initializers -- and, when you construct an
 * object, no initializer executes. That situation arises when a subclass
 * constructor A calls another constructor B in the same subclass (via this).
 * From a JVM perspective, that implies that a corresponding <init> method A
 * calls <init> method B (in the same subclass). Java assumes that method B will
 * call either an <init> method that corresponds to a superclass constructor or
 * another subclass constructor's <init> method. As a result, <init> method A
 * begins with byte code instructions that call <init> method B. However,
 * following that call, <init> method A does not execute byte code instructions
 * that correspond to object field initializers and object block initializers.
 * Instead, it executes byte code instructions that correspond to
 * developer-specified Java source code. Method A doesn't need to execute those
 * instructions that correspond to initializers because Java expects another
 * constructor/<init> method (which calls a superclass constructor) to perform
 * that task. Without proper care, this scenario can lead to something quite
 * bizarre
 * 
 * @author David
 *
 */
public class ImproperObjectInizializationClassHierarchies extends ImproperObjectClassHierarchiesParent {
	int b = 1;

	{
		System.out.println("b = " + b);
	}

	ImproperObjectInizializationClassHierarchies() {
		// this(1); // Enabling this throws error
	}

	ImproperObjectInizializationClassHierarchies(int x) {
		this();
	}

	public static void main(String[] args) {
		System.out.println(new ImproperObjectInizializationClassHierarchies().a);
	}
}

class ImproperObjectClassHierarchiesParent {
	int a = 3;

	{
		System.out.println("a = " + a);
	}
}
