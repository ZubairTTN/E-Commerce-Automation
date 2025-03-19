package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
    public void checkCart() throws InterruptedException {
        WebElement cartB = wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton));
        Thread.sleep(3000);
        cartB.click();
    }

    public boolean PageLoadCheck()
    {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut)).isDisplayed();
    }

    public void checkOutFunc() throws InterruptedException {
        WebElement chechO = wait.until(ExpectedConditions.elementToBeClickable(checkOut));
        Thread.sleep(3000);
        chechO.click();
    }

    public boolean checkOutPageVerify() throws InterruptedException {
        Thread.sleep(3000);
        checkCart();
        return wait.until(ExpectedConditions.elementToBeClickable(checkOut)) != null;
    }



}
