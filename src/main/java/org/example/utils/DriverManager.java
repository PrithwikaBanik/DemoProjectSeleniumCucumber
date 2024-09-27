package org.example.utils;

import org.example.config.BrowserFactory;
import org.example.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {
    private static final Logger logger = LoggerFactory.getLogger(DriverManager.class);
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            String browserName = ConfigurationManager.getProperty("browser");
            logger.info("Initializing {} driver", browserName);
            try {
                driver.set(BrowserFactory.createDriver(browserName));
            } catch (IllegalArgumentException e) {
                logger.error("Failed to create driver: {}", e.getMessage());
                throw new RuntimeException("Driver initialization failed", e);
            }
        }
        return driver.get();
    }

    public static void quitDriver() {
        WebDriver webDriver = driver.get();
        if (webDriver != null) {
            logger.info("Quitting WebDriver");
            webDriver.quit();
            driver.remove();
        }
    }
}