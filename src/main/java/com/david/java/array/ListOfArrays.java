/*******************************************************
 * Copyright (C) 2015-2016 TechMahindra
 * 
 * This file is part of DavidJavaSamples.
 * 
 * DavidJavaSamples can not be copied and/or distributed without the express permission.
 *******************************************************/
package com.david.java.array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Class details
 * @author David
 *
 */
public class ListOfArrays {
  public static void main(String[] args) {
    List<String[]> list = new ArrayList<String[]>();
    list.add(new String[] { "This", "is" });
    list.add(new String[] { "a", "test." });

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i).toString());
      String[] element = (String[]) list.get(i);

      boolean space = false;
      for (int j = 0; j < element.length; j++) {
        if (space) {
          System.out.print(" ");
        }

        System.out.print(element[j]);
        space = true;
      }
      System.out.print("\n");
    }
  }
}