/**
 * A simple class to demonstrate the use of a generic method that displays the type and value of two different objects.
 * This class showcases the concept of generics in Java.
 */
package com.david.java.generics;

import java.util.logging.Logger;

/**
 * The main class that contains the entry point and example usage of the GenericMethod.
 * It demonstrates a generic method that displays the type and value of two different objects.
 * <p>
 * This example showcases the use of a generic method to handle different types of parameters.
 * The method "display" accepts two parameters of different types and prints their types and values.
 * The type parameters are denoted by <V> and <T>.
 *
 * @author David
 */
public class GenericMethod {

    /**
     * The main method that demonstrates the usage of the GenericMethod class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        display(1, "Hi, Am David...");
    }

    /**
     * Displays the type and value of two objects.
     *
     * @param v   The first object.
     * @param t   The second object.
     * @param <V> The type of the first object.
     * @param <T> The type of the second object.
     */
    static <V, T> void display(V v, T t) {
        // Create a logger to handle the output
        Logger logger = Logger.getLogger(GenericMethod.class.getName());

        // Log the type and value of the first object
        logger.info(v.getClass().getName() + " = " + v);

        // Log the type and value of the second object
        logger.info(t.getClass().getName() + " = " + t);
    }
}
