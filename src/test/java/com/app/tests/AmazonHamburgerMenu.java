package com.app.tests;

import com.app.enums.WaitType;
import com.app.utils.DynamicsXpathUtils;
import com.app.utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public final class AmazonHamburgerMenu {

    private AmazonHamburgerMenu(){}


    private  String linkSubMenu = "//div[text()='%s']/parent::a";
    String fireTvLinkTxt = "Five TV";

  //  @Test
    public void getXDynamicXpath()
    {
        String fireTvLnk = DynamicsXpathUtils.getXpath(linkSubMenu,fireTvLinkTxt);
        SeleniumUtils.click(By.xpath(fireTvLnk), WaitType.CLICKABLE,"Fire TV Menu");
    }


}
