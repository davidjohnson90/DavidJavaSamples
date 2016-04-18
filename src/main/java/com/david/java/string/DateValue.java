package com.david.java.string;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author David
 *
 */
public class DateValue {
	public static void main(String[] args) {
		Date date = new Date();
		Format formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
		System.out.println(formatter.format(date));
	}
}
