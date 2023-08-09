package com.david.java.data;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The AutoBoxedInteger class demonstrates the concept of autoboxing and caching of Integer objects in Java.
 * Author: David
 */
public class AutoBoxedInteger {

    private static final Logger logger = Logger.getLogger(AutoBoxedInteger.class.getName());

    public static void main(String args[]) {
        // When we assign an integer value to an Integer object, the value is
        // autoboxed into an Integer object
        Integer x = 400;
        Integer y = 400;
        if (x.equals(y)) {
            logger.log(Level.INFO, "x and y are Same");
        } else
            logger.log(Level.INFO, "x and y are Not Same");

        // In Java, values from -128 to 127 are cached, so the same objects are
        // returned. The implementation of valueOf() uses cached objects if the
        // value is between -128 to 127
        Integer a = 40, b = 40;
        if (a.equals(b))
            logger.log(Level.INFO, "a and b are Same");
        else
            logger.log(Level.INFO, "a and b are Not Same");

        // If we explicitly create Integer objects using new operator, we get
        // the output as "Not Same"
        Integer c = new Integer(40), d = new Integer(40);
        if (c.equals(d))
            logger.log(Level.INFO, "c and d are Same");
        else
            logger.log(Level.INFO, "c and d are Not Same");

        // In the above case, if we use value of, then the output is same.
        if (Integer.valueOf(c).equals(Integer.valueOf(d)))
            logger.log(Level.INFO, "Integer.valueOf(c) and Integer.valueOf(d) are Same");
        else
            logger.log(Level.INFO, "Integer.valueOf(c) and Integer.valueOf(d) are Not Same");
    }
}
