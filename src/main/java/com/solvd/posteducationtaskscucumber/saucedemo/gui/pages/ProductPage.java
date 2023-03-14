package com.solvd.posteducationtaskscucumber.saucedemo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

    @FindBy(xpath = "//*[text() = '%s']//ancestor::div[@class = 'inventory_item_description']//button[contains(@id, 'add-to-cart')]")
    private ExtendedWebElement addToCartButtonProduct;

    @FindBy(xpath = "//*[@class = 'title' and contains(text(), 'Products')]")
    private ExtendedWebElement productPageTitle;

    @FindBy(id = "shopping_cart_container")
    private ExtendedWebElement shoppingCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(productPageTitle);
    }

    public void clickAddToCartButton(String product) {
        addToCartButtonProduct.format(product).click();
    }

    public YourCartPage clickShoppingCartButton() {
        shoppingCartButton.click();
        return new YourCartPage(getDriver());
    }
}
