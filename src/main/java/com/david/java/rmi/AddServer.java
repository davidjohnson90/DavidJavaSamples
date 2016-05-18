/**
 * 
 */
package com.david.java.rmi;

import java.rmi.Naming;

/**
 * @author David
 *
 */
public class AddServer {
	public static void main(String args[]) {
		try {
			AddServerInterface addService = new Adder();
			Naming.rebind("AddService", addService);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}