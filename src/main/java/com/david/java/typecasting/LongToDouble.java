package com.david.java.typecasting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The LongToDouble class demonstrates implicit type casting from long to double in Java.
 * Author: David
 */
public class LongToDouble {
    private static final Logger logger = Logger.getLogger(LongToDouble.class.getName());

    public static void main(String[] args) {
        long longValue = 123456789L;

        logger.log(Level.INFO, "Long value: {0}", longValue);
        logger.log(Level.INFO, "Double value: {0}", (double) longValue);
    }
}