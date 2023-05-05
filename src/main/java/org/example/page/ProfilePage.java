package org.example.page;

import org.example.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseClass {
    @FindBy(xpath = "//span[text() = 'Jobs']")
    private WebElement jobs;

    public ProfilePage(){
        PageFactory.initElements(driver,this);
    }
    public JobsPage gotojobs(){
        jobs.click();
        return new JobsPage();
    }
    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

}
