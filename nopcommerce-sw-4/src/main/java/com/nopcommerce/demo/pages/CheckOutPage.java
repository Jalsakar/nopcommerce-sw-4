package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    //Fill the all mandatory fields
    By firstNameField = By.id("BillingNewAddress_FirstName");
    By lastNameField = By.id("BillingNewAddress_LastName");
    By emailField = By.id("BillingNewAddress_Email");
    By countryField = By.id("BillingNewAddress_CountryId");
    By cityField = By.id("BillingNewAddress_City");
    By addressFirstField = By.id("BillingNewAddress_Address1");
    By zipPostalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By shippingMethodRadioButton = By.xpath("//input[@id='shippingoption_1']");
    By continueButtonInShippingMethod = By.cssSelector(".button-1.shipping-method-next-step-button");
    By creditCardRadioButton = By.id("paymentmethod_1");
    By dropDownSelectCard = By.xpath("//select[@id='CreditCardType']");
    By continueButtonOnCreditCard = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardDropdownLocator = By.id("CreditCardType");

    By clickOnCreditCardContinueButton = By.cssSelector(".button-1.payment-info-next-step-button");
    By paymentMethodInfo = By.xpath("//li[@class='payment-method']//span[2]");
    By nextDayAirShipping = By.xpath("//li[@class='shipping-method']//span[2]");
    By secondDayAirShipping = By.xpath("//input[@id='shippingoption_2'])[1]");
    By totalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessfullyProceedMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonAfterOrderSuccessfullyProceedMessage = By.xpath("//button[normalize-space()='Continue']");

//Fill the all mandatory field
//    public void firstName(String name){
//        sendTextToElement(firstNameField, name);
//    }
    public void fillAllMandatoryFields() {
        sendTextToElement(firstNameField, "Disha");
        sendTextToElement(lastNameField, "Patel");
        sendTextToElement(emailField, "disha1234567@gmail.com");
        selectByContainsTextFromDropDown(countryField, "India");
        sendTextToElement(cityField, "Ahmedabad");
        sendTextToElement(addressFirstField, "512,Sky Land");
        sendTextToElement(zipPostalCodeField, "320008");
        sendTextToElement(phoneNumberField, "092 27 490819");
    }
    //Click on “CONTINUE”

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
    //Click on Radio Button “Next Day Air($0.00)”

    public void clickOnShippingMethodRadioButton() {
        clickOnElement(shippingMethodRadioButton);
    }
    //Click on “CONTINUE”

    public void clickOnContinueButtonInShippingMethod() {
        clickOnElement(continueButtonInShippingMethod);
    }
    //Select Radio Button “Credit Card”

    public void clickOnCreditCardRadioButton() { clickOnElement(creditCardRadioButton);}
    //Click on “CONTINUE”

    public void clickOnContinueButtonOnCreditCard() {
        clickOnElement(continueButtonOnCreditCard);
    }
    //Select “Master card” From Select credit card dropdown

    public void selectCreditCard(int index) {
        selectByIndexFromDropDown(creditCardDropdownLocator, index);
    }

    public void fillAllTheDetailsOnMasterCard() {
        sendTextToElement(By.id("CardholderName"), "Mr Karan Johar");
        sendTextToElement(By.id("CardNumber"), "5425233430109903");
        selectByContainsTextFromDropDown(By.id("ExpireMonth"), "04");
        selectByContainsTextFromDropDown(By.id("ExpireYear"),"2026");
        sendTextToElement(By.id("CardCode"), "676");
    }

    public void clickOnCreditCardContinueButton(){
        clickOnElement(clickOnCreditCardContinueButton);
    }
    public String getPaymentMethodInfo(){
        return gettextFromElement(paymentMethodInfo);
    }

    public String getNextDayAirShipping(){
        return gettextFromElement(nextDayAirShipping);
    }
    public String getSecondDayAirShipping(){
        return gettextFromElement(secondDayAirShipping);
    }
    public String getTotalPrice(){
        return gettextFromElement(totalPrice);
    }
    public void clickOnConfirmButtonOnCheckOutPage(){
        clickOnElement(By.xpath("//button[normalize-space()='Confirm']"));
    }
    public String getThankYouMessage(){
        return gettextFromElement(thankYouMessage);
    }
    public String getOrderSuccessfullyProceedMessage(){
        return gettextFromElement(orderSuccessfullyProceedMessage);
    }
    public void clickOnContinueButtonAfterOrderSuccessfullyProceedMessage(){
        clickOnElement(continueButtonAfterOrderSuccessfullyProceedMessage);
    }
    public void clickOnDropDownSelectCard(String visa){
        selectByValueFromDropDown(dropDownSelectCard, visa);
    }

}
