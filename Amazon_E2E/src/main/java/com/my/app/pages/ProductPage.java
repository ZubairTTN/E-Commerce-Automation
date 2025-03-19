package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By addToCartB = By.id("a-autoid-3-announce");
    private By productTitle = By.xpath("");
    private By productPrice = By.xpath("");

    public ProductPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public String getProductTitle()
    {
        WebElement titleEle = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        return titleEle.getText().trim();
    }

    public String getProductPrize()
    {
        WebElement priceEle = wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice));
        return priceEle.getText().trim();
    }


    public void addToCartFunc() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartB)).click();
        Thread.sleep(2000);
    }
}
