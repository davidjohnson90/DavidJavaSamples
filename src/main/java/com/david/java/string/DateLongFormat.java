package com.david.java.string;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.logging.Logger;

/**
 * This class demonstrates converting the current date and time to a long format using Joda-Time library.
 * The current date and time are obtained using DateTime.now().
 * The resulting DateTime object is then converted to a UTC timestamp in milliseconds.
 * <p>Author: David</p>
 */
public class DateLongFormat {
    private static final Logger logger = Logger.getLogger(DateLongFormat.class.getName());

    public static void main(String[] args) {
        // Specify the format pattern for the input date string
        String format = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);

        // Get the current date and time
        DateTime currentDateTime = DateTime.now();

        // Convert the current date and time to UTC timezone
        DateTime utcDateTime = currentDateTime.withZone(DateTimeZone.UTC);

        // Get the timestamp in milliseconds
        long timestamp = utcDateTime.getMillis();

        // Log the values
        logger.info("CurrentDateTime: " + currentDateTime);
        logger.info("CurrentDateTime in the 'yyyy-MM-dd HH:mm:ss' format: " + currentDateTime.toString(dateTimeFormatter));
        logger.info("Timestamp: " + timestamp);
    }
}
