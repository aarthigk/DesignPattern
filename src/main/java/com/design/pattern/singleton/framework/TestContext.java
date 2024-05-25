package com.design.pattern.singleton.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class TestContext {
    private static TestContext instance;
    public WebDriver driver;

    private TestContext() {    }

    public static synchronized TestContext getInstance() {
        if (instance == null) {
            instance = new TestContext();
        }

        return instance;

    }

    public WebDriver getDriver(){
        if(driver==null){
            System.out.println("The driver is null here"+driver);
             driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            System.out.println("The driver is not null here"+driver);
        }
        else {
            System.out.println("not wokrin");
        }
        return driver;
    }



    public void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }

}
