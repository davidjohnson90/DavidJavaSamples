package com.david.java.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author David
 *
 */
public class PrintWriterExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File log = new File("src/main/resources/log.txt");
		try {
			if (log.exists() == false) {
				System.out.println("We had to make a new file.");
				log.createNewFile();
			}
			FileWriter out = new FileWriter(log, true);
			out.append("******* " + System.currentTimeMillis() + "******* "
					+ "\n");
			out.close();
		} catch (IOException e) {
			System.out.println("COULD NOT LOG!!");
		}
	}
}
