package org.example.page;

import org.example.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage extends BaseClass {
@FindBy(xpath = "//span[@title = 'Messaging']")
    private WebElement message;

public JobsPage(){
    PageFactory.initElements(driver,this);
}
public MessagePage gotomessage(){
    message.click();
    return new MessagePage();
}
    public String verifyHomePageTitle(){
        return driver.getTitle();
    }
}
