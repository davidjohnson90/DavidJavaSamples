/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class Synchronization {
	public static void main(String[] args) {
		FirstSync firstSync = new FirstSync();
		SecondSync second1 = new SecondSync(firstSync, "Welcome");
		SecondSync second2 = new SecondSync(firstSync, "David");
		SecondSync second3 = new SecondSync(firstSync, "Thread Classes");
		System.out.println(second1.message);
		System.out.println(second2.message);
		System.out.println(second3.message);
	}
}

class FirstSync {
	/**
	 * 
	 */
	public void display(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class SecondSync extends Thread {
	String message;
	FirstSync firstObject;

	/**
	 * 
	 */
	public SecondSync(FirstSync first, String string) {
		firstObject = first;
		message = string;
		start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		synchronized (firstObject) {
			firstObject.display(message);
		}
	}
}