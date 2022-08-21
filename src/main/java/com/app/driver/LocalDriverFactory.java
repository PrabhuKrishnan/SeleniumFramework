package com.app.driver;

import com.app.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getLocalDriver(String browser) {
        WebDriver driver = null;
        if (browser.equalsIgnoreCase(String.valueOf(BrowserType.CHROME))) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(String.valueOf(BrowserType.FIREFOX))) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;


    }

}
