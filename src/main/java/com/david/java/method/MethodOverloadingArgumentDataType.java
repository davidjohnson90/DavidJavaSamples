/**
 * 
 */
package com.david.java.method;

/**
 * @author David
 *
 */
public class MethodOverloadingArgumentDataType {
	public static void main(String[] args) {
		MethodOverloadingArgumentDataType dataType = new MethodOverloadingArgumentDataType();
		dataType.sum(8, 5);
		dataType.sum(4.6, 3.8);
	}

	/**
	 * @param d
	 * @param e
	 */
	private void sum(double d, double e) {
		System.out.println("The sum of double type arguments is : " + (d + e));
	}

	/**
	 * @param i
	 * @param j
	 */
	private void sum(int i, int j) {
		System.out.println("The sum of integer type arguments is : " + (i + j));
	}
}
