/**
 *
 */
package com.david.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author David
 */
public class ASCIIValue {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(ASCIIValue.class.getName());

    private static String string;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            string = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        char charValue = string.charAt(0);
        int ascii = Character.getNumericValue(charValue);// int ascii = (int) charValue;
        logger.log(Level.INFO, "Character: " + charValue);
        logger.log(Level.INFO, "ASCII value: " + ascii);
    }
}
