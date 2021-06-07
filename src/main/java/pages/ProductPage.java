package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends HeaderPage {

    public ProductPage(WebDriver driver){
        super(driver);
    }
    public static final String ADD_PRODUCT_TO_CART_BUTTON = "//*[text()='%s']/ancestor::*[@class='inventory_item']//button";

    @Step("Add {productName} to cart")
    public ProductPage addProductToCart(String productName) {
        driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName))).click();
        return this;
    }
    public String getAddToCartButtonText(String productName){
        return driver.findElement(By.xpath(String.format(ADD_PRODUCT_TO_CART_BUTTON, productName))).getText();
    }
}
