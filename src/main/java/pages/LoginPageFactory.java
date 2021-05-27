package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFactory extends BasePage {

    public LoginPageFactory (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@data-test='username']")
    WebElement usernameInput;

    @FindBy(xpath = "//*[@data-test='password']")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@data-test='error']")
    WebElement loginError;

    public LoginPageFactory login(String username, String password) {
        waitForElementLocated(usernameInput, 10);
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return this;
    }

    public LoginPageFactory openPage() {
        super.openPage(LOGIN_URL);
        return this;
    }
    public String getLoginErrorText() {
        return loginError.getText();
    }

}

