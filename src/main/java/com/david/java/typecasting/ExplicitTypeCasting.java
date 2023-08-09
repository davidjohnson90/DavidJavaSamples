package com.david.java.typecasting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The ExplicitTypeCasting class demonstrates explicit or narrowing type casting in Java.
 * Explicit type casting takes place when you are assigning a larger type value to a variable of smaller type.
 * Author: David
 */
public class ExplicitTypeCasting {
    private static final Logger logger = Logger.getLogger(ExplicitTypeCasting.class.getName());

    public static void main(String[] args) {
        double doubleValue = 100.04;
        long longValue = (long) doubleValue; // Explicit type casting required
        int integerValue = (int) longValue; // Explicit type casting required

        logger.log(Level.INFO, "Double value: {0}", doubleValue);
        logger.log(Level.INFO, "Long value: {0}", longValue);
        logger.log(Level.INFO, "Int value: {0}", integerValue);
    }
}
