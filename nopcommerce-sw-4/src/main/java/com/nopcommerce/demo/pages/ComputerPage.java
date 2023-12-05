package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By deskTopsTab = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    public void mouseHoverAndClickOnDeskTops() {
        mouseHoverToElementAndClick(deskTopsTab);
    }
}
