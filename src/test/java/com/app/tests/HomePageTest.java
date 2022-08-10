package com.app.tests;


import com.app.annotations.FrameworkAnnotation;
import com.app.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends BaseTest {

    @FrameworkAnnotation(author = "prabhu")
    @Test(description = "To verify whether OrangeHRM Home page is working or not")
    public void tileValidationTest() {

        LoginPage loginPage = new LoginPage();
        String actualTile = loginPage.loginIntoApp("Admin", "admin123").getHomePageTitle();
        System.out.println("actual title from test" + actualTile);
        String  expectedTitle ="ORANGEHRM22";

        Assert.assertEquals(actualTile,expectedTitle);


    }

}
