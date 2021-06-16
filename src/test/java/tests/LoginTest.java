package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class LoginTest extends BaseTest {

    @Test
    public void emptyLoginTest() {
        loginPage
                .openPage()
                .login("", "secret_sauce");
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void emptyPasswordTest() {
        loginPage
                .openPage()
                .login("standard_user", "");
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void emptyLoginPasswordTest() {
        loginPage
                .openPage()
                .login("", "");
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void loginFactoryTest() {
        loginPageFactory
                .openPage()
                .login(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                        System.getenv().getOrDefault("password", PropertyReader.getProperty("password")));
         //       .login(System.getenv("username"), System.getenv("password"));
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Username is required");
    }
}


