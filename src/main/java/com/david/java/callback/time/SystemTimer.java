/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.callback.time;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Class details
 * @author David
 *
 */
// This is the SystemTimer implemented by your Operating System (OS)
// You don't know how this timer was implemented. This example just
// show to you how it could looks like. How you could implement a
// callback by yourself if you want to.
class SystemTimer {

  List<TimeUpdaterCallBack> callbacks = new ArrayList<TimeUpdaterCallBack>();

  public void registerCallBackForUpdatesEveryHour(TimeUpdaterCallBack timerCallBack) {
    callbacks.add(timerCallBack);
  }

  // ... This SystemTimer may have more logic here we don't know ...

  // At some point of the implementaion of this SystemTimer (you don't know)
  // this method will be called and every registered timerCallBack
  // will be called. Every registered timerCallBack may have a totally
  // different implementation of the method updateTime() and my be
  // used in different ways by different clients.
  public void oneHourHasBeenExprired() {

    for (TimeUpdaterCallBack timerCallBack : callbacks) {
      timerCallBack.updateTime(System.currentTimeMillis());
    }
  }
}