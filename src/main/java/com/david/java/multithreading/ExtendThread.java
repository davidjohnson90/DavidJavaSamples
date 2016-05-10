/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class ExtendThread extends Thread {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		System.out.println("Concurrent Thread Started Running... ");
	}

	public static void main(String[] args) {
		ExtendThread extendThread = new ExtendThread();
		extendThread.start();
	}
}