package com.david.java.file;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * @author David
 *
 */
public class WriteStringToFile {
	public static void main(String[] args) {
		String string = "This is\na test";
		File file = new File("src/main/resources/test.txt");
		try {
			FileUtils.writeStringToFile(file, string);
			System.out.println("written to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
