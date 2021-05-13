package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {
    @Test
    public void productQtyTest() {
        loginPage.openPage();
        loginPage.login("standard_user","secret_sauce");
        productPage.addProductToCart("Sauce Labs Bolt T-Shirt");
        cartPage.openPage();
        System.out.println(cartPage.getProductQty("Sauce Labs Bolt T-Shirt"));
        Assert.assertEquals(cartPage.getProductQty("Sauce Labs Bolt T-Shirt"),"1");
    }

    @Test
    public void buttonAddRemoveTest() {
        loginPage.openPage();
        loginPage.login("standard_user", "secret_sauce");
        productPage.addProductToCart("Sauce Labs Backpack");
        System.out.println(productPage.getAddToCartButtonText("Sauce Labs Backpack"));
        Assert.assertEquals(productPage.getAddToCartButtonText("Sauce Labs Backpack"), "REMOVE");

    }
}
