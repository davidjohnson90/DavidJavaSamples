/**
 * 
 */
package com.david.java.debugging;

/**
 * @author David
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		long[][] arr = new long[2][];
		arr[0] = new long[2]; // new int[2] compile error // Type mismatch:
								// cannot convert from int[] to long[]
		arr[1] = new long[3];
		arr[0][1] = 015L;
		System.out.println(arr[0][1]);
	}
}
