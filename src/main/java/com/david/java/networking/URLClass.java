/**
 * 
 */
package com.david.java.networking;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author David
 *
 */
public class URLClass {
	public static void main(String[] args) {
		try {
			URL url = new URL(
					"http://arundavidjohnson.blogspot.in/2015/03/jenkinsjmeter.html");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
}
