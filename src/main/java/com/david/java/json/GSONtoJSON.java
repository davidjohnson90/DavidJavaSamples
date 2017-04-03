/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.json;

import com.google.gson.Gson;

/**
 *
 * Class details
 * @author David
 *
 */
public class GSONtoJSON {
  private int data1 = 100;
  private String data2 = "hello";

  public static void main(String[] args) {
    GSONtoJSON obj = new GSONtoJSON();
    Gson gson = new Gson();

    // convert java object to JSON format
    String json = gson.toJson(obj);

    System.out.println(json);
  }

  /**
   * @return the data1
   */
  public int getData1() {
    return data1;
  }

  /**
   * @param data1 the data1 to set
   */
  public void setData1(int data1) {
    this.data1 = data1;
  }

  /**
   * @return the data2
   */
  public String getData2() {
    return data2;
  }

  /**
   * @param data2 the data2 to set
   */
  public void setData2(String data2) {
    this.data2 = data2;
  }
}
