package org.example;


import org.example.base.BaseClass;
import org.example.page.HomePage;
import org.example.page.LoginPage;
import org.example.util.Utility;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        lunchBrowser();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyLoginPageTitleTest(){
        String loginPageTitle = loginPage.verifyLoginPageTitle();
        Assert.assertEquals(loginPageTitle,"LinkedIn Login, Sign in | LinkedIn");
    }

    @DataProvider
    public Object[][] getLoginTestData(){
        return Utility.getTestData("LinkedinPageModel");
    }

    @Test(dataProvider = "getLoginTestData")
    public void loginTest(String username,String password){
        homePage = loginPage.login(username, password);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
}
