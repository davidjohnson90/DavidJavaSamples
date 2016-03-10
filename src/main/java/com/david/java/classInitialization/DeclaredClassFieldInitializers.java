/**
 * 
 */
package com.david.java.classInitialization;

/**
 * 
 * Some programs require class fields to refer to previously declared class
 * fields. Java supports that activity by letting you specify the name of a
 * previously declared class field in the expression portion of a subsequently
 * declared class field's class field initializer
 * 
 * @author David
 *
 */
public class DeclaredClassFieldInitializers {
	static int first = 3;
	static int second = 1 + first;

	public static void main(String[] args) {
		System.out.println("first = " + first);
		System.out.println("second = " + second);
	}
}
