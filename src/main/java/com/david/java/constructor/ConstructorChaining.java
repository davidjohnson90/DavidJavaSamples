package com.david.java.constructor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates constructor chaining in Java.
 * It defines a ConstructorChaining class with two constructors.
 * The first constructor calls the second constructor using the this() keyword.
 * <p>
 * Constructor chaining is useful to avoid code duplication and to provide multiple
 * constructors with different arguments that share common initialization logic.
 * <p>
 * In this example, the first constructor calls the second constructor with a default integer value.
 * The second constructor prints the integer received as an argument.
 * <p>
 * Note: The this() keyword should be used carefully to avoid infinite loops in constructor calls.
 * Make sure to provide a valid argument to the second constructor when using constructor chaining.
 * <p>
 * Additionally, consider using a logging framework like java.util.logging or log4j
 * for more robust and configurable logging in larger applications.
 *
 * @author David
 */
public class ConstructorChaining {

    public ConstructorChaining() {
        this(10); // Call the second constructor with the default integer value 10
    }

    public ConstructorChaining(int i) {
        Logger logger = Logger.getLogger(ConstructorChaining.class.getName());
        logger.log(Level.INFO, "The integer called by constructorChaining is " + i);
    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
