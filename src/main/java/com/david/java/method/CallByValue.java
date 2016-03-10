/**
 * 
 */
package com.david.java.method;

/**
 * @author David
 *
 */
public class CallByValue {
	public static void main(String[] args) {
		int x = 50;
		CallByValue value = new CallByValue();
		value.callByValue(x);
		System.out.println("The value of x is : " + x);
	}

	/**
	 * @param x
	 */
	private void callByValue(int x) {
		x = 100;
		System.out.println("The value of x in method is : " + x);
	}
}
