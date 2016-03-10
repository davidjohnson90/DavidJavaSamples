/**
 * 
 */
package com.david.java.classInitialization;

/**
 * The explicit initialization of object fields to values. Each object field
 * explicitly initializes to a value via an object field initializer.
 * 
 * @author David
 *
 */
public class ObjectFieldInitializers {
	boolean b = true;
	byte by = 1;
	char c = 'A';
	double d = 1.2;
	float f = 3.4f;
	int i = 2;
	long l = 3;
	short s = 4;
	String st = "abc";

	public static void main(String[] args) {
		ObjectFieldInitializers objectFieldInitializers = new ObjectFieldInitializers();
		System.out.println("objectFieldInitializers.b = " + objectFieldInitializers.b);
		System.out.println("objectFieldInitializers.by = " + objectFieldInitializers.by);
		System.out.println("objectFieldInitializers.c = " + objectFieldInitializers.c);
		System.out.println("objectFieldInitializers.d = " + objectFieldInitializers.d);
		System.out.println("objectFieldInitializers.f = " + objectFieldInitializers.f);
		System.out.println("objectFieldInitializers.i = " + objectFieldInitializers.i);
		System.out.println("objectFieldInitializers.l = " + objectFieldInitializers.l);
		System.out.println("objectFieldInitializers.s = " + objectFieldInitializers.s);
		System.out.println("objectFieldInitializers.st = " + objectFieldInitializers.st);
	}
}
