package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @FindBy(xpath = "//button[contains(.,'Add')]")
    WebElement addButton;

    @FindBy(xpath = "//button[contains(.,'Delete')]")
    WebElement deleteButton;


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
    @Test
    public void loginFactoryTest(){
        loginPageFactory.openPage();
        loginPageFactory.loginFactory("standart_user", "secret_sauce");
    }

    @Test
    public void demoWithoutPageFactory(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        //driver.findElement("//button[contains(.,'Add')]");
        WebElement addButton = driver.findElement(By.xpath("//button[contains(.,'Add')]"));
        addButton.click();
        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(.,'Delete')]"));
        deleteButton.click();
        addButton.click();
        deleteButton.click();
    }
    @Test
    public void demoWithPageFactory() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addButtonElement = addButton;
        addButtonElement.click();
        WebElement deleteButtonElement = deleteButton;
        deleteButtonElement.click();
        addButtonElement.click();
        deleteButtonElement.click();
    }
}


//    DEMO CODE:
//
//    @Test
//    public void demoWithoutPageFactory() {
//        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
//        WebElement addButton = driver.findElement(By.xpath("//button[contains(.,'Add')]"));
//        addButton.click();
//        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(.,'Delete')]"));
//        deleteButton.click();
//        addButton.click();
//        deleteButton.click();
//    }
//
//    @Test
//    public void demoWithPageFactory() {
//        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
//        WebElement addButtonElement = addButton;
//        addButtonElement.click();
//        WebElement deleteButtonElement = deleteButton;
//        deleteButtonElement.click();
//        addButtonElement.click();
//        deleteButtonElement.click();
//    }

