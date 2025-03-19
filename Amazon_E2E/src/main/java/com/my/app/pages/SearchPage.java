package com.my.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By products = By.xpath("(//div[@class='puisg-col-inner'])[14]");

    public SearchPage(WebDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public void selectProduct(int index)
    {
        List<WebElement> productL = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(products));
        if(productL.size() > index)
        {
            productL.get(index).findElement(By.xpath("(//div[@class='puisg-col-inner'])[7]")).click();
        }
    }

    private void scrollToElement(WebElement element)
    {
        ((JavascriptExecutor) driver).executeScript("argument[0].scrollIntoView(true)", element);
    }
}
