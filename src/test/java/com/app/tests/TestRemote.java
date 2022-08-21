package com.app.tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.URL;

public class TestRemote {

    @Test(dataProvider="getData")
    public void runTestInDocker(String browser,String version,String value) throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setBrowserName(browser);
        cap.setVersion(version);
        cap.setPlatform(Platform.ANY);
        cap.setCapability("enableVNC", false);
        cap.setCapability("enableVideo", false);
        cap.setCapability("name", browser+version+value);
        cap.setCapability("videoName", browser+version+value);
        cap.setCapability("timeZone", "Asia/Calcutta");
        WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(15000);
        driver.quit();
    }

    @DataProvider(parallel=true)
    public String[][] getData() {
        return new String[][]{
                {"chrome","104.0","selenium"}
        };
    }

}
