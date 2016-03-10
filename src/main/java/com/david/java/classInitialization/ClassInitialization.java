package com.david.java.classInitialization;

/**
 * 
 * A program consists of classes. Before a Java application runs, Java's class
 * loader loads its starting class -- the class with a public static void
 * main(String [] args) method -- and Java's byte code verifier verifies the
 * class. Then that class initializes. The simplest kind of class initialization
 * is automatic initialization of class fields to default values.
 * 
 * @author David
 *
 */
public class ClassInitialization {
	static boolean b;
	static byte by;
	static char c;
	static double d;
	static float f;
	static int i;
	static long l;
	static short s;
	static String st;

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
