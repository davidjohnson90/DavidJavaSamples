/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int array[] = { 1, 2 };
			array[2] = 3 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index out of bound exception");
		} catch (ArithmeticException ae) {
			System.out.println("divide by zero");
		}
	}
}