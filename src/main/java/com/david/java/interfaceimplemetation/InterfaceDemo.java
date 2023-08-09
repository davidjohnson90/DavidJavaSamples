package com.david.java.interfaceimplemetation;

import java.util.logging.Logger;

import static com.david.java.interfaceimplemetation.InterfaceDemo.logger;

/**
 * The MoveableInterface interface defines the contract for moveable objects.
 * It includes a constant AVG_SPEED and a method move.
 * <p>
 * Author: David
 */
interface MoveableInterface {
    int AVG_SPEED = 40;

    void move();
}

/**
 * A simple example to demonstrate the implementation of an interface in Java.
 * This example showcases how to define an interface with constants and methods,
 * and how to implement that interface in a class.
 * <p>
 * The main class creates an instance of the Vehicle class and invokes its move method,
 * which is inherited from the MoveableInterface interface.
 * <p>
 * To run this program, execute the main method.
 * Make sure to observe the output in the console.
 * <p>
 * Author: David
 */
public class InterfaceDemo {
    static final Logger logger = Logger.getLogger(InterfaceDemo.class.getName());

    /**
     * The entry point of the program. Creates an instance of Vehicle and invokes its move method.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();
    }
}

/**
 * The Vehicle class implements the MoveableInterface interface.
 * It provides an implementation for the move method.
 * <p>
 * Author: David
 */
class Vehicle implements MoveableInterface {
    /**
     * Implements the move method from the MoveableInterface interface.
     * Displays the average speed defined by AVG_SPEED.
     */
    @Override
    public void move() {
        logger.info("The average speed is : " + AVG_SPEED);
    }
}
