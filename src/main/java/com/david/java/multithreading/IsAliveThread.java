/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class IsAliveThread extends Thread {
	public static void main(String[] args) {
		IsAliveThread thread1 = new IsAliveThread();
		IsAliveThread thread2 = new IsAliveThread();
		thread1.start();
		thread2.start();
		System.out.println(thread1.isAlive());
		System.out.println(thread2.isAlive());
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
		} catch (InterruptedException e) {
		}
		System.out.println("R2 " + Thread.currentThread().getName());
		super.run();
	}
}