package com.david.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple program to demonstrate getting the ASCII value of a character.
 * This program takes input from the user, converts the first character to its ASCII value,
 * and then displays both the character and its ASCII value using logging.
 * <p>
 * Author: David
 */
public class ASCIIValue {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(ASCIIValue.class.getName());

    private static String string;

    /**
     * The main method of the program.
     * It reads a string from the user, converts the first character to its ASCII value,
     * and displays the character and its ASCII value using logging.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            // Read a string from the user
            string = reader.readLine();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading input: {0}", e.getMessage());
        }

        // Get the first character from the string
        char charValue = string.charAt(0);

        // Get the ASCII value of the character
        int ascii = Character.getNumericValue(charValue);

        // Log the character and its ASCII value
        logger.log(Level.INFO, "Character: {0}", charValue);
        logger.log(Level.INFO, "ASCII value: {0}", ascii);
    }
}
