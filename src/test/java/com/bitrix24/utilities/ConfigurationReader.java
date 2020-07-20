package com.bitrix24.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static{ // Open the file to jvm memory with FileInputStream, file will close once try block complete
        try (FileInputStream fileInputStream = new FileInputStream("configuration.properties")) {
            properties = new Properties();
            // Load properties file into Properties object
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to locate configuration.properties file!");
        }
    }

    /**
     * This method returns property value from configuration.properties file
     * @param key property name
     * @return property value
     */
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

}
