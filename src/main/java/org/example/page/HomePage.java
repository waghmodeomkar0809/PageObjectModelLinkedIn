package org.example.page;

import org.example.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//img[@class='EntityPhoto-circle-3 ghost-person ember-view']")
   private WebElement Profilelink;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public String verifyHomePageTitle(){
       return driver.getTitle();
    }
    public ProfilePage gotoProfile(){
        Profilelink.click();
        return new ProfilePage();
    }
}
