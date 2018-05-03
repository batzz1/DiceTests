package com.dice;

import com.dice.Pages.LoginPage;
import com.dice.base.BaseTest;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void positiveLogInTest() {
        LoginPage loginPage = new LoginPage(driver);

        // Open Dice Login Page --> https://www.dice.com/dashboard/login
        loginPage.openLogInPage();

        // Fill Up Email and Password
        loginPage.fillUpEmailAndPassword("grv.sharma008@gmail.com","mslinux7");

        // Press SignIn Button and wait for profile to Load
        loginPage.pushSignInButton();

        // Verifications
        // -Verify Title of Page is correct -Seeker Dashboard - Profile
        // -Verify Correct Profile is loaded -Name


    }
}
