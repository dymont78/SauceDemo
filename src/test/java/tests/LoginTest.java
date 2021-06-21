package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertyReader;

public class LoginTest extends BaseTest {

    @Test(description = "Check: empty login")
    public void emptyLoginTest() {
        loginSteps.openSiteAndLogin("", "secret_sauce");
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadfaceE: Username is required");
    }

    @Test(description = "Check: empty password")
    public void emptyPasswordTest() {
        loginSteps.openSiteAndLogin("standard_user", "");
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Password is required");
    }

    @Test(description = "Check: empty login and password")
    public void emptyLoginPasswordTest() {
        loginSteps.openSiteAndLogin("", "");
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Username is required");
    }

    @Test(description = "Check: empty password (PageFactory)")
    public void loginFactoryTest() {
        loginPageFactory
                .openPage()
                .login(System.getenv().getOrDefault("username", PropertyReader.getProperty("username")),
                        "");
 //               .login(System.getProperty("username"), System.getProperty("password"));
        Assert.assertEquals(loginPage.getLoginErrorText(), "Epic sadface: Password is required");
    }
}