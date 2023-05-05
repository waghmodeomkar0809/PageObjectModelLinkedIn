package org.example.page;

import org.example.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    @FindBy(id = "username")
    private WebElement emailfieald;
    @FindBy(id = "password")
    private WebElement Passwordfieald;
    @FindBy(xpath= "//button[contains(text(),'Sign in')]")
    private WebElement SigninButoon;

   public LoginPage(){
       PageFactory.initElements(driver,this);

    }
    public HomePage login(String uname, String pwd){
       emailfieald.sendKeys(uname);
       Passwordfieald.sendKeys(pwd);
       SigninButoon.click();
       return new HomePage();

    }
    public String verifyLoginPageTitle(){
        return driver.getTitle();
    }

}
