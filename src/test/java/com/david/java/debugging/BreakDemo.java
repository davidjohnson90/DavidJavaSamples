/**
 * 
 */
package com.david.java.debugging;

/**
 * @author David
 *
 */
public class BreakDemo {
	public static void main(String[] args) {
		Boolean b = 21 >= 21;
		block1: {
			block2: {
				block3: {
					if (b)
						break block2;
					System.out.println("BLOCK3");
					break block3;
				}
				System.out.println("BLOCK2");
			}
			System.out.println("BLOCK1");
			break block1;
		}
	}
}