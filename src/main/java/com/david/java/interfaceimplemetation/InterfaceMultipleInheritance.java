/**
 * A simple example to demonstrate multiple inheritance using interfaces in Java.
 */
package com.david.java.interfaceimplemetation;

import java.util.logging.Logger;

/**
 * The Moveable interface defines the contract for moveable objects.
 */
interface Moveable {
    boolean isMoveable();
}

/**
 * The Rollable interface defines the contract for rollable objects.
 */
interface Rollable {
    boolean isRollable();
}

/**
 * The main class to demonstrate the multiple inheritance concept using interfaces.
 * It creates an instance of the Tyre class and calls methods from both Moveable and Rollable interfaces.
 * <p>
 * Author: David
 */
public class InterfaceMultipleInheritance {
    private static final Logger logger = Logger.getLogger(InterfaceMultipleInheritance.class.getName());

    /**
     * The entry point of the program. Creates an instance of Tyre and calls methods from Moveable and Rollable interfaces.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Tyre tyre = new Tyre();
        logger.info("Is Moveable? " + tyre.isMoveable());
        logger.info("Is Rollable? " + tyre.isRollable());
    }
}

/**
 * The Tyre class implements both Moveable and Rollable interfaces to achieve multiple inheritance.
 * It provides implementations for the isMoveable and isRollable methods.
 */
class Tyre implements Moveable, Rollable {

    /**
     * Implements the isRollable method from the Rollable interface.
     *
     * @return true, indicating that the tyre is rollable.
     */
    @Override
    public boolean isRollable() {
        return true;
    }

    /**
     * Implements the isMoveable method from the Moveable interface.
     *
     * @return true, indicating that the tyre is moveable.
     */
    @Override
    public boolean isMoveable() {
        return true;
    }
}
