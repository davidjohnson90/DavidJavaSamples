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
public class TryWithResourceStatement {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(

				"D:\\David.txt"))) {
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (IOException ie) {
			System.out.println("exception");
		}
	}
}
