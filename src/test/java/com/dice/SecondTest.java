package com.dice;

import com.dice.base.BaseTest;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void secondTestMethod() {
        //Open LinkedIn
        driver.get("http://www.linkedin.com");
        Reporter.log("LinkedIn Opened");
        driver.quit();
    }
}
