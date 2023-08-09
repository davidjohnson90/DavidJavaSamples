package com.david.java.file;

import java.io.*;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * This class demonstrates reading properties from a properties file using the Properties class.
 * It also utilizes Java logging for improved output management.
 * <p>
 * Note: Make sure to provide the correct path to the properties file.
 *
 * @author David
 */
public class PropertiesFile {
    private static final Logger LOGGER = Logger.getLogger(PropertiesFile.class.getName());

    public static void main(String[] args) {
        Properties properties = getProperties("ServiceNow.properties");
        LOGGER.info(properties.getProperty("url"));
        LOGGER.info(properties.getProperty("hostname"));
        LOGGER.info(properties.getProperty("username"));
        LOGGER.info(properties.getProperty("password"));
    }

    /**
     * Reads properties from the specified properties file.
     *
     * @param propertiesFileName The name of the properties file.
     * @return A Properties object containing the loaded properties.
     */
    public static Properties getProperties(final String propertiesFileName) {
        Properties props = new Properties();
        String methodName = "PropertiesFile.getProperties()";
        try {
            File configDir = new File("E:\\meridian_git\\meridian-cmdb-connector\\FixStreamConnectorDocuments\\Scripts\\Properties_Files");
            File configFile = new File(configDir, propertiesFileName);
            InputStream stream = new FileInputStream(configFile);

            props.load(stream);
            return props;

        } catch (FileNotFoundException fe) {
            LOGGER.info(methodName + " FileNotFoundException happened: " + fe.getMessage());

        } catch (IOException ioe) {
            LOGGER.info(methodName + " IOException happened: " + ioe.getMessage());
        }
        return props;
    }
}
