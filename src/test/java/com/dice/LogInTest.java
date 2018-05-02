package com.dice;

import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void positiveLogInTest() {
        // Open Dice Login Page --> https://www.dice.com/dashboard/login
        // Fill Up Email and Password
        // Press SignIn Button and wait for profile to Load
        // Verifications
        // -Verify Title of Page is correct -Seeker Dashboard - Profile
        // -Verify Correct Profile is loaded -Name
        driver.get("https://www.dice.com/dashboard/login");


    }
}
