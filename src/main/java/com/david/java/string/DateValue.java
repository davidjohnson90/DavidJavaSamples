package com.david.java.string;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author David
 *
 */
public class DateValue {
  public static void main(String[] args) {
    Date date = new Date();
    Format formatter = new SimpleDateFormat("YYYY-MM-dd_hh-mm-ss");
    System.out.println(formatter.format(date));

    // String someDate = "2016-08-26 04:12:04";

    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");/*
                                                                        * "MM.dd.yyyy" ) ;
                                                                        */
    try {
      String someDate = sdf.format(new Date());
      System.out.println("some date + " + someDate);
      // sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
      date = sdf.parse(someDate);
      System.out.println(date + " ::: " + someDate + " ::: " + TimeZone.getDefault());
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(date.getTime());
  }
}