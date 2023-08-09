/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate method overriding and checked exceptions.
 * This example demonstrates that a subclass cannot override a method to throw a broader checked exception
 * than the exception thrown by the overridden method in the superclass.
 *
 * @author David
 */
public class MethodOverrideCheckedException extends SuperChecked {
    private static final Logger logger = Logger.getLogger(MethodOverrideCheckedException.class.getName());

    public static void main(String[] args) {
        SuperChecked checked = new SuperChecked();
        checked.show();
    }

    /**
     * Overrides the show method from the superclass.
     * Commented out throws clause due to compile-time error.
     */
    @Override
    void show() /* throws Exception */ { // Compile Time Error
        logger.info("Child Class...");
    }
}

/**
 * A superclass demonstrating method overriding.
 */
class SuperChecked {
    private static final Logger logger = Logger.getLogger(SuperChecked.class.getName());

    /**
     * Displays a message from the superclass.
     */
    void show() {
        logger.info("Parent Class...");
    }
}
