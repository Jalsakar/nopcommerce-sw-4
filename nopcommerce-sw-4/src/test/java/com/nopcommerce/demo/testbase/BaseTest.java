package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.browserfactory.ManageBrowser;
import com.nopcommerce.demo.propertyreader.PropertyReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends ManageBrowser {
    String browser = PropertyReader.getInstance().getProperty("browser");
    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }
    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
