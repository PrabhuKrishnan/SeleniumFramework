package com.app.utils;

import com.app.config.ConfigFactory;
import com.app.driver.DriverManager;
import com.app.enums.WaitType;
import com.app.reports.ExtentReportLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumUtils {

    public static void click(By by, String elementName) {
        WebElement element = waitUntilElementPresent(by);
        element.click();
        ExtentReportLogger.pass(elementName + "clicked successfully");
    }

    public static String getPageTitle() {
       String title =  DriverManager.getDriver().getTitle();
       return title;
    }

    public static void sendKeys(By by, String value,String elementName) {
        WebElement element = waitUntilElementPresent(by);
        element.sendKeys(value);
        ExtentReportLogger.pass(value +"is entered successfully in " + elementName);
    }

    public static void click(By by, WaitType waitType) {
        WebElement element = null;
        if (waitType == WaitType.PRESENCE) {
            element = waitUntilElementPresent(by);
        } else if (waitType == WaitType.CLICKABLE) {
            element = waitUntilElementToBeClickable(by);
        } else if (waitType == WaitType.VISIBLE) {
            element = waitUntilVisibilityOfElementLocated(by);
        }
        element.click();
    }

    private static WebElement waitUntilVisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private static WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement waitUntilElementPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
