package com.david.java.typecasting;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The ImplicitTypeCasting class demonstrates automatic or widening type casting in Java.
 * Automatic type casting takes place when the two types are compatible and the target type is larger than the source type.
 * Author: David
 */
public class ImplicitTypeCasting {
    private static final Logger logger = Logger.getLogger(ImplicitTypeCasting.class.getName());

    public static void main(String[] args) {
        int integerValue = 100;

        logger.log(Level.INFO, "Int value: {0}", integerValue);
        logger.log(Level.INFO, "Long value: {0}", (long) integerValue);
        logger.log(Level.INFO, "Float value: {0}", (float) integerValue);
    }
}
