package com.david.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A simple program to read a string input from the keyboard using BufferedReader.
 * This program demonstrates how to read a line of text from the keyboard and display it.
 * It utilizes BufferedReader to efficiently read user input.
 * The entered text is logged using a Logger.
 *
 * @author David
 */
public class StringInputFromKeyboard {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(StringInputFromKeyboard.class.getName());

    private static String text;

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an InputStreamReader to read input from the keyboard
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            // Read the text input from the user
            text = br.readLine();
        } catch (IOException e) {
            // Handle any IO exceptions that occur during input reading
            logger.log(Level.SEVERE, "An error occurred while reading input.", e);
        }

        // Display the entered text
        logger.log(Level.INFO, "Entered text: {0}", text);
    }
}
