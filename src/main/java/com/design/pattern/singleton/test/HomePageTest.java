package com.design.pattern.singleton.test;

import com.design.pattern.singleton.framework.PageManager;
import com.design.pattern.singleton.framework.TestBase;
import com.design.pattern.singleton.page.Homepage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HomePageTest extends TestBase{
    PageManager pageManager;
    Homepage homepage;

    @Test
    public void webSiteTest() throws InterruptedException {
        driver.get("https://www.ajio.com");
        pageManager = new PageManager(driver);
        homepage = pageManager.getHomePage();
        homepage.setSigninLink();
        assertTrue(driver.getTitle().contains("test"));
    }
}

