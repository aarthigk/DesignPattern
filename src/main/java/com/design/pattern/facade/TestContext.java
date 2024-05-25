package com.design.pattern.facade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestContext {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void initializeDriver() {
        driver = new ChromeDriver();
    }

    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
