package com.david.java.propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertiesConfiguration {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Reading properties file in Java example
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("src/propertiesConfig.xml");

		// loading properites from properties file
		props.loadFromXML(fis);

		// reading proeprty
		String username = props.getProperty("zookeeper.connect");
		System.out.println("zookeeper.connect: " + username);
	}
}