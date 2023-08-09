package com.david.java.instanceofdemo;

import java.util.logging.Logger;

/**
 * A simple example to demonstrate downcasting and instanceof in Java.
 * This example showcases how to perform downcasting using instanceof and calling methods on the downcasted object.
 * It also demonstrates the use of JavaDoc comments, inline comments, and logging.
 * <p>
 * The main class creates a Parent instance but assigns it to a reference of type Child (upcasting).
 * Then, it calls a method in Child using downcasting and the instanceof operator.
 * <p>
 * To run this program, execute the main method.
 * Make sure to observe the output in the console.
 * <p>
 * Author: David
 */
public class DowncastingInstanceOf {
    private static final Logger LOGGER = Logger.getLogger(DowncastingInstanceOf.class.getName());

    /**
     * The entry point of the program. Creates a Parent instance and demonstrates downcasting using instanceof.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Parent parent = new Child();
        Child.show(parent);
    }
}

/**
 * The Parent class represents a base class.
 * <p>
 * Author: David
 */
class Parent {

}

/**
 * The Child class represents a derived class.
 * <p>
 * Author: David
 */
class Child extends Parent {
    private static final Logger LOGGER = Logger.getLogger(Child.class.getName());

    /**
     * Shows how to perform downcasting using the instanceof operator and calls the check() method.
     *
     * @param parent The Parent instance to be checked and downcasted.
     */
    public static void show(Parent parent) {
        if (parent instanceof Child) {
            Child child = (Child) parent; // Downcasting
            child.check();
        }
    }

    /**
     * Checks and displays a message if successful casting has occurred.
     */
    public void check() {
        LOGGER.info("Successful Casting...");
    }
}
