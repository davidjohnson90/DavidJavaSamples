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
interface CallBack {
  void methodToCallBack();
}

class CallBackImpl implements CallBack {
  public void methodToCallBack() {
    System.out.println("I've been called back");
  }
}

class Caller {

  public void register(CallBack callback) {
    callback.methodToCallBack();
  }

  public static void main(String[] args) {
    Caller caller = new Caller();
    CallBack callBack = new CallBackImpl();
    caller.register(callBack);
  }
}