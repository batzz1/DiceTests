package com.dice.Pages;

import com.dice.base.BasePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject<LoginPage> {

    private static final String URL = "https://www.dice.com/dashboard/login";

    @FindBy(id = "email")
    private WebElement emailFeild;

    @FindBy(id = "password")
    private WebElement passwordFeild;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void openLogInPage() {
        getPage(URL);
    }
    public void fillUpEmailAndPassword(String email , String password) {
       sendKeys(email , emailFeild);
       sendKeys(password , passwordFeild);
    }
    public ProfilePage pushSignInButton() {
        signInButton.click();
        return new ProfilePage(driver);
    }

}
