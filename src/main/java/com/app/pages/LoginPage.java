package com.app.pages;

import org.openqa.selenium.By;
import static com.app.utils.SeleniumUtils.*;

public class LoginPage {

    private static final By TXT_USERNAME = By.id("txtUsername");
    private static final By TXT_PASSWORD = By.id("txtPassword");
    private static final By BTN_LOGIN = By.id("btnLogin");

    private LoginPage setTxtUserName(String username) {
        sendKeys(TXT_USERNAME, username,"username");
        return this;
    }

    private LoginPage setTxtPassword(String password) {
        sendKeys(TXT_PASSWORD, password,"password");
        return this;
    }

    private HomePage clickLoginButton() {
        click(BTN_LOGIN, "Login Button");
        return new HomePage();
    }

    public HomePage loginIntoApp(String username, String password) {
        return setTxtUserName(username)
                .setTxtPassword(password)
                .clickLoginButton();
    }
}
