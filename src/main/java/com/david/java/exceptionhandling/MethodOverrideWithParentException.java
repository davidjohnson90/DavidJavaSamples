/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

import static com.david.java.exceptionhandling.MethodOverrideWithParentException.logger;

/**
 * A class to demonstrate method overriding with parent exception.
 * This example demonstrates that a subclass cannot override a method to throw checked exceptions
 * that are broader than the exceptions thrown by the overridden method in the superclass.
 *
 * @author David
 */
public class MethodOverrideWithParentException extends SuperParent {
    static Logger logger = Logger.getLogger(MethodOverrideWithParentException.class.getName());

    public static void main(String[] args) {
        try {
            SuperParent superParent = new MethodOverrideWithParentException();
            superParent.show();
        } catch (Exception e) {
            logger.severe("An exception occurred: " + e.getMessage());
        }
    }

    /**
     * Overrides the show method from the superclass.
     * Commented out throws clause due to compile-time error.
     */
    @Override
    void show() /* throws Exception */ { // CompileTime Error
        logger.info("Child Class...");
    }
}

/**
 * A superclass demonstrating method overriding.
 */
class SuperParent {
    /**
     * Displays a message from the superclass.
     * Throws ArithmeticException.
     */
    void show() throws ArithmeticException {
        logger.info("Parent Class...");
    }
}
