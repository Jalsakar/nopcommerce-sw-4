package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By topMenuBar = By.xpath("//div[@class='header-menu']");
    By computersTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By computersPageTitle = By.xpath("//h1[contains(text(),'Computers')]");
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By electronicsPageTitle = By.xpath("//h1[contains(text(),'Electronics')]");
    By apparelTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By apparelPageTitle = By.xpath("//h1[contains(text(),'Apparel')]");
    By digitalDownloadsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By digitalDownloadsPageTitle = By.xpath("//h1[contains(text(),'Digital downloads')]");
    By booksTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By booksPageTitle = By.xpath("//h1[contains(text(),'Books')]");
    By jewelryTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By jewelryPageTitle = By.xpath("//h1[contains(text(),'Jewelry')]");
    By giftCardsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
    By giftCardsPageTitle = By.xpath("//h1[contains(text(),'Gift Cards')]");
    By welcomeToOurStoreMessage = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logOutLink = By.xpath("//a[contains(text(),'Log out')]");
    By baseUrlLink = By.xpath("https://demo.nopcommerce.com/");

    public void selectAllTopMenuTabs(String menu) {
        listOfElements(topMenuBar, menu);
    }

    public void clickOnComputerTab() {
        clickOnElement(computersTab);
    }

    public String navigateToComputerPage() {
        return gettextFromElement(computersPageTitle);
    }

    public void clickOnElectronicsTab() {
        clickOnElement(electronicsTab);
    }

    public String navigateToElectronicsPage() {
        return gettextFromElement(electronicsPageTitle);
    }

    public void clickOnApparelTab() {
        clickOnElement(apparelTab);
    }

    public String navigateToApparelPage() {
        return gettextFromElement(apparelPageTitle);
    }

    public void clickOnDigitalDownloadsTab() {
        clickOnElement(digitalDownloadsTab);
    }

    public String navigateToDigitalDownloadsPage() {
        return gettextFromElement(digitalDownloadsPageTitle);
    }

    public void clickOnBooksTab() {
        clickOnElement(booksTab);
    }

    public String navigateToBooksPage() {
        return gettextFromElement(booksPageTitle);
    }

    public void clickOnJewelryTab() {
        clickOnElement(jewelryTab);
    }

    public String navigateToJewelryPage() {
        return gettextFromElement(jewelryPageTitle);
    }

    public void clickOnGiftCardsTab() {
        clickOnElement(giftCardsTab);
    }

    public String navigateToGiftCardsPage() {
        return gettextFromElement(giftCardsPageTitle);
    }
    public String navigateToWelcomeToOurStoreMessage(){
        return gettextFromElement(welcomeToOurStoreMessage);
    }
    public void clickOnLogOutLink(){
        clickOnElement(logOutLink);
    }
    public String getBaseUrlLink(){
        return gettextFromElement(baseUrlLink);
    }
}