/**
 * A simple class to demonstrate the use of a generic constructor.
 */
package com.david.java.generics;

import java.util.logging.Logger;

/**
 * The main class that contains the entry point and example usage of the GenericConstructor.
 * It creates instances of GenericConstructor using different numeric types.
 *
 * @author David
 */
public class GenericConstructor {
    private static final Logger LOGGER = Logger.getLogger(GenericConstructor.class.getName());

    private double val;

    /**
     * Constructs a GenericConstructor object with a value converted from a given numeric object.
     *
     * @param obj The numeric object from which the value is extracted.
     * @param <T> The type of the numeric object.
     */
    <T extends Number> GenericConstructor(T obj) {
        val = obj.doubleValue();
    }

    /**
     * The main method that demonstrates the usage of the GenericConstructor class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        GenericConstructor g1 = new GenericConstructor(100);
        GenericConstructor g2 = new GenericConstructor(120.5f);
        g1.show();
        g2.show();
    }

    /**
     * Displays the stored value.
     */
    void show() {
        LOGGER.info(String.valueOf(val));
    }
}
