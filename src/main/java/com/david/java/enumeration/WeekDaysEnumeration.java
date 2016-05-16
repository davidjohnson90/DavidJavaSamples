/**
 * 
 */
package com.david.java.enumeration;

/**
 * @author David
 *
 */
public class WeekDaysEnumeration {
	public static void main(String[] args) {
		WeekDays weekDays;
		weekDays = WeekDays.WEDNESDAY;
		System.out.println("Today is : " + weekDays);
	}
}

enum WeekDays {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}