package com.design.pattern.singleton.page;

import com.design.pattern.singleton.components.PageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class Homepage implements PageActions {
    private static final Logger logger = LoggerFactory.getLogger(Homepage.class);

    // WebDriver driver;
    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(id="loginAjio")
    WebElement SigninLink;

    @FindBy(xpath = "//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[1]/div[1]/div[2]/span[2]")
    WebElement viaGooofle;

    void click(WebElement element) {
        element.click();
    }
    public void setSigninLink() throws InterruptedException {
        click(SigninLink);
        Thread.sleep(2000);
        click(viaGooofle);
        Thread.sleep(5000);
    }



}

