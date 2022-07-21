package com.syonet.driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverConfig {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
        @Override
        protected synchronized WebDriver initialValue() {
            return initDriver();
        }
    };

    private WebDriverConfig() {

    }

    public static WebDriver getDriver() {
        return threadDriver.get();
    }

    private static WebDriver initDriver() {
        WebDriver driver;
        driver = new ChromeDriver(new ChromeOptions().setHeadless(Properties.HEADLESS));
        return configureDriver(driver);
    }

    private static WebDriver configureDriver(WebDriver driver) {
        driver.manage().window().setSize(new Dimension(1280, 720));
        driver.get("http://the-internet.herokuapp.com/");
        return driver;
    }

    public static void killDriver() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        if (threadDriver != null) {
            threadDriver.remove();
        }
    }
}
