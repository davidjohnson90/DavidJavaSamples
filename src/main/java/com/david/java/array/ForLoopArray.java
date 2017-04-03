package com.david.java.array;

/**
 * @author David
 *
 */
public class ForLoopArray {
  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 50 };
    for (int i : array) {
      System.out.println(i);
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println("The element at " + i + " is " + array[i]);
    }
  }
}
