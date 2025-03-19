package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By removeItemBut = By.cssSelector("input[value='Delete']");
    private By cartButton = By.id("nav-cart-text-container");
    private By checkOut = By.xpath("//input[@name='proceedToRetailCheckout']");

    public CartPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void checkCart() {
        WebElement cartB = wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        cartB.click();
    }

    public boolean PageLoadCheck() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut)).isDisplayed();
    }

    public void checkOutFunc() {
        WebElement checkO = wait.until(ExpectedConditions.elementToBeClickable(checkOut));
        checkO.click();
    }

    public void removeProduct() {
        checkCart();
        List<WebElement> buttons = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(removeItemBut));
        if (!buttons.isEmpty()) {
            buttons.get(0).click();
        }
    }

    public boolean checkOutPageVerify() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkOut)).isDisplayed();
    }
}
