/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class DeadLock {
	public static void main(String[] args) {
		final Pen pen = new Pen();
		final Paper paper = new Paper();

		Thread thread1 = new Thread() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Thread#run()
			 */
			@Override
			public void run() {
				synchronized (pen) {
					System.out.println("Thread1 is holding Pen");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						synchronized (paper) {
							System.out.println("Requesting for Paper");
						}
					}
				}
			}
		};

		Thread thread2 = new Thread() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see java.lang.Thread#run()
			 */
			@Override
			public void run() {
				synchronized (paper) {
					System.out.println("Thread2 is holding Paper");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						synchronized (pen) {
							System.out.println("Requesting for Pen");
						}
					}
				}
			}
		};
		thread1.start();
		thread2.start();
	}
}

class Pen {

}

class Paper {

}