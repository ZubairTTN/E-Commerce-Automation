package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By addToCartB = By.id("a-autoid-3-announce");

    public ProductPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public void addToCartFunc()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartB)).click();
    }
}
