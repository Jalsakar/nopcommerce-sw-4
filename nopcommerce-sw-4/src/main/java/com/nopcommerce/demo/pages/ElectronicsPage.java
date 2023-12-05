package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhoneTab = By.linkText("Cell phones");
    public void mouseHoverAndClickOnElectronicsTab(){
        mouseHoverToElementAndClick(electronicsTab);
    }
    public void mouseHoverAndClickOnCellPhoneTab(){
        mouseHoverToElementAndClick(cellPhoneTab);
    }
}
