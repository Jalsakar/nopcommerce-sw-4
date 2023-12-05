package com.nopcommerce.demo.utilities;

import com.google.common.base.Function;
import com.nopcommerce.demo.browserfactory.ManageBrowser;
import dev.failsafe.internal.util.Assert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.awt.SystemColor.text;

public class Utility extends ManageBrowser {
    /**
     * Click on Element method
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * Get text from Element method
     */
    public String gettextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * Send text to Element method
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /**
     * This method will get the title of the page
     */
    public String getTitle(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will clear the text field
     */
    public void clearTextField(By by) {
        driver.findElement(by).clear();
    }

    /**
     * This method will get size from element
     */
    public void getSizeFromElement(By by) {
        driver.findElement(by).getSize();
    }

    /**
     * This method will find the list of WebElements
     */
    public List<WebElement> findElementsList(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will find one WebElement
     */
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }
    /**
     *This method is to work with list of elements
     */
    public void listOfElements(By by,String text){
        List<WebElement> elements = driver.findElements(by);
        try{
            for (WebElement element:elements){
                if(element.getText().equalsIgnoreCase(text)) {
                    element.click();
                    break;
                }
            }

        }catch (StaleElementReferenceException e) {
            elements= driver.findElements(by);
        }

    }
    /**
     * This method is to clear the texField
     */

    public void clearField(By by){
        driver.findElement(by).clear();
    }

    /**
     * This method is to get current URL
     */

    public String getTheUrlOfCurrentPage(){
        return   driver.getCurrentUrl();
    }


    //==================== Alert Methods =====================================

    /**
     * 1.Switch to Alert method
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * 2.Accept Alert method
     */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    /**
     * 3.Dismiss Alert Method
     */
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    /**
     * 4.Get text from Alert method
     */
    public void getTestFromAlert() {
        driver.switchTo().alert().getText();
    }

    /**
     * 5.Send text to Alert method
     */
    public void sendTestToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    //============== Action Class Methods===============================

    /**
     * 1.Mouse hover on element method
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /**
     * 2.Mouse hover on element and click method
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    /**
     * 3.Drag and Drop element method
     */
    public void dragAndDropElement(By by) {
        Actions actions = new Actions(driver);
        WebElement sourceElement = driver.findElement(by);
        WebElement targetElement = driver.findElement(by);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
    }
//============== Select Class Methods =====================================

    /**
     * 1.Select the option by visible text from drop down
     */
    public void selectByVisibleTextFromDropDown(By by) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(String.valueOf(text));
    }

    /**
     * 2.Select the option by index from drop down
     */
    public void selectByIndexFromDropDown(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    /**
     * 3.Select the option by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }

    /**
     * 4.Select the option by contains text
     */
    public void selectByContainsTextFromDropDown(By by, String text) {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }
    //========= Waits Methods =====================================

    /**
     * This method will use to wait until  VisibilityOfElementLocated
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    /**
     * This method will wait for element with fluent wait
     */
    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }
    //*************************** Window Handle Methods ***************************************//

    /**
     * This method will close all windows
     */
    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }

    /**
     * This method will switch to parent window
     */
    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    /**
     * This method will find that we switch to right window
     */
    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }
    //************************** ScreenShot Methods *********************************************//

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
    //=============== Verification Method ==========================

    /**
     * This method will verify text
     */
    public void verifyText(String actualText, String expectedText,String displayedMessage) {
        Assert.state(Boolean.parseBoolean(actualText),expectedText, displayedMessage);
    }

    //============= Random Email ==================================
    protected String randomEmail() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder email = new StringBuilder();
        Random rnd = new Random();

        while (email.length() < 7) {
            int index = (int) (rnd.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String pre = email.toString() + "@test.com";
        return pre;
    }

    public String randomEmail1() {
        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

    //************ Date Picker *************************
    public void datePicker(){
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Add one day
        LocalDate nextDate = currentDate.plusDays(1);

        // Format dates if needed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String currentDateString = currentDate.format(formatter);
        String nextDateString = nextDate.format(formatter);

        // Now, you can use 'nextDate' in your Selenium script
        System.out.println("Current Date: " + currentDateString);
        System.out.println("Next Date: " + nextDateString);
    }
    public ArrayList<String> getElementsFromArrayList(List<WebElement> listOfElements) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (WebElement element : listOfElements) {
            arrayList.add(element.getText());
        }
        return arrayList;
    }

}