package com.david.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple program to demonstrate reading a single character from the console input.
 * This program reads a single character from the user's input and then displays it.
 * It showcases the use of BufferedReader and InputStreamReader for input.
 *
 * @author David
 */
public class CharacterRead {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(CharacterRead.class.getName());

    /**
     * The main method of the program.
     * It reads a single character from the console input and displays it.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            logger.info("Enter a character:");
            int charCode = reader.read(); // Read the ASCII value of the character

            // Convert the ASCII value to a character
            char character = (char) charCode;

            logger.log(Level.INFO, "Character entered: {0}", character);
            logger.log(Level.INFO, "ASCII value: {0}", charCode);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "An error occurred: {0}", e.getMessage());
        }
    }
}
