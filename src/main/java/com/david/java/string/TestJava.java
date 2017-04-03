/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
class A {

  {
    System.out.println("1");
  }

  public A() {
    System.out.println("2");
  }

  {
    System.out.println("3");
  }
}

public class TestJava {
  public static void main(String[] args) {
    new A();
    System.out.println('c' + 'e');
  }
}
