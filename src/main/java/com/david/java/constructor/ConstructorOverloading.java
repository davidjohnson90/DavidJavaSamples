package com.david.java.constructor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates constructor overloading in Java.
 * It defines a ConstructorOverloading class with three constructors and an overridden toString() method.
 * The class represents a cricketer with name, team, and age properties.
 * <p>
 * Constructor overloading allows the class to be instantiated with different sets of arguments.
 * <p>
 * In this example, the class provides three constructors:
 * 1. Default constructor that initializes name, team, and age to default values.
 * 2. Parameterized constructor that initializes name, team, and age with provided values.
 * 3. Copy constructor that creates a new object by copying the values from another object.
 * <p>
 * The toString() method is overridden to provide a custom string representation of the cricketer object.
 * <p>
 * Note: The toString() method is automatically called when an object is used in a string context (e.g., print statements).
 * <p>
 * Additionally, consider using a logging framework like java.util.logging or log4j
 * for more robust and configurable logging in larger applications.
 * <p>
 * In this example, cricketer1 is created using the default constructor,
 * cricketer2 is created using the parameterized constructor,
 * and cricketer3 is created using the copy constructor by passing cricketer2 as an argument.
 *
 * @author David
 */
public class ConstructorOverloading {

    private String name;
    private String team;
    private int age;

    /**
     * Default constructor for the ConstructorOverloading class.
     * Initializes name, team, and age to default values.
     */
    public ConstructorOverloading() {
        name = "";
        team = "";
        age = 0;
    }

    /**
     * Parameterized constructor for the ConstructorOverloading class.
     * Initializes name, team, and age with provided values.
     *
     * @param name The name of the cricketer.
     * @param team The team of the cricketer.
     * @param age  The age of the cricketer.
     */
    public ConstructorOverloading(String name, String team, int age) {
        this.name = name;
        this.team = team;
        this.age = age;
    }

    /**
     * Copy constructor for the ConstructorOverloading class.
     * Creates a new object by copying the values from another cricketer object.
     *
     * @param cricketer2 The cricketer object to copy the values from.
     */
    public ConstructorOverloading(ConstructorOverloading cricketer2) {
        name = cricketer2.name;
        team = cricketer2.team;
        age = cricketer2.age;
    }

    public static void main(String[] args) {
        ConstructorOverloading cricketer1 = new ConstructorOverloading();
        ConstructorOverloading cricketer2 = new ConstructorOverloading("Sachin", "India", 32);
        ConstructorOverloading cricketer3 = new ConstructorOverloading(cricketer2);

        cricketer1.name = "Virat";
        cricketer1.team = "India";
        cricketer1.age = 30;

        Logger logger = Logger.getLogger(ConstructorOverloading.class.getName());
        logger.log(Level.INFO, "Cricketer 1 is " + cricketer1);
        logger.log(Level.INFO, "Cricketer 2 is " + cricketer2);
        logger.log(Level.INFO, "Cricketer 3 is " + cricketer3);
    }

    @Override
    public String toString() {
        return name + " of team " + team + " with the age of " + age;
    }
}
