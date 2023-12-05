package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    HomePage homePage = new HomePage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumia1020Page nokiaLumia1020Page = new NokiaLumia1020Page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    WelcomeToSignInPage welcomeToSignInPage = new WelcomeToSignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    LogInPage logInPage = new LogInPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.mouseHoverAndClickOnElectronicsTab();
        Thread.sleep(2000);
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverAndClickOnCellPhoneTab();
        Thread.sleep(2000);
        //1.3 Verify the text “Cell phones”
        String actualCellPhonePageTitle = cellPhonePage.getCellPhonePageTitle();
        String expectedCellPhonePageTitle = "Cell phones";
        Assert.assertEquals(actualCellPhonePageTitle, expectedCellPhonePageTitle, "Wrong Title");
        Thread.sleep(2000);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.mouseHoverAndClickOnElectronicsTab();
        Thread.sleep(2000);
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverAndClickOnCellPhoneTab();
        Thread.sleep(2000);
        //2.3 Verify the text “Cell phones”
        String actualCellPhonePageTitle = cellPhonePage.getCellPhonePageTitle();
        String expectedCellPhonePageTitle = "Cell phones";
        Assert.assertEquals(actualCellPhonePageTitle, expectedCellPhonePageTitle, "Wrong Title");
        Thread.sleep(2000);
        //2.4 Click on List View Tab
        cellPhonePage.clickOnCellPhoneListViewTab();
        Thread.sleep(2000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumia1020Link();
        Thread.sleep(2000);
        //2.6 Verify the text “Nokia Lumia 1020”
        String actualNokiaLumia1020Text = nokiaLumia1020Page.getNokiaLumia1020Text();
        String expectedNokiaLumia1020Text = "Nokia Lumia 1020";
        Assert.assertEquals(actualNokiaLumia1020Text, expectedNokiaLumia1020Text, "Wrong Product Link");
        Thread.sleep(2000);
        //2.7 Verify the price “$349.00”
        String actualNokiaLumia1020Price = nokiaLumia1020Page.getNokiaLumia1020Price();
        String expectedNokiaLumia1020Price = "$349.00";
        Assert.assertEquals(actualNokiaLumia1020Price, expectedNokiaLumia1020Price, "Wrong Product Price");
        Thread.sleep(2000);
        //2.8 Change quantity to 2
        nokiaLumia1020Page.clearAndAddQtyOfNokiaLumia1020();
        Thread.sleep(2000);
        //2.9 Click on “ADD TO CART” tab
        nokiaLumia1020Page.clickOnAddToCartOfNokiaLumia1020();
        Thread.sleep(2000);
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualNokiaLumia1020AddedToCartSuccessfullyMessage = nokiaLumia1020Page.getNokiaLumia1020AddedToCartSuccessfullyMessage();
        String expectedNokiaLumia1020AddedToCartSuccessfullyMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualNokiaLumia1020AddedToCartSuccessfullyMessage, expectedNokiaLumia1020AddedToCartSuccessfullyMessage);
        Thread.sleep(2000);
        //After that close the bar clicking on the cross button.
        nokiaLumia1020Page.clickOnCloseButtonAddedToCartSuccessfullyMessage();
        Thread.sleep(2000);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumia1020Page.clickOnNokiaLumia1020ShoppingCartLink();
        Thread.sleep(2000);
        //2.12 Verify the message "Shopping cart"
        shoppingCartPage.getShoppingCartTitle();
        Thread.sleep(2000);
        //2.13 Verify the quantity is 2
        shoppingCartPage.clearAndAddQtyOnShoppingCart();
        Thread.sleep(2000);
        //2.14 Verify the Total $698.00
        String actualTotalPriceOfNokiaLumia1020Products = shoppingCartPage.getTotalPriceOfNokiaLumia1020Products();
        String expectedTotalPriceOfNokiaLumia1020Products = "$698.00";
        Assert.assertEquals(actualTotalPriceOfNokiaLumia1020Products, expectedTotalPriceOfNokiaLumia1020Products, "Wrong Total Price");
        Thread.sleep(2000);
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermAndConditionCheckBox();
        Thread.sleep(2000);
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutBox();
        Thread.sleep(2000);
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String actualMessage4 = welcomeToSignInPage.getWelcomePleaseSignInMessage();
        String expectedMessage4 = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage4, expectedMessage4, "Error Message");
        Thread.sleep(2000);
        //2.18 Click on “REGISTER” tab
        welcomeToSignInPage.clickOnRegisterLink();
        Thread.sleep(2000);
        //2.19 Verify the text “Register”
        String actualRegisterTitleText = registerPage.getRegisterTitle();
        String expectedRegisterTitleText = "Register";
        Assert.assertEquals(actualRegisterTitleText, expectedRegisterTitleText, "Wrong Title");
        Thread.sleep(2000);
        //2.20 Fill the mandatory fields
        registerPage.fillAllMandatoryFieldsToRegister();
        Thread.sleep(2000);
        //2.21 Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();
        Thread.sleep(2000);
        //2.22 Verify the message “Your registration completed”
        String actualRegistrationCompletedMessage = registerPage.getRegistrationCompletedMessage();
        String expectedRegistrationCompletedMessage = "Your registration completed";
        Assert.assertEquals(actualRegistrationCompletedMessage, expectedRegistrationCompletedMessage, "Error Message");
        Thread.sleep(2000);
        //2.23 Click on “CONTINUE” tab
        registerPage.clickOnContinueButtonAfterRegistrationCompletedMessage();
        Thread.sleep(2000);
        //2.24 Verify the text “Shopping cart”
        shoppingCartPage.getShoppingCartTitle();
        Thread.sleep(2000);
        //Click On Login Link
        logInPage.clickOnLoginLink();
        Thread.sleep(2000);
        //Fill All Mandatory Fields
        logInPage.fillLoginDetailsOnLoginPage();
        Thread.sleep(2000);
        //Click On Login Button
        logInPage.clickOnLoginButtonOnLoginPage();
        Thread.sleep(2000);
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermAndConditionCheckBox();
        Thread.sleep(2000);
        //2.26 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutBox();
        Thread.sleep(2000);
        //2.27 Fill the Mandatory fields
        checkOutPage.fillAllMandatoryFields();
        Thread.sleep(2000);
        //2.28 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();
        Thread.sleep(2000);
        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOutPage.getSecondDayAirShipping();
        Thread.sleep(2000);
        //2.30 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonInShippingMethod();
        Thread.sleep(2000);
        //2.31 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCardRadioButton();
        Thread.sleep(2000);
        //2.32 Select “Visa” From Select credit card dropdown
        checkOutPage.clickOnDropDownSelectCard("Visa");
        Thread.sleep(2000);
        //2.33 Fill all the details
        checkOutPage.fillAllTheDetailsOnMasterCard();
        //2.34 Click on “CONTINUE”
        checkOutPage.clickOnCreditCardContinueButton();
        Thread.sleep(2000);
        //2.35 Verify “Payment Method” is “Credit Card”
        String actualMethod = checkOutPage.getPaymentMethodInfo();
        String expectedMethod = "Credit Card";
        Assert.assertEquals(actualMethod, expectedMethod, "Wrong Payment Method");
        Thread.sleep(2000);
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String actual2ndDayShipping = checkOutPage.getSecondDayAirShipping();
        String expected2ndDayShipping = "2nd Day Air";
        Assert.assertEquals(actual2ndDayShipping, expected2ndDayShipping, "Wrong Shipping Day");
        Thread.sleep(2000);
        //2.37 Verify Total is “$698.00”
        String actualTotalPrice = checkOutPage.getTotalPrice();
        String expectedTotalPrice = "$698.00";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Wrong Price");
        Thread.sleep(2000);
        //2.38 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButtonOnCheckOutPage();
        Thread.sleep(2000);
        //2.39 Verify the Text “Thank You”
        String actualThankYouMessage = checkOutPage.getThankYouMessage();
        String expectedThankYouMessage = "Thank you";
        Assert.assertEquals(actualThankYouMessage, expectedThankYouMessage, "Wrong Message");
        Thread.sleep(2000);
        //2.40 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessfullyProceedMessage = checkOutPage.getOrderSuccessfullyProceedMessage();
        String expectedOrderSuccessfullyProceedMessage = "Your order has been successfully processed!";
        Assert.assertEquals(actualOrderSuccessfullyProceedMessage, expectedOrderSuccessfullyProceedMessage, "Wrong Message");
        Thread.sleep(2000);
        //2.41 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonAfterOrderSuccessfullyProceedMessage();
        Thread.sleep(2000);
        //2.42 Verify the text “Welcome to our store”
        String actualWelcomeToOurStoreMessage = homePage.navigateToWelcomeToOurStoreMessage();
        String expectedWelcomeToOurStoreMessage = "Welcome to our store";
        Assert.assertEquals(actualWelcomeToOurStoreMessage, expectedWelcomeToOurStoreMessage, "Error message");
        Thread.sleep(2000);
        //2.43 Click on “Logout” link
        homePage.clickOnLogOutLink();
        Thread.sleep(2000);
        //2.44 Verify the URL is “https://demo.nopcommerce.com/”
        String actualBaseUrlLink = homePage.getBaseUrlLink();
        String expectedBaseUrlLink = "https://demo.nopcommerce.com/";
        Assert.assertEquals(actualBaseUrlLink, expectedBaseUrlLink, "Invalid Link");
        Thread.sleep(2000);
    }
}
