package com.dice;

import com.dice.Pages.LoginPage;
import com.dice.Pages.ProfilePage;
import com.dice.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    private static final String expectedPageTitle = "Seeker Dashboard - Profile";

    @Test
    public void positiveLogInTest() {
        LoginPage loginPage = new LoginPage(driver);

        // Open Dice Login Page --> https://www.dice.com/dashboard/login
        loginPage.openLogInPage();

        // Fill Up Email and Password
        loginPage.fillUpEmailAndPassword("grv.sharma008@gmail.com", "mslinux7");

        // Press SignIn Button and wait for profile to Load
        ProfilePage profilePage = loginPage.pushSignInButton();
        profilePage.waitForProfilePageToLoad();

        // Verifications
        // -Verify Title of Page is correct -Seeker Dashboard - Profile
        String actualTitle = profilePage.getTitle();
        Assert.assertTrue(expectedPageTitle.equals(actualTitle), "Page Title is not expected ." +
                " \nExpected : " + expectedPageTitle + "\nActual : " + actualTitle);

        // -Verify Correct Profile is loaded -Name

       // Assert.assertTrue();


    }
}
