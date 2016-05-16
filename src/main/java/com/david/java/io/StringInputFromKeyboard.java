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
public class StringInputFromKeyboard {
	private static String text;

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			text = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(text);
	}
}
