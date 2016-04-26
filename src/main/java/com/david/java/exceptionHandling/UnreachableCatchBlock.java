/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class UnreachableCatchBlock {
	public static void main(String[] args) {
		try {
			int array[] = { 1, 2 };
			array[2] = 3 / 0;
		} catch (ArrayIndexOutOfBoundsException e) // This block is unreachable
													// if it is listed below the
													// next block
		{
			System.out.println("array index out of bound exception");
		} catch (Exception e) // This block handles all Exception
		{
			System.out.println("Generic exception");
		}
	}
}
