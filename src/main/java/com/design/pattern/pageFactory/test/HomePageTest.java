package com.design.pattern.pageFactory.test;

import com.design.pattern.pageFactory.framework.TestContext;
import com.design.pattern.pageFactory.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest {
    private WebDriver driver;
    private TestContext testContext;

    @BeforeClass
    public void setUp() {
        // Create WebDriver instance (e.g., ChromeDriver)
        driver = new ChromeDriver();
        testContext = TestContext.getInstance(driver);
    }

    @Test
    public void testExample() {
        // Use TestContext to access page objects
        HomePage homePage = (HomePage) testContext.getHomePage();
        homePage.open();
        // Perform actions on the home page
    }

    @AfterClass
    public void tearDown() {
        // Close the browser and cleanup

    }
}
