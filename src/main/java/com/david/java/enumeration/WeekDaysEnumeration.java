package com.david.java.enumeration;

import java.util.logging.Logger;

/**
 * An enumeration representing different days of the week.
 */
enum WeekDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * A class to demonstrate the usage of week days enumeration.
 *
 * @author David
 */
public class WeekDaysEnumeration {
    /**
     * The main method to demonstrate week days enumeration usage.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(WeekDaysEnumeration.class.getName());

        WeekDays weekDays = WeekDays.WEDNESDAY;
        logger.info("Today is : " + weekDays);
    }
}
