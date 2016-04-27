/**
 * 
 */
package com.david.java.exceptionHandling;

/**
 * @author David
 *
 */
public class FinallyClause {
	public static void main(String[] args) throws Exception {
		int array[] = new int[2];
		System.out.println("out of try");
		try {
			System.out.println("Access invalid element" + array[3]);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally is always executed.");
		}
	}
}