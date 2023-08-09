/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate method overriding and unchecked exceptions.
 * This example demonstrates that a subclass can override a method to throw an unchecked exception
 * that is a subclass of the exception thrown by the overridden method in the superclass.
 *
 * @author David
 */
public class MethodOverrideUnCheckedException extends SuperChecked {
    private static final Logger logger = Logger.getLogger(MethodOverrideUnCheckedException.class.getName());

    public static void main(String[] args) {
        SuperUnChecked unChecked = new SuperUnChecked();
        unChecked.show();
    }

    /**
     * Overrides the show method from the superclass.
     * Throws ArrayIndexOutOfBoundsException, an unchecked exception that is a subclass of IndexOutOfBoundsException.
     */
    @Override
    void show() throws ArrayIndexOutOfBoundsException {
        logger.info("Child Class...");
    }
}

/**
 * A superclass demonstrating method overriding.
 */
class SuperUnChecked {
    private static final Logger logger = Logger.getLogger(SuperUnChecked.class.getName());

    /**
     * Displays a message from the superclass.
     */
    void show() {
        logger.info("Parent Class...");
    }
}
