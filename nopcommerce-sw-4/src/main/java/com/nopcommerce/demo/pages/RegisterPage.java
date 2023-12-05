package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerTitle = By.xpath("//h1[normalize-space()='Register']");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By emailField = By.xpath("//input[@id='Email']");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationCompletedMessage = By.xpath("//div[@class='result']");
    By continueButtonAfterRegistrationCompletedMessage = By.xpath("//a[normalize-space()='Continue']");
    public String getRegisterTitle(){
        return gettextFromElement(registerTitle);
    }
    public void fillAllMandatoryFieldsToRegister(){
        sendTextToElement(firstNameField,"Disha");
        sendTextToElement(lastNameField, "Patel");
        sendTextToElement(emailField, "disha1234567@gmail.com");
        sendTextToElement(passwordField, "disha12345");
        sendTextToElement(confirmPasswordField, "disha12345");
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegistrationCompletedMessage(){
        return gettextFromElement(registrationCompletedMessage);
    }
    public void clickOnContinueButtonAfterRegistrationCompletedMessage(){
        clickOnElement(continueButtonAfterRegistrationCompletedMessage);
    }

}
