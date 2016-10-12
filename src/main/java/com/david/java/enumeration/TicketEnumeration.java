/**
 * 
 */
package com.david.java.enumeration;

/**
 * @author David
 *
 */
public class TicketEnumeration {

	public static void main(String[] args) {
		System.out.println(TICKET_SEVERITY.MAJOR.getSeverity());
		System.out.println(TICKET_SEVERITY.MAJOR.getSeverityValue());
		System.out.println(TICKET_SEVERITY.getSeverityType(6));
	}

	public static enum TICKET_SEVERITY {
		CLEARED(1, "3 - Low"), INDETERMINATE(2, "3 - Low"), INFO(3, "3 - Low"), WARNING(
				4, "2 - Medium"), MINOR(5, "2 - Medium"), MAJOR(6, "1 - High"), CRITICAL(
				7, "1 - High");
		int severity;
		String severityValue;

		private TICKET_SEVERITY(int severity, String values) {
			this.severity = severity;
			this.severityValue = values;
		}

		public int getSeverity() {
			return severity;
		}

		public String getSeverityValue() {
			return severityValue;
		}

		public static String getSeverityType(int severity) {
			if (severity == TICKET_SEVERITY.CLEARED.getSeverity()) {
				return TICKET_SEVERITY.CLEARED.getSeverityValue();
			} else if (severity == TICKET_SEVERITY.INDETERMINATE.getSeverity()) {
				return TICKET_SEVERITY.INDETERMINATE.getSeverityValue();
			} else if (severity == TICKET_SEVERITY.INFO.getSeverity()) {
				return TICKET_SEVERITY.INFO.getSeverityValue();
			} else if (severity == TICKET_SEVERITY.WARNING.getSeverity()) {
				return TICKET_SEVERITY.WARNING.getSeverityValue();
			} else if (severity == TICKET_SEVERITY.MINOR.getSeverity()) {
				return TICKET_SEVERITY.MINOR.getSeverityValue();
			} else if (severity == TICKET_SEVERITY.MAJOR.getSeverity()) {
				return TICKET_SEVERITY.MAJOR.getSeverityValue();
			} else if (severity == TICKET_SEVERITY.CRITICAL.getSeverity()) {
				return TICKET_SEVERITY.CRITICAL.getSeverityValue();
			} else {
				return null;
			}
		}
	}
}
