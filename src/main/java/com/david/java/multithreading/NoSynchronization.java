/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class NoSynchronization {
	public static void main(String[] args) {
		First first = new First();
		Second second1 = new Second(first, "Welcome");
		Second second2 = new Second(first, "David");
		Second second3 = new Second(first, "Thread Classes");
		System.out.println(second1.message);
		System.out.println(second2.message);
		System.out.println(second3.message);
	}
}

class First {
	/**
	 * 
	 */
	public void display(String message) {
		System.out.println("[" + message);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread {
	String message;
	First firstObject;

	/**
	 * 
	 */
	public Second(First first, String string) {
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
		firstObject.display(message);
	}
}
