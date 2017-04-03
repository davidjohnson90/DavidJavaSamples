/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.callback;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Class details
 * @author David
 *
 */
public class DavidListenerClass {
  public static void main(String[] args) {
    MyForm myForm = new MyForm();
    myForm.somethingHappened();
  }
}

interface MyListener {
  void somethingHappened();
}

class MyForm implements MyListener {
  public MyForm() {
    System.out.println("Am in MyForm constructor");
    MyClass myClass = new MyClass();
    myClass.addListener(this);
  }

  public void somethingHappened() {
    System.out.println("Called me!");
  }
}

class MyClass {
  private List<MyListener> listeners = new ArrayList<MyListener>();

  public void addListener(MyListener listener) {
    listeners.add(listener);
  }

  void notifySomethingHappened() {
    for (MyListener listener : listeners) {
      listener.somethingHappened();
    }
  }
}
