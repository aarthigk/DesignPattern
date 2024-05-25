package com.design.pattern.facade;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    protected static TestContext testContext;

    @BeforeSuite
    public void setUp() {
        testContext = new TestContext();
        testContext.initializeDriver();
    }

    @AfterSuite
    public void tearDown() {
        testContext.closeDriver();
    }
}
