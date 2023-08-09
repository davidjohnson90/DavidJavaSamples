package com.david.java.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The AutoBoxing class demonstrates the concept of autoboxing and calculates the sum of odd and even numbers in a List of Integer objects.
 * Author: David
 */
public class AutoBoxing {

    private static final Logger logger = Logger.getLogger(AutoBoxing.class.getName());

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        for (int i = 1; i < 50; i += 2)
            li.add(i);

        logger.log(Level.INFO, "List of odd numbers: {0}", li.toString());
        sumOdd(li);
        sumEven(li);
    }

    /**
     * Calculates the sum of odd numbers in the given list.
     *
     * @param li The List of Integer objects.
     * @return The sum of odd numbers.
     */
    public static int sumOdd(List<Integer> li) {
        int sum = 0;
        for (Integer i : li)
            if (i % 2 != 0) sum += i;

        logger.log(Level.INFO, "Sum of odd numbers: {0}", sum);
        return sum;
    }

    /**
     * Calculates the sum of even numbers in the given list.
     *
     * @param li The List of Integer objects.
     * @return The sum of even numbers.
     */
    public static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i : li)
            if (i % 2 == 0) sum += i;

        logger.log(Level.INFO, "Sum of even numbers: {0}", sum);
        return sum;
    }
}
