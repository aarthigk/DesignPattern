package com.design.pattern.singleton.components;

import org.openqa.selenium.WebElement;

public interface PageActions {
    public interface WebDriverActions {
        void click(WebElement element);
        void navigateTo(String url);
        // Add more methods as needed
    }
}
