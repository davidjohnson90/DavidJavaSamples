/**
 * 
 */
package com.david.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author David
 *
 */
public class ReadFileBufferedReader {
	public static void main(String[] args) {
		try {
			File file = new File("src\\main\\resources\\David.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String string;
			while ((string = reader.readLine()) != null) {
				System.out.println(string);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}