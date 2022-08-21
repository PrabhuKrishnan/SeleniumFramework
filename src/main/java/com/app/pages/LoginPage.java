package com.app.pages;

import com.app.enums.WaitType;
import com.app.reports.ExtentReportLogger;
import com.app.utils.SeleniumUtils;
import org.openqa.selenium.By;
import static com.app.utils.SeleniumUtils.*;

public final class LoginPage  {

    private static final By TXT_USERNAME = By.name("username");
    private static final By TXT_PASSWORD = By.name("password");
    private static final By BTN_LOGIN = By.xpath("//button[@type='submit']");

    private LoginPage setTxtUserName(String username) {
        sendKeys(TXT_USERNAME, username,WaitType.VISIBLE,"username");
        return this;
    }

    private LoginPage setTxtPassword(String password) {
        sendKeys(TXT_PASSWORD, password,WaitType.NONE,"password");
        return this;
    }

    private HomePage clickLoginButton() {
        //click(BTN_LOGIN, "Login Button");
        click(BTN_LOGIN, WaitType.CLICKABLE,"Login Button"); //added by me, optimize later
        return new HomePage();
    }

    public HomePage loginIntoApp(String username, String password) {

        return setTxtUserName(username).setTxtPassword(password).clickLoginButton();
    }
}
