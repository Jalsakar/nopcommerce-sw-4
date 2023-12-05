package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LogInPage extends Utility {
    By loginLink = By.xpath("//a[normalize-space()='Log in']");
    By loginEmailField = By.xpath("//input[@id='Email']");
    By loginPasswordField = By.xpath("//input[@id='Password']");
    By loginButtonOnLoginPage = By.xpath("//button[normalize-space()='Log in']");
    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void fillLoginDetailsOnLoginPage(){
        sendTextToElement(loginEmailField, "disha1234567@gmail.com");
        sendTextToElement(loginPasswordField, "disha12345");
    }
    public void clickOnLoginButtonOnLoginPage(){
        clickOnElement(loginButtonOnLoginPage);
    }
}
