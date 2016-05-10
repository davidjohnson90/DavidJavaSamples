/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class RunnableInterfaceThread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
	}
}

class MyThread implements Runnable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Concurrent Thread Started Running...");
	}
}