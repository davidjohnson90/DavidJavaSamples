/**
 * 
 */
package com.david.java.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author David
 *
 */
public interface AddServerInterface extends Remote {
	public int sum(int a, int b) throws RemoteException;
}
