/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.callback.observer;

import java.util.Observable;
import java.util.Scanner;

/**
 *
 * Class details
 * @author David
 *
 */
public class EventSource extends Observable implements Runnable {
  public void run() {
    while (true) {
      @SuppressWarnings("resource")
      String response = new Scanner(System.in).next();
      setChanged();
      notifyObservers(response);
    }
  }
}