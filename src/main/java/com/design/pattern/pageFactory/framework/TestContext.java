package com.design.pattern.pageFactory.framework;

import com.design.pattern.pageFactory.page.HomePage;
import org.openqa.selenium.WebDriver;

public class TestContext {
    private static TestContext instance;
    private WebDriver driver;
    private HomePage homePage;

    // Add more page objects as needed

    private TestContext(WebDriver driver) {
        this.driver = driver;
        // Initialize page objects with the driver
        homePage = new HomePage(driver);
    }

    public static synchronized TestContext getInstance(WebDriver driver) {
        if (instance == null) {
            instance = new TestContext(driver);
        }
        return instance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return homePage;
    }


    public void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

