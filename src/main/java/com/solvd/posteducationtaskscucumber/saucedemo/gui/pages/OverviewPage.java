package com.solvd.posteducationtaskscucumber.saucedemo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'title' and contains(text(), 'Checkout: Overview')]")
    private ExtendedWebElement overviewPageTitle;

    @FindBy(id = "finish")
    private ExtendedWebElement finishButton;

    public OverviewPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(overviewPageTitle);
    }

    public CompletePage clickFinishButton() {
        finishButton.click();
        return new CompletePage(getDriver());
    }
}
