package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020Page extends Utility {
    By nokiaLumia1020Text = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By nokiaLumia1020Price = By.id("price-value-20");
    By qtyOfNokiaLumia1020 = By.id("product_enteredQuantity_20");
    By addToCartButtonOfNokiaLumia1020 = By.xpath("//button[@id='add-to-cart-button-20']");
    By nokiaLumia1020AddedToCartSuccessfullyMessage = By.xpath("//p[@class='content']");
    By closeNokiaLumia1020AddedToCartSuccessfullyMessage = By.xpath("//span[@title='Close']");
    By nokiaLumia1020ShoppingCartLink = By.xpath("//li[@id='topcartlink']");
    public String getNokiaLumia1020Text(){
        return gettextFromElement(nokiaLumia1020Text);
    }
    public String getNokiaLumia1020Price(){
        return gettextFromElement(nokiaLumia1020Price);
    }
    public void clearAndAddQtyOfNokiaLumia1020(){
        clearField(qtyOfNokiaLumia1020);
        sendTextToElement(qtyOfNokiaLumia1020, "2");
    }
    public void clickOnAddToCartOfNokiaLumia1020(){
        clickOnElement(addToCartButtonOfNokiaLumia1020);
    }
    public String getNokiaLumia1020AddedToCartSuccessfullyMessage(){
        return gettextFromElement(nokiaLumia1020AddedToCartSuccessfullyMessage);
    }
    public void clickOnCloseButtonAddedToCartSuccessfullyMessage(){
        clickOnElement(closeNokiaLumia1020AddedToCartSuccessfullyMessage);
    }
    public void clickOnNokiaLumia1020ShoppingCartLink(){
        mouseHoverToElementAndClick(nokiaLumia1020ShoppingCartLink);
    }
}
