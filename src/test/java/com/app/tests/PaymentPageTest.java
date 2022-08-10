package com.app.tests;

import com.app.annotations.FrameworkAnnotation;
import com.app.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseTest {

    @FrameworkAnnotation(author = "prabhu")
    @Test(description = "To verify whether own Account Fund Transfer is working or not ")
    public void titleValidationPaymentPageTest() {

        DriverManager.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin");
        DriverManager.getDriver().findElement(By.id("txtUsername")).sendKeys("txtPassword");
        DriverManager.getDriver().findElement(By.id("btnLogin")).click();
        String title = DriverManager.getDriver().getTitle();
        Assert.assertEquals(title, "OrangeHRM");

    }

}

