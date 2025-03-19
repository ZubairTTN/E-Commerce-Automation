package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");
//    constructor
    public HomePage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isPageLoaded()
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).isDisplayed();
    }

    public void searchProduct(String productName)
    {
        WebElement searchField = wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        searchField.clear();
        searchField.sendKeys(productName);
        WebElement searchButt = wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton));
        searchButt.click();


    }

}
