/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.callback.time;

/**
 *
 * Class details
 * @author David
 *
 */
// For example: Let's assume that this interface is offered from your OS to be implemented
interface TimeUpdaterCallBack {
  void updateTime(long time);
}

// this is your implementation.
// for example: You want to update your website time every hour
class WebSiteTimeUpdaterCallBack implements TimeUpdaterCallBack {

  @Override
  public void updateTime(long time) {
    // print the updated time anywhere in your website's example
    System.out.println(time);
  }
}