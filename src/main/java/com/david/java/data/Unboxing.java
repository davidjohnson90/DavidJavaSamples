package com.david.java.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Unboxing class demonstrates the concept of unboxing in Java.
 * Author: David
 */
public class Unboxing {

    private static final Logger logger = Logger.getLogger(Unboxing.class.getName());

    public static void main(String[] args) {
        Integer i = new Integer(-8);

        // 1. Unboxing through method invocation
        int absVal = absoluteValue(i);
        logger.log(Level.INFO, "Absolute value of {0} = {1}", new Object[]{i, absVal});

        List<Double> ld = new ArrayList<Double>();
        ld.add(3.1416); // Π is autoboxed through method invocation.

        // 2. Unboxing through assignment
        double pi = ld.get(0);
        logger.log(Level.INFO, "pi = {0}", pi);
    }

    /**
     * Calculates the absolute value of an integer.
     *
     * @param i The input integer.
     * @return The absolute value of the input integer.
     */
    public static int absoluteValue(int i) {
        return (i < 0) ? -i : i;
    }
}
