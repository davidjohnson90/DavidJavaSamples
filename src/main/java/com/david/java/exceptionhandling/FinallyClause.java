/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate the usage of the finally clause in exception handling.
 *
 * @author David
 */
public class FinallyClause {
    /**
     * The main method to demonstrate the usage of the finally clause.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(FinallyClause.class.getName());

        int array[] = new int[2];
        logger.info("out of try");
        try {
            logger.info("Access invalid element" + array[3]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            logger.info("finally is always executed.");
        }
    }
}
