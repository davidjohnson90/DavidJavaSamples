package com.david.java.array;

import java.util.logging.Logger;

/**
 * The ForLoopArray class demonstrates different ways to iterate through an array in Java.
 *
 * @author David
 */
public class ForLoopArray {

    // Logger for logging the output
    private static final Logger LOGGER = Logger.getLogger(ForLoopArray.class.getName());

    /**
     * The main method to start the application.
     * It demonstrates two different ways to iterate through an array and logs the output.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        // Using for-each loop to iterate through the array
        LOGGER.info("==> Using For-each Loop:");
        for (int i : array) {
            LOGGER.info(String.valueOf(i));
        }

        // Using traditional for loop to iterate through the array
        LOGGER.info("\n==> Using Traditional For Loop:");
        for (int i = 0; i < array.length; i++) {
            LOGGER.info("The element at " + i + " is " + array[i]);
        }
    }
}
