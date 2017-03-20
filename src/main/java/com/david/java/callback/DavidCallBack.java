/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.callback;

/**
 *
 * Class details
 * @author David
 *
 */
public class DavidCallBack {
  public static void main(String[] args) {
    Boss boss = new Boss();
    boss.directMethod();
  }
}

interface Callable {
  public void callBackMethod();
}

class Worker {
  // Worker gets a handle to the boss object via the Callable interface.
  // There's no way this worker class can call any other method other than
  // the one in Callable.
  public void doSomeWork(Callable myBoss) {
    myBoss.callBackMethod();
    // ERROR!
    // myBoss.directMethod();
  }
}

class Boss implements Callable {
  public Boss() {
    // Boss creates a worker object, and tells it to do some work.
    Worker w1 = new Worker();
    // Notice, we're passing a reference of the boss to the worker.
    w1.doSomeWork(this);
  }

  public void callBackMethod() {
    System.out.println("What do you want?");
  }

  public void directMethod() {
    System.out.println("I'm out for coffee.");
  }
}
