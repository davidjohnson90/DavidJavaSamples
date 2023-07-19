package com.david.java.string;

import java.util.logging.Logger;

/**
 * This class represents an immutable class that stores a string value.
 *
 * <p>Author: David</p>
 */
public class ImmutableClass {
    private static final Logger logger = Logger.getLogger(ImmutableClass.class.getName());

    private final String string;

    /**
     * Constructs a new instance of ImmutableClass with the specified string value.
     *
     * @param s The string value to be stored in the object.
     */
    public ImmutableClass(String s) {
        this.string = s;
    }

    /**
     * The main method creates an instance of ImmutableClass and invokes the get() method.
     *
     * @param args The command-line arguments (unused).
     */
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass("Hi David");
        immutableClass.get();
    }

    /**
     * Retrieves the string value stored in the object.
     *
     * @return The string value.
     */
    public String get() {
        logger.info("String is: " + string);
        return string;
    }
}
