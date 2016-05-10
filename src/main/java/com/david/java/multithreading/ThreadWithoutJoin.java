/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class ThreadWithoutJoin extends Thread {
	public static void main(String[] args) {
		ThreadWithoutJoin thread1 = new ThreadWithoutJoin();
		ThreadWithoutJoin thread2 = new ThreadWithoutJoin();
		thread1.start();
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