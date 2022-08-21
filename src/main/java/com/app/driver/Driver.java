package com.app.driver;

import com.app.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.io.ObjectInputStream;
import java.time.Duration;
import java.util.Objects;

public final class Driver {

    private Driver() {
    }

    public static void initDriver()  {
        String browser = ConfigFactory.getConfig().browser();
        String mode = ConfigFactory.getConfig().runMode();
        //if the driver is null, then only create an instance for the browser
        if (Objects.isNull(DriverManager.getDriver())) {
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
            DriverManager.unLoad();

        }
    }
}
