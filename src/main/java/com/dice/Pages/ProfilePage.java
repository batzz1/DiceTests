package com.dice.Pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePageObject<ProfilePage> {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='editProfile']")
    private WebElement editProfilebutton;

    @FindBy(xpath = "//h1[@class='profile-contact-name']" )
    private WebElement profileContactNameText;

    public void waitForProfilePageToLoad(){
       // waitForVisibilityOf(editProfilebutton);
    }

    public boolean isCorrectProfileLoaded(String correctProfileName) {
        return false;

    }
}
