package com.solvd.posteducationtaskscucumber.saucedemo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'title' and contains(text(), 'Checkout: Complete!')]")
    private ExtendedWebElement completePageTitle;

    @FindBy(xpath = "//*[@class = 'complete-text']")
    private ExtendedWebElement completeText;

    public CompletePage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(completePageTitle);
    }

    public boolean isPresentCompleteText() {
        return completeText.isElementPresent();
    }
}
