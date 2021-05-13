package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void emptyLoginTest() {
        loginPage.openPage();
        loginPage.login("","secret_sauce");
        System.out.println(loginPage.getLoginErrorText());
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void emptyPasswordTest() {
        loginPage.openPage();
        loginPage.login("standard_user","");
        System.out.println(loginPage.getLoginErrorText());
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void emptyLoginPasswordTest() {
        loginPage.openPage();
        loginPage.login("","");
        System.out.println(loginPage.getLoginErrorText());
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Username is required");
    }
}
