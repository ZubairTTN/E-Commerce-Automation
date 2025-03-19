package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By cartButton = By.id("nav-cart-text-container");
    private By checkOut = By.xpath("//input[@name='proceedToRetailCheckout']");
    public CartPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }
    public void checkCart()
    {
        WebElement cartB = wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        cartB.click();
    }

    public boolean PageLoadCheck()
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut)).isDisplayed();
    }

    public void checkOutFunc()
    {
        WebElement chechO = wait.until(ExpectedConditions.elementToBeClickable(checkOut));
        chechO.click();
    }

    public boolean checkOutPageVerify()
    {
        checkCart();
        return wait.until(ExpectedConditions.elementToBeClickable(checkOut)) != null;
    }



}
