package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingCartTitle = By.xpath("//h1[normalize-space()='Shopping cart']");

    By qtyOnShoppingCart = By.xpath("//input[@class='qty-input']");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By totalPriceOfBuildYourOwnComputersProducts = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By totalPriceOfNokiaLumia1020Products = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");

    //By clickOnTermAndConditionCheckBox = By.xpath("//input[@id='termsofservice']");
    By clickOnTermAndConditionCheckBox = By.id("termsofservice");
    By clickOnCheckOutBox = By.xpath("//button[@id='checkout']");

    public String getShoppingCartTitle(){
        return getTitle(shoppingCartTitle);
    }
    public void clearAndAddQtyOnShoppingCart(){
        clearField(qtyOnShoppingCart);
        sendTextToElement(qtyOnShoppingCart,"2");
    }
    public void clockOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }
    public String getTotalPriceOfBuildYourOwnComputersProducts(){
        return gettextFromElement(totalPriceOfBuildYourOwnComputersProducts);
    }
    public String getTotalPriceOfNokiaLumia1020Products(){
        return gettextFromElement(totalPriceOfNokiaLumia1020Products);
    }
    public void clickOnTermAndConditionCheckBox(){
        clickOnElement(clickOnTermAndConditionCheckBox);
    }
    public void clickOnCheckOutBox(){
        mouseHoverToElementAndClick(clickOnCheckOutBox);
    }


}
