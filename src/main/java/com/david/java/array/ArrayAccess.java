package com.david.java.array;

import java.util.logging.Logger;

/**
 * The ArrayAccess class demonstrates how to access elements of an array.
 *
 * @author David
 */
public class ArrayAccess {

    // Logger for logging array access information
    private static final Logger LOGGER = Logger.getLogger(ArrayAccess.class.getName());

    /**
     * The main method to start the application.
     * It creates an array of integers and demonstrates how to access its elements.
     *
     * @param args an array of command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        LOGGER.info("Array elements - 1st one is " + array[0]);
        LOGGER.info("Array elements - 2nd one is " + array[1]);
        LOGGER.info("Array elements - 3rd one is " + array[2]);
        LOGGER.info("Array elements - 4th one is " + array[3]);
        LOGGER.info("Array elements - 5th one is " + array[4]);
    }
}
