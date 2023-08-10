package com.david.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple program to demonstrate writing to a file using FileWriter in Java.
 * This program creates a file named "Arun.txt" in the resources directory
 * and writes a greeting message to it using FileWriter.
 * <p>
 * Note: Make sure the "src/main/resources" directory exists before running the program.
 *
 * @author David
 */
public class WriteFileUsingFileWriter {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(WriteFileUsingFileWriter.class.getName());

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Define the content to be written to the file
        String content = "Hi David, Welcome to File Writer...";

        // Specify the file path
        String filePath = "src/main/resources/Arun.txt";

        try {
            // Create a File object
            File file = new File(filePath);

            // Create a FileWriter object using try-with-resources
            try (FileWriter fileWriter = new FileWriter(file)) {
                // Write the content to the file
                fileWriter.write(content);
            }

            logger.info("File written successfully.");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred while writing to the file.", e);
        }
    }
}
