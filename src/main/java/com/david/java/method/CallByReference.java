/**
 * 
 */
package com.david.java.method;

/**
 * @author David
 *
 */
public class CallByReference {

	int x = 10;
	int y = 20;

	public static void main(String[] args) {
		CallByReference reference = new CallByReference();
		System.out.println(
				"Before calling the method, the values of x and y are : " + reference.x + " and " + reference.y);
		reference.callByReference(reference);
		System.out.println(
				"After calling the method, the values of x and y are : " + reference.x + " and " + reference.y);

	}

	/**
	 * @param reference
	 */
	private void callByReference(CallByReference reference) {
		reference.x = 50;
		reference.y = 100;
	}
}
