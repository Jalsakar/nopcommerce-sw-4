package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By cellPhonePageTitle = By.xpath("//h1[normalize-space()='Cell phones']");
    By cellPhoneListViewTab = By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020Link = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");


    public String getCellPhonePageTitle(){
        return gettextFromElement(cellPhonePageTitle);
    }
    public void clickOnCellPhoneListViewTab(){
        clickOnElement(cellPhoneListViewTab);
    }
    public void clickOnNokiaLumia1020Link(){
        clickOnElement(nokiaLumia1020Link);
    }
}
