package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductPage;

public class ProductSteps {
    private LoginPage loginPage;
    private ProductPage productPage;

    public ProductSteps(WebDriver driver) {
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);

    }
    @Step("Login and add product to cart")
    public ProductSteps loginAndAddProduct(String username, String password, String productName){
        loginPage
                .openPage()
                .login(username, password)
                .addProductToCart(productName);
        return this;
    }
}
