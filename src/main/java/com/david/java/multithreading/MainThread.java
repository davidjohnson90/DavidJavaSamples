/**
 * 
 */
package com.david.java.multithreading;

/**
 * @author David
 *
 */
public class MainThread {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		thread.setName("Main Thread");
		System.out.println("Name of thread is : " + thread);
	}
}
