package com.dice.base;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject<T> {
    protected WebDriver driver;
    protected WebDriverWait wait;


    protected BasePageObject(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,40);
    }

    @SuppressWarnings("unchecked")
    protected T getPage(String url) {
        driver.get(url);
        return (T) this;
    }

    protected void sendKeys(String text , WebElement element) {
        sendKeys(text,element);
    }

    protected void waitForVisibilityOf(By locator , Integer... timeOutInSeconds) {
        int attempts = 0;
        while (attempts < 2) {
            try {
                    waitFor(ExpectedConditions.visibilityOfElementLocated(locator), timeOutInSeconds.length >0 ? timeOutInSeconds[0] :null);
                    break;
            } catch (StaleElementReferenceException e) { }
            attempts++;
        }
    }
    private void waitFor(ExpectedCondition<WebElement> condition , Integer timeOutInSeconds) {
            timeOutInSeconds = timeOutInSeconds !=null ? timeOutInSeconds : 30;
            WebDriverWait wait = new WebDriverWait(driver ,timeOutInSeconds);
            wait.until(condition);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    protected String getText(WebElement element) {
        return element.getText();
    }

}
