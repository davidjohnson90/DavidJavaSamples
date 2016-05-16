/**
 * 
 */
package com.david.java.debugging;

/**
 * @author David
 *
 */
public class EnumTest {
	public static void main(String[] args) {
		byte a = -0x15;
		byte c = (byte) (a >> 2);
		// byte c = a >> 2; // compile error
		System.out.println(a + " " + c);
	}
}