package com.david.java.io;

import java.util.logging.Logger;

/**
 * A simple program to demonstrate the use of system properties in Java.
 * This program retrieves and displays the value of the "java.home" system property.
 * It showcases how to access system properties using the System class.
 *
 * @author David
 */
public class SystemProperties {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(SystemProperties.class.getName());

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Retrieve the value of the "java.home" system property
        String javaHome = System.getProperty("java.home");

        // Display the value of the "java.home" system property
        logger.info("java home is - " + javaHome);
    }
}
