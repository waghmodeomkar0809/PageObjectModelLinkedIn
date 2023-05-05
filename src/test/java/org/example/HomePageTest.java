package org.example;

import org.example.base.BaseClass;
import org.example.page.HomePage;
import org.example.page.LoginPage;
import org.example.page.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
     ProfilePage profilePage;

    @BeforeMethod
    public void setup() {
        lunchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("omrajewaghmode97@gmail.com", "82650809");
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Feed | LinkedIn");
    }

    @Test
    public void gotoProfileTest() {
        profilePage = homePage.gotoProfile();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}


