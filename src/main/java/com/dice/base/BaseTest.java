package com.dice.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    protected void methodSetUp() {
        System.out.println("Method SetUp");
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();

    }

    @AfterMethod
    protected void methodTearDown() {
        System.out.println("Method Tear Down");
        driver.quit();
    }

}
