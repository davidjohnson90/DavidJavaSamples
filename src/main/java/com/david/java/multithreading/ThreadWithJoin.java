/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class ThreadWithJoin extends Thread {
  public static void main(String[] args) {
    ThreadWithJoin thread1 = new ThreadWithJoin();
    ThreadWithJoin thread2 = new ThreadWithJoin();
    thread1.start();
    try {
      thread1.join();
    } catch (Exception e) {
      e.printStackTrace();
    }
    thread2.start();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Thread#run()
   */
  @Override
  public void run() {
    System.out.println("R1 " + Thread.currentThread().getName());
    try {
      Thread.sleep(500);
    } catch (Exception e) {
    }
    System.out.println("R2 " + Thread.currentThread().getName());
  }
}
