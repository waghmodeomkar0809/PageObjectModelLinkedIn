package org.example;

import org.example.base.BaseClass;
import org.example.page.HomePage;
import org.example.page.JobsPage;
import org.example.page.LoginPage;
import org.example.page.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    ProfilePage profilePage;
    JobsPage jobsPage;

    @BeforeMethod
    public void setup() {
        lunchBrowser();
        loginPage = new LoginPage();
        homePage = loginPage.login("omrajewaghmode97@gmail.com", "82650809");
        profilePage = homePage.gotoProfile();
    }

    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "(9) omkar waghmode | LinkedIn");
    }

    @Test
    public void gotoJobsTest() {
        jobsPage = profilePage.gotojobs();
        }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}

