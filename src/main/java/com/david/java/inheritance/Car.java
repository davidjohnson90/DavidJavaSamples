package com.david.java.inheritance;

import java.util.logging.Logger;

/**
 * A simple example to demonstrate inheritance in Java.
 * This example showcases how a subclass (Car) inherits from a superclass (Vehicle) and uses the inherited and local members.
 * It also demonstrates the use of JavaDoc comments, inline comments, and logging.
 * <p>
 * This class defines a Car which inherits from the Vehicle class. It adds a "modelType" attribute and a method to display details.
 * The main method creates a Car instance and calls the showDetails() method.
 * <p>
 * To run this program, execute the main method.
 * Make sure to observe the output in the console.
 * <p>
 * Author: David
 */
public class Car extends Vehicle {
    private static final Logger LOGGER = Logger.getLogger(Car.class.getName());
    private String modelType;

    /**
     * The entry point of the program. Creates an instance of Car and calls the showDetails() method.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.showDetails();
    }

    /**
     * Displays the details of the car.
     */
    private void showDetails() {
        modelType = "Sports";
        vehicleType = "Car";
        LOGGER.info("The vehicle is a " + modelType + " " + vehicleType);
    }
}

/**
 * The Vehicle class represents a base class for different types of vehicles.
 * It contains a single member variable "vehicleType".
 * <p>
 * Author: David
 */
class Vehicle {
    protected String vehicleType; // Protected to be accessible by subclasses
}
