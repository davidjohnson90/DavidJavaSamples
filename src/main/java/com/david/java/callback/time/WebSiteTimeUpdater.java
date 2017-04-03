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
// This is our client. It will be used in our WebSite example. It shall update
// the website's time every hour.
public class WebSiteTimeUpdater {

  public static void main(String[] args) {
    SystemTimer SystemTimer = new SystemTimer();
    TimeUpdaterCallBack webSiteCallBackUpdater = new WebSiteTimeUpdaterCallBack();
    SystemTimer.registerCallBackForUpdatesEveryHour(webSiteCallBackUpdater);
  }
}