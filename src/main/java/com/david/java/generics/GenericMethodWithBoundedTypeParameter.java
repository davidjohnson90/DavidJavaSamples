package com.david.java.generics;

import java.util.logging.Logger;

/**
 * A class demonstrating the use of a generic method with bounded type parameters.
 * This class showcases a method that can accept two different types with specific constraints.
 * In this example, the second type must be a subclass of Number.
 * The class also includes logging for better output management.
 *
 * @author David
 */
public class GenericMethodWithBoundedTypeParameter {

    private static final Logger LOGGER = Logger.getLogger(GenericMethodWithBoundedTypeParameter.class.getName());

    /**
     * The main method to demonstrate the GenericMethodWithBoundedTypeParameter class.
     * It calls the display method with different types to showcase the bounded type parameter.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        display("Hi, Am David...", 23);
        // display(23, "Hi, Am David..."); // This will not compile due to type constraint
    }

    /**
     * Displays the type and value of two objects, where the second object is bounded to be a subclass of Number.
     * The method uses logging for better output management.
     *
     * @param t   The first object.
     * @param v   The second object.
     * @param <T> The type of the first object.
     * @param <V> The type of the second object, which must be a subclass of Number.
     */
    private static <T, V extends Number> void display(T t, V v) {
        LOGGER.info("Type and value of first object: " + t.getClass().getName() + " = " + t);
        LOGGER.info("Type and value of second object: " + v.getClass().getName() + " = " + v);
    }
}
