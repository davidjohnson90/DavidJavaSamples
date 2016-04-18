package com.david.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author David
 *
 */
public class StringToFile {
	public static void main(String[] args) {
		String message = "Hi David";
		try {
			Files.write(Paths.get("src/main/resources/David.txt"), message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
