package com.design.pattern.singleton.framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class TestBase {
    protected  WebDriver driver;
    protected static TestContext testContext;

    @BeforeClass
    public void setUpClass() {
        testContext = TestContext.getInstance();
        System.out.println("TestBase object"+testContext);
        driver = testContext.getDriver();
        System.out.println("Driver create"+driver);

    }
    @AfterClass
    public void tearDownClass() {
        TestContext.getInstance().closeDriver();
    }
}
