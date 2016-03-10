package com.david.java.classInitialization;

/**
 * 
 * Explicit initialization of class fields to values. Each class field
 * explicitly initializes to a value via a class field initializer.
 * 
 * @author David
 * 
 */
public class ClassFieldInitializers {
	static boolean b = true;
	static byte by = 1;
	static char c = 'A';
	static double d = 1.2;
	static float f = 3.4f;
	static int i = 2;
	static long l = 3;
	static short s = 4;
	static String st = "abc";

	public static void main(String[] args) {
		System.out.println("b = " + b);
		System.out.println("by = " + by);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("f = " + f);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("s = " + s);
		System.out.println("st = " + st);
	}
}
