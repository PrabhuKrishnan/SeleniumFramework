package com.app.tests;

import com.app.annotations.FrameworkAnnotation;
import com.app.enums.CategoryType;
import com.app.pages.LoginPage;
import com.app.testdata.TestData;
import com.app.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.*;


public class HomePageTest extends BaseTest {


    @FrameworkAnnotation(author = {"prabhu","vairamuthu"},category = {CategoryType.SMOKE})
    @Test(description = "To verify whether OrangeHRM Home page is working or not" , dataProvider = "getData",dataProviderClass = DataProviderUtils.class)
    public void tileValidationTest(TestData testData)
    {
        LoginPage loginPage = new LoginPage();
        String actualTile = loginPage.loginIntoApp(testData.username,testData.password).getHomePageTitle();
        Assert.assertEquals(actualTile,testData.expectedTitle);
    }

}
