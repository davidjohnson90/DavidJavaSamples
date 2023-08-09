package com.david.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class demonstrates how to write a string to a file using the Files class.
 * <p>
 * Note: Make sure to provide the correct path and file name.
 *
 * @author David
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
