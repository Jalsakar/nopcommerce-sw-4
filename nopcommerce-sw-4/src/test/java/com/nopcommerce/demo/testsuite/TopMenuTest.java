package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifySelectAllTopMenuTabsSuccessfully() {
        homePage.selectAllTopMenuTabs("menu");
    }

    @Test
    public void verifyPageNavigationOfComputerPageSuccessfully() {
        homePage.clickOnComputerTab();
        homePage.navigateToComputerPage();
    }

    @Test
    public void verifyPageNavigationOfElectronicsPageSuccessfully() {
        homePage.clickOnElectronicsTab();
        homePage.navigateToElectronicsPage();
    }

    @Test
    public void verifyPageNavigationOfApparelPageSuccessfully() {
        homePage.clickOnApparelTab();
        homePage.navigateToApparelPage();
    }

    @Test
    public void verifyPageNavigationOfPageDigitalDownloadsSuccessfully() {
        homePage.clickOnDigitalDownloadsTab();
        homePage.navigateToDigitalDownloadsPage();
    }

    @Test
    public void verifyPageNavigationOfBooksPageSuccessfully() {
        homePage.clickOnBooksTab();
        homePage.navigateToBooksPage();
    }

    @Test
    public void verifyPageNavigationOfJewelryPageSuccessfully() {
        homePage.clickOnJewelryTab();
        homePage.navigateToJewelryPage();
    }

    @Test
    public void verifyPageNavigationOfGiftCardsPageSuccessfully() {
        homePage.clickOnGiftCardsTab();
        homePage.navigateToGiftCardsPage();
    }
}