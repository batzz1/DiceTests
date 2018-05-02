package com.dice;

import com.dice.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test
    public void firstTestMethod() {
        //Open dice.com
        driver.get("http://www.dice.com");
        Reporter.log("Dice Opened");
    }

}
