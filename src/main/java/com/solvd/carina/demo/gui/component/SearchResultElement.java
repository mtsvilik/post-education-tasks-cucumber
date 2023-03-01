package com.solvd.carina.demo.gui.component;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchResultElement extends AbstractUIObject {

    @FindBy(xpath = "//*[@class='LC20lb MBeuO DKV0Md']")
    private ExtendedWebElement title;

    public SearchResultElement(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getTitleText() {
        return title.getText();
    }
}
