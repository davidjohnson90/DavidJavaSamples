package com.david.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple program to read and display the contents of a file using BufferedReader.
 * This program reads the contents of a file named "David.txt" and displays each line.
 * It uses BufferedReader and FileReader to efficiently read the file line by line.
 * <p>
 * Make sure the "David.txt" file is in the specified path.
 *
 * @author David
 */
public class ReadFileBufferedReader {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(ReadFileBufferedReader.class.getName());

    /**
     * The entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        try {
            // Define the file path
            File file = new File("src\\main\\resources\\David.txt");

            // Use try-with-resources to automatically close the reader when done
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;

                // Read and display each line of the file
                while ((line = reader.readLine()) != null) {
                    logger.log(Level.INFO, "Line: {0}", line);
                }
            } catch (IOException e) {
                // Handle any IO exceptions that occur during file reading
                logger.log(Level.SEVERE, "An error occurred while reading the file.", e);
            }
        } catch (Exception e) {
            // Handle any general exceptions that occur
            logger.log(Level.SEVERE, "An error occurred.", e);
        }
    }
}
