/**
 * 
 */
package com.david.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author David
 *
 */
public class ASCIIValue {
	private static String string;

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			string = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		char charValue = string.charAt(0);
		int ascii = (int) charValue;
		System.out.println(ascii);
	}
}
