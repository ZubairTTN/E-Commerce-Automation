package com.my.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeClass
    public void setUp()
    {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(600));
        driver.get("https://www.amazon.in");
    }

    @AfterClass
    public void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }

}
