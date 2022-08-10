package com.app.driver;

import com.app.config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public final class Driver {

    private Driver() {
    }

    public static void initDriver()  {
        String browser = ConfigFactory.getConfig().browser();
        String mode = ConfigFactory.getConfig().runMode();
        if (DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver(mode,browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigFactory.getConfig().timeout()));
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());
        }
    }

    public static void quitDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
