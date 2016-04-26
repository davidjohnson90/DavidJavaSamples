/**
 * 
 */
package com.david.java.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author David
 *
 */
public class TryWithoutResourceStatement {
	public static void main(String[] args) {
		try {
			String string;
			// opening file in read mode using BufferedReader stream
			BufferedReader bufferedReader = new BufferedReader(new FileReader(
					"D:\\David.txt"));
			while ((string = bufferedReader.readLine()) != null) {
				System.out.println(string);
			}
			bufferedReader.close(); // closing BufferedReader stream
		} catch (IOException ie) {
			System.out.println("exception");
		}
	}
}