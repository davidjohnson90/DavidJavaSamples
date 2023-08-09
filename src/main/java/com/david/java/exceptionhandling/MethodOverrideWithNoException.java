/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

import static com.david.java.exceptionhandling.MethodOverrideWithNoException.logger;

/**
 * A class to demonstrate method overriding without exceptions.
 * This example demonstrates that a subclass can override a method that throws no checked exceptions
 * even if the superclass method declares exceptions.
 *
 * @author David
 */
public class MethodOverrideWithNoException extends SuperNo {
    static final Logger logger = Logger.getLogger(MethodOverrideWithNoException.class.getName());

    public static void main(String[] args) {
        try {
            SuperNo superNo = new MethodOverrideWithNoException();
            superNo.show();
        } catch (Exception e) {
            logger.severe("An exception occurred: " + e.getMessage());
        }
    }

    /**
     * Overrides the show method from the superclass.
     */
    @Override
    void show() {
        logger.info("Child Class...");
    }
}

/**
 * A superclass demonstrating method overriding.
 */
class SuperNo {
    /**
     * Displays a message from the superclass.
     * No exceptions are declared.
     */
    void show() {
        logger.info("Parent Class...");
    }
}
