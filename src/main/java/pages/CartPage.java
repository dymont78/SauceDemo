package pages;

import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends HeaderPage {

    public CartPage(WebDriver driver) {
        super(driver);
    }
    private static final String PRODUCT_ITEM = "//*[text()='%s']/ancestor::*[@class='cart_item']";
    private static final String PRODUCT_PRICE = PRODUCT_ITEM + "//*[@class='inventory_item_price']";
    private static final String PRODUCT_QTY = PRODUCT_ITEM + "//*[@class='cart_quantity']";

    public CartPage openPage() {
        driver.get(CART_URL);
        return this;
    }

    public String getProductPrice(String productName) {
        return driver.findElement(By.xpath(String.format(PRODUCT_PRICE, productName))).getText();
    }
    public String getProductQty(String productName) {
        return driver.findElement(By.xpath(String.format(PRODUCT_QTY, productName))).getText();
    }
}
