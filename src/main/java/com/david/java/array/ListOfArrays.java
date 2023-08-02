package com.david.java.array;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * The ListOfArrays class demonstrates how to use a list to store arrays of strings and print the elements of each array.
 *
 * @author David
 */
public class ListOfArrays {

    // Logger for logging the output
    private static final Logger LOGGER = Logger.getLogger(ListOfArrays.class.getName());

    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"This", "is"});
        list.add(new String[]{"a", "test."});

        for (int i = 0; i < list.size(); i++) {
            LOGGER.info(list.get(i).toString());
            String[] element = list.get(i);

            boolean space = false;
            for (int j = 0; j < element.length; j++) {
                if (space) {
                    System.out.print(" ");
                }

                System.out.print(element[j]);
                space = true;
            }
            System.out.print("\n");
        }
    }
}
