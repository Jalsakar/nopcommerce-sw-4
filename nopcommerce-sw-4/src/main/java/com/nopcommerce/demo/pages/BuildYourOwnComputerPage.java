package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By buildYourOwnComputerTitle= By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectProcessor = By.cssSelector("#product_attribute_1");
    By selectRAM = By.cssSelector("#product_attribute_2");
    By selectHDD = By.cssSelector("#product_attribute_3_7");
    By selectOS = By.xpath("//input[@id='product_attribute_4_9']");
    By selectSoftware = By.id("product_attribute_5_12");
    By totalPrice = By.id("price-value-1");
    By addToCartTotalPriceOfBuildYouOwnProduct = By.cssSelector("#add-to-cart-button-1");
    By productAddedToShoppingCartMessage = By.xpath("//p[@class='content']");
    By clickOnProductAddedToShoppingCartMessage = By.xpath("//span[@title='Close']");
    By clickOnShoppingCartButton = By.xpath("//li[@id='topcartlink']");
    By shoppingCartTitle = By.xpath("//h1[normalize-space()='Shopping cart']");
    //Get Build Your Own Computer Title
    public String getBuildYourOwnComputerTitle() {
        return gettextFromElement(buildYourOwnComputerTitle);
    }
    //Select Product Processor method
    public void selectProcessor(){
        selectByIndexFromDropDown(selectProcessor, 1);
    }
    //Select Product RAM method
    public void selectRAM(){
        selectByIndexFromDropDown(selectRAM, 3);
    }
    //Select Product HDD method
    public void selectHDD(){
        clickOnElement(selectHDD);
    }
    //Select Product OS method
    public void selectOS(){
        clickOnElement(selectOS);
    }
    //Select Product Software method
    public void selectSoftware(){
        clickOnElement(selectSoftware);
    }
    //Get total Price of the Product method
    public void getTotalPriceOfProduct(){
        gettextFromElement(totalPrice);
    }
    //Click on Add to cart button
    public void clickOnAddToCartOfTotalPriceOfBuildYourOwnComputer(){
        clickOnElement(addToCartTotalPriceOfBuildYouOwnProduct);
    }
    //Get Message "The product has been added to your shopping cart" on Top green Bar
    public String getProductAddedToShoppingCartMessage(){
        return gettextFromElement(productAddedToShoppingCartMessage);
    }
    //Close Message "The product has been added to your shopping cart" on Top green Bar
    public void clickOnProductAddedToShoppingCardMessage(){
        clickOnElement(clickOnProductAddedToShoppingCartMessage);
    }
    //Click on Shopping Cart method
    public void clickOnShoppingCartButton(){
        mouseHoverToElementAndClick(clickOnShoppingCartButton);
    }
    //Get Shopping Cart Title
    public String getShoppingCartTitle(){
        return getTitle(shoppingCartTitle);
    }

}
