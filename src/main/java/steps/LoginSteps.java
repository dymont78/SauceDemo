package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductPage;

public class LoginSteps {

    private LoginPage loginPage;

    public LoginSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    @Step("Open site and log in with username: '{username}' password: '{password}'")
    public LoginSteps openSiteAndLogin(String username, String password){
        loginPage
                .openPage()
                .login(username, password);
        return this;
    }
}
