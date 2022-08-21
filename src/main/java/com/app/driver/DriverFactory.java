package com.app.driver;


import com.app.enums.RemoteType;
import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver getDriver(String runMode, String browserName) {

        WebDriver driver = null;
        if (runMode.equalsIgnoreCase(String.valueOf(RemoteType.LOCAL))) {

            driver = LocalDriverFactory.getLocalDriver(browserName);

        } else if (runMode.equalsIgnoreCase(String.valueOf(RemoteType.REMOTE))) {

            driver =   RemoteDriverFactory.getRemoteDriver(browserName);
        }

        return driver;
    }
}
