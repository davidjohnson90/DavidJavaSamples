/**
 * This is the main class that demonstrates abstraction using an abstract class.
 */
package com.david.java.abstractclass;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The AbstractionUsingAbstractClass class contains the main method to demonstrate the concept of abstraction.
 * It creates an instance of the Car class, which is a subclass of the abstract Vehicle class, and invokes its engine method.
 *
 * @author David
 */
public class AbstractionUsingAbstractClass {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.engine();
    }
}

/**
 * The Vehicle class is an abstract class that represents a generic vehicle.
 * It defines an abstract method engine() that must be implemented by its subclasses.
 */
abstract class Vehicle {
    /**
     * This method represents the engine of the vehicle.
     * Subclasses must provide an implementation for this method.
     */
    public abstract void engine();
}

/**
 * The Car class is a subclass of Vehicle that represents a car.
 * It provides an implementation for the engine() method defined in the Vehicle class.
 */
class Car extends Vehicle {
    private static final Logger logger = Logger.getLogger(Car.class.getName());

    /**
     * This method overrides the engine() method from the Vehicle class.
     * It logs "Car Engine" using the java.util.logging.Logger instead of directly printing to the console.
     */
    @Override
    public void engine() {
        logger.log(Level.INFO, "Car Engine");
    }
}
