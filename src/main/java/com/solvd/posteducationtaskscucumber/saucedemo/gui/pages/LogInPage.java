package com.solvd.posteducationtaskscucumber.saucedemo.gui.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends AbstractPage {

    @FindBy(id = "user-name")
    private ExtendedWebElement userNameField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordField;

    @FindBy(id = "login-button")
    private ExtendedWebElement loginButton;

    public LogInPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public void enterUserName(String userName) {
        userNameField.type(userName);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public ProductPage clickLoginButton() {
        loginButton.click();
        return new ProductPage(getDriver());
    }
}
