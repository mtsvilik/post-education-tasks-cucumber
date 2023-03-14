package com.solvd.posteducationtaskscucumber.saucedemo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.PageOpeningStrategy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'title' and contains(text(), 'Checkout: Your Information')]")
    private ExtendedWebElement yourInformationPageTitle;

    @FindBy(id = "first-name")
    private ExtendedWebElement firstNameField;

    @FindBy(id = "last-name")
    private ExtendedWebElement lastNameField;

    @FindBy(id = "postal-code")
    private ExtendedWebElement zipCodeField;

    @FindBy(id = "continue")
    private ExtendedWebElement continueButton;

    public YourInformationPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(yourInformationPageTitle);

    }

    public void enterFirstName(String firstName) {
        firstNameField.type(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.type(lastName);
    }

    public void enterZipCode(Integer zipCode) {
        zipCodeField.type(String.valueOf(zipCode));
    }

    public OverviewPage clickContinueButton() {
        continueButton.click();
        return new OverviewPage(getDriver());
    }
}
