package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {
    By sortByPosition = By.id("products-orderby");
    By addToCartBuildYourOwnComputerProduct = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");

    //Select Sort By position method
    public void selectSortByPosition(String value) {
        selectByValueFromDropDown(sortByPosition, value);
    }
    //Products are arranged in Z to A position in List method
    By productArrangementZToA = By.xpath("//h2[@class='product-title']/a");
    public List<WebElement> listOfProductsInZToA() {
        List<WebElement> listOfElement = driver.findElements(productArrangementZToA);
        return listOfElement;
    }
    //Add to Cart method
    public void addBuildYourOwnComputerProductInCart(){
        mouseHoverToElementAndClick(addToCartBuildYourOwnComputerProduct);
    }
}