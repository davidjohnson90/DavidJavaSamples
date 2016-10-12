/**
 * 
 */
package com.david.java.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @author David
 *
 */
public class PropertiesFile {
	private static final Logger LOGGER = Logger.getLogger(PropertiesFile.class
			.getName());

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties = getProperties("ServiceNow.properties");
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("hostname"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	}

	public static Properties getProperties(final String propertiesfileName) {
		Properties props = new Properties();
		String methodName = "PropertiesFile.getProperties()";
		try {
			File configDir = new File(
					"E:\\meridian_git\\meridian-cmdb-connector\\FixStreamConnectorDocuments\\Scripts\\Properties_Files");
			File configFile = new File(configDir, propertiesfileName);
			InputStream stream = new FileInputStream(configFile);

			props.load(stream);
			return props;

		} catch (FileNotFoundException fe) {
			LOGGER.info(methodName + " FileNotFoundException happned"
					+ fe.getMessage());

		} catch (IOException ioe) {
			LOGGER.info(methodName + " IOException happned" + ioe.getMessage());
		}
		return props;
	}
}