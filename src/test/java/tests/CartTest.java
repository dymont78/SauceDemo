package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class CartTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void addProductToCartTest(){
        loginPage
                .openPage()
                .login(System.getProperty("username"), System.getProperty("password"))
                .addProductToCart("Sauce Labs Bolt T-Shirt")
                .addProductToCart("Sauce Labs Backpack");
        cartPage.openPage();
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Bolt T-Shirt"), "$15.99");
        Assert.assertEquals(cartPage.getProductPrice("Sauce Labs Backpack"), "$29.99");

    }
}
