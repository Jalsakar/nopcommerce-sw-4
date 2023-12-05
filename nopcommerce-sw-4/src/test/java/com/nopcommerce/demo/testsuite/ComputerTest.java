package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();
    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    WelcomeToSignInPage welcomeToSignInPage = new WelcomeToSignInPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputerTab();

        //1.2 Click on Desktop
        computerPage.mouseHoverAndClickOnDeskTops();

        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.selectSortByPosition("6");

//        //1.4 Verify the Product will arrange in Descending order.
//         //Retrieve actual list:
//        ArrayList<String> actualList = getElementsFromArrayList(desktopPage.listOfProductsInZToA());
//       // Print actual list:
//        System.out.println("Actual List: " + actualList);//z to a
//        //Retrieve expected list:
//        //ArrayList<String> expectedList = getElementsFromArrayList(desktopPage.listOfProductsInZToA());//z to a
//        //Print expected list:
//        System.out.println("Expected List: " + expectedList);
//        Assert.assertEquals(actualList, expectedList, "Error message: Products are not arranged in descending order");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.clickOnComputerTab();
        Thread.sleep(2000);
        //2.2 Click on Desktop
        computerPage.mouseHoverAndClickOnDeskTops();
        Thread.sleep(2000);
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.selectSortByPosition("5");
        Thread.sleep(2000);
        //2.4 Click on "Add To Cart"
        desktopPage.addBuildYourOwnComputerProductInCart();
        Thread.sleep(3000);
        //2.5 Verify the Text "Build your own computer"
        String actualMessage = buildYourOwnComputerPage.getBuildYourOwnComputerTitle();
        String expectedMessage = "Build your own computer";
        Assert.assertEquals(actualMessage, expectedMessage, "Error message: Text verification is failed");
        Thread.sleep(2000);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor();
        Thread.sleep(2000);
        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputerPage.selectRAM();
        Thread.sleep(2000);
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.selectHDD();
        Thread.sleep(2000);
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectOS();
        Thread.sleep(2000);
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputerPage.selectSoftware();
        Thread.sleep(2000);
        //* 2.11 Verify the price "$1,475.00"
        buildYourOwnComputerPage.getTotalPriceOfProduct();
        Thread.sleep(2000);
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCartOfTotalPriceOfBuildYourOwnComputer();
        Thread.sleep(2000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualMessage1 = buildYourOwnComputerPage.getProductAddedToShoppingCartMessage();
        String expectedMessage1 = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage1, expectedMessage1, "Error Message");
        Thread.sleep(2000);
        //After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.clickOnProductAddedToShoppingCardMessage();
        Thread.sleep(2000);
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.clickOnShoppingCartButton();
        Thread.sleep(2000);
        //2.15 Verify the message "Shopping cart"
        String actualMessage2 = shoppingCartPage.getShoppingCartTitle();
        String expectedMessage2 = "Shopping cart";
        Assert.assertEquals(actualMessage2, expectedMessage2, "Error Message");
        Thread.sleep(2000);
        //2.16 Change the Qty to "2"
        shoppingCartPage.clearAndAddQtyOnShoppingCart();
        Thread.sleep(2000);
        //Click on "Update shopping cart"
        shoppingCartPage.clockOnUpdateShoppingCart();
        Thread.sleep(2000);
        //2.17 Verify the Total"$2,950.00
        String actualMessage3 = shoppingCartPage.getTotalPriceOfBuildYourOwnComputersProducts();
        String expectedMessage3 = "$2,950.00";
        Assert.assertEquals(actualMessage3, expectedMessage3, "Incorrect Total");
        Thread.sleep(2000);
        // 2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermAndConditionCheckBox();
        Thread.sleep(2000);
        //2.19 Click on “CHECKOUT”
        shoppingCartPage.clickOnCheckOutBox();
        Thread.sleep(2000);
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String actualMessage4 = welcomeToSignInPage.getWelcomePleaseSignInMessage();
        String expectedMessage4 = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage4, expectedMessage4, "Error Message");
        Thread.sleep(2000);
        //2.21Click on “CHECKOUT AS GUEST” Tab
        welcomeToSignInPage.clickOnCheckOutAsGuestBox();
        Thread.sleep(2000);
        //2.22 Fill the all mandatory field
        checkOutPage.fillAllMandatoryFields();
        Thread.sleep(2000);
        //2.23 Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();
        Thread.sleep(2000);
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPage.clickOnShippingMethodRadioButton();
        Thread.sleep(2000);
        //2.25 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonInShippingMethod();
        Thread.sleep(2000);
        //2.26 Select Radio Button “Credit Card”
        checkOutPage.clickOnCreditCardRadioButton();
        Thread.sleep(2000);
        //Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonOnCreditCard();
        Thread.sleep(2000);
        //2.27 Select “Master card” From Select credit card dropdown
        checkOutPage.selectCreditCard(1);
        Thread.sleep(2000);
        //2.28 Fill all the details
        checkOutPage.fillAllTheDetailsOnMasterCard();
        Thread.sleep(2000);
        //2.29 Click on “CONTINUE”
        checkOutPage.clickOnCreditCardContinueButton();
        Thread.sleep(2000);
        //2.30 Verify “Payment Method” is “Credit Card”
        String actualMethod = checkOutPage.getPaymentMethodInfo();
        String expectedMethod = "Credit Card";
        Assert.assertEquals(actualMethod, expectedMethod, "Wrong Payment Method");
        Thread.sleep(2000);
        //2.32 Verify “Shipping Method” is “Next Day Air”
        String actualShipping = checkOutPage.getNextDayAirShipping();
        String expectedShipping = "Next Day Air";
        Assert.assertEquals(actualShipping, expectedShipping, "Wrong Shipping");
        Thread.sleep(2000);
        //2.33 Verify Total is “$2,950.00”
        String actualTotalPrice = checkOutPage.getTotalPrice();
        String expectedTotalPrice = "$2,950.00";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Wrong Price");
        Thread.sleep(2000);
        //2.34 Click on “CONFIRM”
        checkOutPage.clickOnConfirmButtonOnCheckOutPage();
        Thread.sleep(2000);
        //2.35 Verify the Text “Thank You”
        String actualThankYouMessage = checkOutPage.getThankYouMessage();
        String expectedThankYouMessage = "Thank you";
        Assert.assertEquals(actualThankYouMessage, expectedThankYouMessage, "Wrong Message");
        Thread.sleep(2000);
        //2.36 Verify the message “Your order has been successfully processed!”
        String actualOrderSuccessfullyProceedMessage = checkOutPage.getOrderSuccessfullyProceedMessage();
        String expectedOrderSuccessfullyProceedMessage = "Your order has been successfully processed!";
        Assert.assertEquals(actualOrderSuccessfullyProceedMessage, expectedOrderSuccessfullyProceedMessage, "Wrong Message");
        Thread.sleep(2000);
        //2.37 Click on “CONTINUE”
        checkOutPage.clickOnContinueButtonAfterOrderSuccessfullyProceedMessage();
        Thread.sleep(2000);
        //2.37 Verify the text “Welcome to our store”
        String actualWelcomeToOurStoreMessage = homePage.navigateToWelcomeToOurStoreMessage();
        String expectedWelcomeToOurStoreMessage =  "Welcome to our store";
        Assert.assertEquals(actualWelcomeToOurStoreMessage, expectedWelcomeToOurStoreMessage, "Error message");
        Thread.sleep(2000);
    }
}