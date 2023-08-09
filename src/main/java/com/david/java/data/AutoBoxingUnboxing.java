package com.david.java.data;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The AutoBoxingUnboxing class demonstrates the concepts of autoboxing and unboxing in Java.
 * Author: David
 */
public class AutoBoxingUnboxing {

    private static final Logger logger = Logger.getLogger(AutoBoxingUnboxing.class.getName());

    public static void main(String[] args) {
        Integer integer = 100;
        int i = integer;
        logger.log(Level.INFO, "Autoboxed i is : {0} from {1}", new Object[]{i, integer});

        Character character = 'a';
        char c = character;
        logger.log(Level.INFO, "Autoboxed c is : {0} from {1}", new Object[]{c, character});

        Integer iob;
        iob = 100;
        logger.log(Level.INFO, "Unboxed iob: {0}", ++iob);
    }
}
