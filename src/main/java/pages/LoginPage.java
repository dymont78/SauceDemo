package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public static final By USERNAME_INPUT = By.xpath("//*[@data-test='username']");
    public static final By PASSWORD_INPUT = By.xpath("//*[@data-test='password']");
    public static final By LOGIN_BUTTON = By.xpath("//*[@id='login-button']");
    public static final By LOGIN_ERROR = By.xpath("//*[@data-test='error']");

    @Step("Fill in {username} and {password}")
    public ProductPage login(String username, String password){
        waitForElementLocated(USERNAME_INPUT, 10);
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new ProductPage(driver);
    }

    @Step("Open login page")
    public LoginPage openPage(){
        super.openPage(LOGIN_URL);
        return this;
    }

    public String getLoginErrorText() {
        return driver.findElement(LOGIN_ERROR).getText();
    }
}
