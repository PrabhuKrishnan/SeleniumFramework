package com.app.driver;

import com.app.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getRemoteDriver(String browser) {
        WebDriver driver=null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (browser.equalsIgnoreCase("chrome")) {
            capabilities.setBrowserName("chrome");
        } else if (browser.equalsIgnoreCase("firefox")) {
            capabilities.setBrowserName("firefox");
        }
        try {
            driver =  new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteurl()), capabilities);
        }
        catch (MalformedURLException e)
        {
            e.getStackTrace();
        }
        return driver;
    }

}
