package com.design.pattern.pageFactory.page;

// HomePage.java
import com.design.pattern.pageFactory.pageInfra.Page;
import org.openqa.selenium.WebDriver;

public class HomePage implements Page {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        // Implement logic to open the home page
        driver.get("https://www.ajio.com");
    }

    // Implement other methods as needed
}
