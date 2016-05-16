/**
 * 
 */
package com.david.java.io;

import java.io.File;
import java.io.FileWriter;

/**
 * @author David
 *
 */
public class WriteFileUsingFileWriter {
	public static void main(String[] args) {
		try {
			File file = new File("src\\main\\resources\\Arun.txt");
			String string = "Hi David, Welcome to File Writer...";
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(string);
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
