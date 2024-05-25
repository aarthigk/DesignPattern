package com.design.pattern.singleton.framework;

import com.design.pattern.singleton.page.Homepage;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageManager {

    private static final Logger logger = LoggerFactory.getLogger(PageManager.class);
    private final WebDriver driver;
    private Homepage HomePage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public Homepage getHomePage(){
        return (HomePage == null) ? HomePage = new Homepage(driver) : HomePage;
    }

}
