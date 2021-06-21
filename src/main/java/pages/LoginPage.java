package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
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
        log.info(String.format("Fill in username: %s in Login field.", username));
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        log.info(String.format("Fill in password: %s in Login field.", password));
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        log.info("Click login button");
        driver.findElement(LOGIN_BUTTON).click();
        return new ProductPage(driver);
    }

    @Step("Open login page")
    public LoginPage openPage(){
        log.info("Open login page, URL " + LOGIN_URL);
        super.openPage(LOGIN_URL);
        return this;
    }

    public String getLoginErrorText() {
        return driver.findElement(LOGIN_ERROR).getText();
    }
}
