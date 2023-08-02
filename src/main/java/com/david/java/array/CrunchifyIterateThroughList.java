package com.david.java.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/**
 * CrunchifyIterateThroughList class demonstrates different ways to iterate through a list in Java.
 *
 * @author David
 */
public class CrunchifyIterateThroughList {

    // Logger for logging the output
    private static final Logger LOGGER = Logger.getLogger(CrunchifyIterateThroughList.class.getName());

    public static void main(String[] argv) {

        // create list
        List<String> crunchifyList = new ArrayList<>();

        // add 4 different values to list
        crunchifyList.add("eBay");
        crunchifyList.add("Paypal");
        crunchifyList.add("Google");
        crunchifyList.add("Yahoo");

        // iterate via "for loop"
        LOGGER.info("==> For Loop Example.");
        for (int i = 0; i < crunchifyList.size(); i++) {
            LOGGER.info(crunchifyList.get(i));
        }

        // iterate via "New way to loop"
        LOGGER.info("\n==> Advance For Loop Example..");
        for (String temp : crunchifyList) {
            LOGGER.info(temp);
        }

        // iterate via "iterator loop"
        LOGGER.info("\n==> Iterator Example...");
        Iterator<String> crunchifyIterator = crunchifyList.iterator();
        while (crunchifyIterator.hasNext()) {
            LOGGER.info(crunchifyIterator.next());
        }

        // iterate via "while loop"
        LOGGER.info("\n==> While Loop Example....");
        int i = 0;
        while (i < crunchifyList.size()) {
            LOGGER.info(crunchifyList.get(i));
            i++;
        }

        // collection stream() util: Returns a sequential Stream with this collection as its source
        LOGGER.info("\n==> Collection stream() util....");
        crunchifyList.forEach(LOGGER::info);
    }
}
