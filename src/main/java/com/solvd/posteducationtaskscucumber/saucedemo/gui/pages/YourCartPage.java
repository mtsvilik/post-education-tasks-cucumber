package com.solvd.posteducationtaskscucumber.saucedemo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'title' and contains(text(), 'Your Cart')]")
    private ExtendedWebElement yourCartPageTitle;

    @FindBy(id = "checkout")
    private ExtendedWebElement checkoutButton;

    public YourCartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(yourCartPageTitle);
    }

    public YourInformationPage clickCheckoutButton() {
        checkoutButton.click();
        return new YourInformationPage(getDriver());
    }
}
