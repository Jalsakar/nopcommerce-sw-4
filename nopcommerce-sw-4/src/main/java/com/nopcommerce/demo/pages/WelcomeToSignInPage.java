package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WelcomeToSignInPage extends Utility {
    By welcomePleaseSighInMessage = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkOutAsGuestBox = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By registerLink = By.xpath("//a[normalize-space()='Register']");
    public String getWelcomePleaseSignInMessage(){
        return gettextFromElement(welcomePleaseSighInMessage);
    }
    public void clickOnCheckOutAsGuestBox(){
        mouseHoverToElementAndClick(checkOutAsGuestBox);
    }

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
}
