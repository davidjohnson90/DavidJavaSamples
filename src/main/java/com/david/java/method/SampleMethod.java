/**
 * 
 */
package com.david.java.method;

/**
 * @author David
 *
 */
public class SampleMethod {

	public static void main(String[] args) {
		SampleMethod method = new SampleMethod();
		method.getSum(4, 3);
	}

	/**
	 * @param i
	 * @param j
	 */
	private void getSum(int i, int j) {
		System.out.println("The sum of the variables are ::: " + (i + j));
	}
}
