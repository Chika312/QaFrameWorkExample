package org.example.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {
        String path = "src/main/resources/app.properties";
        try {
            FileInputStream stream = new FileInputStream(path);
            properties = new Properties();
            properties.load(stream);
            stream.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getValueFileProperties(String key ){
        return properties.getProperty(key);
    }
}
