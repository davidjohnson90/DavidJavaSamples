package com.david.java.propertiesFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesWrite {
	public static void main(String[] args) {

		Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("src/config.properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "david");
			prop.setProperty("dbpassword", "david");

			// save properties to project root folder
			prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
