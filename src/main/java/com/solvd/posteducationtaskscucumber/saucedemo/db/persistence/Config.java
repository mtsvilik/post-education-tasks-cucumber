package com.solvd.posteducationtaskscucumber.saucedemo.db.persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static final Logger LOGGER = LogManager.getLogger(Config.class);

    public static String DRIVER;
    public static String URL;
    public static String USER_NAME;
    public static String PASSWORD;
    public static Integer POOL_SIZE;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/_database.properties");
            Properties properties = new Properties();
            properties.load(fileInputStream);

            DRIVER = properties.getProperty("db.driver");
            URL = properties.getProperty("db.url");
            USER_NAME = properties.getProperty("db.user");
            PASSWORD = properties.getProperty("db.pass");
            POOL_SIZE = Integer.valueOf(properties.getProperty("db.poolSize"));
            fileInputStream.close();
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}
