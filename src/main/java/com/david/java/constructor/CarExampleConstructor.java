package com.david.java.constructor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of constructors in Java.
 * It defines a CarExampleConstructor class with two instance variables: name and model.
 * The class contains a default constructor that initializes the name and model of the car.
 * <p>
 * Constructors are special methods that are called when an object is created.
 * The default constructor is automatically provided by Java if no other constructors are defined.
 * <p>
 * In this example, the default constructor sets the name to "Fiat" and the model to "Palio".
 * <p>
 * Note: It's a good practice to provide constructors to initialize the object's state with meaningful values.
 * <p>
 * Additionally, consider using a logging framework like java.util.logging or log4j
 * for more robust and configurable logging in larger applications.
 *
 * @author David
 */
public class CarExampleConstructor {
    String name;
    String model;

    /**
     * Default constructor for the CarExampleConstructor class.
     * Initializes the name and model of the car.
     */
    CarExampleConstructor() {
        name = "Fiat";
        model = "Palio";
    }

    public static void main(String[] args) {
        // Create an instance of CarExampleConstructor using the default constructor
        CarExampleConstructor carExampleConstructor = new CarExampleConstructor();

        // Print the name and model of the car
        Logger logger = Logger.getLogger(CarExampleConstructor.class.getName());
        logger.log(Level.INFO, "The name and model of the car is : " + carExampleConstructor.name + " " + carExampleConstructor.model);
    }
}
