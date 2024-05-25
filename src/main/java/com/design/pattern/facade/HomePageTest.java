package com.design.pattern.facade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase{
    @Test
    public void testajio() {
        testContext.getDriver().get("https://www.ajio.com");
        testContext.getDriver().findElement(By.id("loginAjio"));
    }
}
