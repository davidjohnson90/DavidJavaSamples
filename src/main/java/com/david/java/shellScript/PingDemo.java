package com.david.java.shellScript;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA. User: Admin Date: 7/2/15 Time: 5:24 PM To change
 * this template use File | Settings | File Templates.
 */
public class PingDemo {

	public static void main(String[] args) {
		PingDemo pingDemo = new PingDemo();
		String domainName = "google.com";
		// in mac os
		// String command = "ping -c 3 " + domainName;
		// in windows
		String command = "ping -n 3 " + domainName;
		String output = pingDemo.executeCommand(command);
		System.out.println(output);
	}

	private String executeCommand(String command) {
		StringBuffer output = new StringBuffer();
		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				output.append(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return output.toString();
	}
}
