package com.app.pages;

import com.app.pages.pagecomponents.TopMenuComponent;
import org.openqa.selenium.By;
import static com.app.utils.SeleniumUtils.*;

public class HomePage {


    private static final By TXT_HOME_PAGE_TITLE = By.xpath("//*[text()='OrangeHRM']");

    private TopMenuComponent topMenuComponent;

    public HomePage() {
        topMenuComponent = new TopMenuComponent();

    }

    public String getHomePageTitle() {
        return getPageTitle();
    }


    public void clickOnAdmin() {
        topMenuComponent.clickAdmin();
    }

   /* public String getAdminLinkText() {
        return topMenuComponent.getAdminLinkText();
    }
*/
}
