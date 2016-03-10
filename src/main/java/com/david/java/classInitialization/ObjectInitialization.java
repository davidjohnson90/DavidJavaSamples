/**
 * 
 */
package com.david.java.classInitialization;

/**
 * the initializers that perform object initialization mirror those initializers
 * that perform class initialization. As with class initialization, the simplest
 * kind of object initialization is automatic initialization of object fields to
 * default values.
 * 
 * @author David
 *
 */
public class ObjectInitialization {
	boolean b;
	byte by;
	char c;
	double d;
	float f;
	int i;
	long l;
	short s;
	String st;

	public static void main(String[] args) {
		ObjectInitialization objectInitialization = new ObjectInitialization();
		System.out.println("objectInitialization.b = " + objectInitialization.b);
		System.out.println("objectInitialization.by = " + objectInitialization.by);
		System.out.println("objectInitialization.c = " + objectInitialization.c);
		System.out.println("objectInitialization.d = " + objectInitialization.d);
		System.out.println("objectInitialization.f = " + objectInitialization.f);
		System.out.println("objectInitialization.i = " + objectInitialization.i);
		System.out.println("objectInitialization.l = " + objectInitialization.l);
		System.out.println("objectInitialization.s = " + objectInitialization.s);
		System.out.println("objectInitialization.st = " + objectInitialization.st);
	}
}
