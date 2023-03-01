package com.solvd.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.utils.Configuration;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class GoogleHomePage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//*[@class='lnXdpd']")
    private ExtendedWebElement logo;

    @FindBy(xpath = "//*[@name='q']")
    private ExtendedWebElement searchBox;

    @FindBy(xpath = "//*[@jsname='Tg7LZd']")
    private ExtendedWebElement searchButton;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL(R.CONFIG.get(Configuration.Parameter.URL.getKey()));
    }

    public boolean showLogo() {
        return logo.isVisible();
    }

    public void inputText(String text) {
        searchBox.type(text);
    }

    public SearchResultPage clickEnter() {
        searchBox.sendKeys(Keys.ENTER);
        return new SearchResultPage(getDriver());
    }
}
