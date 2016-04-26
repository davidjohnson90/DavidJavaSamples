/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class TryCatch {
	public static void main(String[] args) {
		int a = 0;
		int b = 7;
		int c;
		try {
			c = b / a;
			System.out.println("This line wont be executed..." + c);
		} catch (Exception e) {
			System.out.println("Divided by Zero.");
		}
		System.out.println("After the exception is handled.");
	}
}