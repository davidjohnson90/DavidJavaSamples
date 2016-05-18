/**
 * 
 */
package com.david.java.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author David
 *
 */
public class Adder extends UnicastRemoteObject implements AddServerInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Adder() throws RemoteException {
		super();
	}

	public int sum(int a, int b) {
		return a + b;
	}
}