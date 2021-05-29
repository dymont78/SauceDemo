package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void productQtyTest() {
        loginPage
                .openPage()
                .login("standard_user","secret_sauce")
                .addProductToCart("Sauce Labs Bolt T-Shirt");
        cartPage.openPage();
        String valueQty = cartPage.getProductQty("Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(valueQty,"1");
    }

    @Test
    public void buttonAddRemoveTest() {
        loginPage
                .openPage()
                .login("standard_user", "secret_sauce")
                .addProductToCart("Sauce Labs Backpack");
        String buttonText = productPage.getAddToCartButtonText("Sauce Labs Backpack");
        Assert.assertEquals(buttonText, "REMOVE");

    }
}
