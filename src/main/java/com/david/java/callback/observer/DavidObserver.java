/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.callback.observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * Class details
 * @author David
 *
 */
public class DavidObserver {
  public static void main(String[] args) {
    System.out.println("Enter Text: ");
    EventSource eventSource = new EventSource();

    eventSource.addObserver(new Observer() {
      public void update(Observable obj, Object arg) {
        System.out.println("Received response: " + arg);
      }
    });

    new Thread(eventSource).start();
  }
}