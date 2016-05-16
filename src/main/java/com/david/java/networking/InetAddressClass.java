/**
 * 
 */
package com.david.java.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author David
 *
 */
public class InetAddressClass {
	public static void main(String[] args) {
		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address);
			address = InetAddress.getByName("www.google.com");
			System.out.println(address);
			InetAddress sw[] = InetAddress
					.getAllByName("arundavidjohnson.blogspot.in");
			for (int i = 0; i < sw.length; i++) {
				System.out.println(sw[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}