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
public class CharacterRead {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			char c = (char) reader.read();
			System.out.println(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
