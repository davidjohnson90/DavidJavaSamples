package com.david.java.string;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates working with date values in Java.
 * It showcases date formatting, parsing, and obtaining the epoch time.
 * <p>Author: David</p>
 */
public class DateValue {
    private static final Logger logger = Logger.getLogger(DateValue.class.getName());

    /**
     * Main entry point of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Get the current date
        Date date = new Date();

        // Create a date formatter with the desired format
        Format formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");

        // Format the current date and log the formatted date
        String formattedDate = formatter.format(date);
        logger.info("Formatted Date: " + formattedDate);

        // Create a date formatter with another format
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        try {
            // Format the current date using the second format
            String today = simpleDateFormat.format(new Date());
            logger.info("Today: " + today);

            // Parse the formatted date string back to a Date object
            date = simpleDateFormat.parse(today);
            logger.info("Date: " + date);

            // Log the date in the simple date format and the current timezone
            logger.info("Date in simple date format: " + today);
            logger.info("Timezone: " + TimeZone.getDefault());
        } catch (ParseException e) {
            // Log any parse exception that occurs
            logger.log(Level.SEVERE, "Error occurred while parsing the date", e);
        }

        // Get the epoch time of the date and log it
        long epochTime = date.getTime();
        logger.info("Date in long milliseconds: " + epochTime);
    }
}
