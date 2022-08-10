package com.app.pages.pagecomponents;

import org.openqa.selenium.By;

import static com.app.utils.SeleniumUtils.click;

public class TopMenuComponent {

     private static final By LNK_ADMIN = By.id("admintext");

     public void clickAdmin()
     {
         click(LNK_ADMIN,"Admin Link");
     }

    /* public String getAdminLinkText()
     {
          return  getText(LNK_ADMIN);
     }*/
}
