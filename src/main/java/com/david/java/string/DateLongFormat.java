/**
 * 
 */
package com.david.java.string;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * @author David
 *
 */
public class DateLongFormat {
	public static void main(String[] args) {
		String format = "yyyy-MM-dd HH:mm:ss";
		DateTimeFormatter sdf = DateTimeFormat.forPattern(format);

		DateTime d = sdf.parseDateTime("2016-09-06 17:53:16");
		DateTime date = d.withZone(DateTimeZone.UTC);
		long dt = date.getMillis();
		System.out.println(dt);
	}
}