package com.david.java.enumeration;

import java.util.logging.Logger;

/**
 * A class to demonstrate the usage of ticket enumeration and severity.
 *
 * @author David
 */
public class TicketEnumeration {

    /**
     * The main method to demonstrate ticket enumeration and severity usage.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TicketEnumeration.class.getName());

        logger.info("Ticket Severity: " + TICKET_SEVERITY.MAJOR.getSeverity());
        logger.info("Severity Value: " + TICKET_SEVERITY.MAJOR.getSeverityValue());
        logger.info("Severity Type for code 6: " + TICKET_SEVERITY.getSeverityType(6));
    }

    /**
     * An enumeration representing different ticket severities.
     */
    public static enum TICKET_SEVERITY {
        CLEARED(1, "3 - Low"), INDETERMINATE(2, "3 - Low"), INFO(3, "3 - Low"), WARNING(4, "2 - Medium"), MINOR(5, "2 - Medium"), MAJOR(6, "1 - High"), CRITICAL(7, "1 - High");

        private int severity;
        private String severityValue;

        /**
         * Constructs a new TICKET_SEVERITY with the given severity code and value.
         *
         * @param severity      The severity code.
         * @param severityValue The severity value.
         */
        private TICKET_SEVERITY(int severity, String severityValue) {
            this.severity = severity;
            this.severityValue = severityValue;
        }

        /**
         * Gets the severity type corresponding to a given severity code.
         *
         * @param severity The severity code.
         * @return The severity type as a String.
         */
        public static String getSeverityType(int severity) {
            for (TICKET_SEVERITY ticketSeverity : values()) {
                if (ticketSeverity.getSeverity() == severity) {
                    return ticketSeverity.getSeverityValue();
                }
            }
            return null;
        }

        /**
         * Gets the severity code of the ticket.
         *
         * @return The severity code.
         */
        public int getSeverity() {
            return severity;
        }

        /**
         * Gets the severity value of the ticket.
         *
         * @return The severity value.
         */
        public String getSeverityValue() {
            return severityValue;
        }
    }
}
