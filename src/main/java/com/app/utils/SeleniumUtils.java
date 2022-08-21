package com.app.utils;

import com.app.driver.DriverManager;
import com.app.enums.LogType;
import com.app.enums.WaitType;
import com.app.reports.ExtentReportLogger;
import static com.app.reports.FrameworkLogger.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public final class SeleniumUtils {

    private SeleniumUtils(){}


    public static String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }

    public static void sendKeys(By by, String value,WaitType waitType, String elementName) {
        WebElement element = ExplicitWaitUtils.performExplicitWait(by,waitType,elementName) ;
        element.sendKeys(value);
        ExtentReportLogger.pass(elementName + "is entered successfully",true);
        log(LogType.CONSOLE,elementName + "is entered successfully");

    }

    public static void click(By by, WaitType waitType, String elementName) {
        WebElement element =  ExplicitWaitUtils.performExplicitWait(by,waitType,elementName);
        element.click();
        ExtentReportLogger.pass(elementName + "is entered successfully",true);
        log(LogType.CONSOLE,elementName + "is entered successfully");
    }



}
