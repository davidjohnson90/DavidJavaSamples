/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class NestedTry {
	public static void main(String[] args) {
		try {
			int array[] = { 5, 0, 1, 2 };
			try {
				int x = array[3] / array[1];
				System.out.println("The result is : " + x);
			} catch (ArithmeticException ae) {
				System.out.println("divide by zero");
			}
			array[4] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		}
	}
}