package com.david.java.inheritance;

import java.util.logging.Logger;

/**
 * A simple example to demonstrate inheritance in Java.
 * This example showcases how a subclass (Child) inherits from a superclass (Parent) and calls methods from both classes.
 * It also demonstrates the use of JavaDoc comments, inline comments, and logging.
 * <p>
 * This class defines a Child which inherits from the Parent class. It adds a child1() method and calls parent1() method.
 * The main method creates a Child instance and demonstrates method calls.
 * <p>
 * To run this program, execute the main method.
 * Make sure to observe the output in the console.
 * <p>
 * Author: David
 */
public class Child extends Parent {
    private static final Logger LOGGER = Logger.getLogger(Child.class.getName());

    /**
     * The entry point of the program. Creates an instance of Child and calls child1() and parent1() methods.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.child1();
        child.parent1();
    }

    /**
     * Displays a message specific to the Child class using the logger.
     */
    private void child1() {
        LOGGER.info("Child method");
    }
}

/**
 * The Parent class represents a base class with a method parent1().
 * <p>
 * Author: David
 */
class Parent {
    private static final Logger LOGGER = Logger.getLogger(Parent.class.getName());

    /**
     * Displays a message specific to the Parent class using the logger.
     */
    public void parent1() {
        LOGGER.info("Parent method");
    }
}
